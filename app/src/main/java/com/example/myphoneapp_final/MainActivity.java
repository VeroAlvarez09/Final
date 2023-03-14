package com.example.myphoneapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nombre, Telefono, Email;
    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Date1);
        Telefono = findViewById(R.id.Date2);
        Email = findViewById(R.id.Date3);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = Nombre.getText().toString();
                String telefono = Telefono.getText().toString();
                String email = Email.getText().toString();

                Intent intent = new Intent(MainActivity.this, Pantallados.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("telefono", telefono);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}
