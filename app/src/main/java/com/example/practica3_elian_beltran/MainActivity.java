package com.example.practica3_elian_beltran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNombre;
    EditText Tel;
    EditText Twi;
    EditText Correo;
    Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.bt_login);
        miBoton.setOnClickListener(clik);

        //Recibe datos de usuario
        edNombre= findViewById(R.id.et_name);
        Bundle usa= getIntent().getExtras();
        if(usa != null ){
        edNombre.setText(usa.getString("name"));}

        Tel= findViewById(R.id.et_telefono);
        Bundle tele= getIntent().getExtras();
        if(usa != null ){
            Tel.setText(usa.getString("telefono"));}

        Twi= findViewById(R.id.et_twitter);
        Bundle tw= getIntent().getExtras();
        if(usa != null ){
            Twi.setText(usa.getString("twitt"));}

        Correo= findViewById(R.id.et_email);
        Bundle correo= getIntent().getExtras();
        if(usa != null ){
            Correo.setText(usa.getString("Corr"));}

    }


    View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            edNombre= findViewById(R.id.et_name);
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            String nombre= String.valueOf(edNombre.getText());
            intent.putExtra("usuario", nombre);
            startActivity(intent);

            Tel= findViewById(R.id.et_telefono);
            String cel= String.valueOf(Tel.getText());
            intent.putExtra("tel",cel);
            startActivity(intent);

            Twi= findViewById(R.id.et_twitter);
            String twit= String.valueOf(Twi.getText());
            intent.putExtra("Twi",twit);
            startActivity(intent);

            Correo= findViewById(R.id.et_email);
            String correo= String.valueOf(Correo.getText());
            intent.putExtra("email",correo);
            startActivity(intent);

        }
    };

}