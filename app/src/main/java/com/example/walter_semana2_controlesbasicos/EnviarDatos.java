package com.example.walter_semana2_controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText eNombre = (EditText)this.findViewById(R.id.etNombre2);
        final EditText eEdad = (EditText)this.findViewById(R.id.etEdad);
        Button bEnviar = (Button)this.findViewById(R.id.btEnviar);
        Button bAtras = (Button)this.findViewById(R.id.btAtras);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle PasarDatos = new Bundle();
                PasarDatos.putString("pNombre",nombre);
                PasarDatos.putString("pEdad",edad);
                Intent siga = new Intent(EnviarDatos.this,RecibirDatos.class);
                siga.putExtras(PasarDatos);
                startActivity(siga);
            }
        });

        bAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras = new Intent(EnviarDatos.this, Principal.class);
                startActivity(atras);
            }
        });


    }
}