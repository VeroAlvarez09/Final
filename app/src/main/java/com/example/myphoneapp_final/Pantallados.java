package com.example.myphoneapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pantallados extends AppCompatActivity {

    TextView textViewNombre, textViewTelefono, textViewEmail;
    Button buttonLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallados);

        textViewNombre = findViewById(R.id.textViewNombre);
        textViewTelefono = findViewById(R.id.textViewTelefono);
        textViewEmail = findViewById(R.id.textViewEmail);
        buttonLlamar = findViewById(R.id.buttonLlamar);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String telefono = intent.getStringExtra("telefono");
        String email = intent.getStringExtra("email");

        textViewNombre.setText("Nombre: " + nombre);
        textViewTelefono.setText("Teléfono: " + telefono);
        textViewEmail.setText("Email: " + email);

        buttonLlamar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentLlamar = new Intent(Intent.ACTION_DIAL);
                intentLlamar.setData(Uri.parse("tel:" + telefono));
                startActivity(intentLlamar);
            }
        });
    }
}