package com.example.practica3_elian_beltran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nameUser;
    TextView cel;
    TextView twitter;
    TextView Correo;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle valore= getIntent().getExtras();
        String user= valore.getString("usuario");
        nameUser= findViewById(R.id.user);
        nameUser.setText(user);

        Bundle phone= getIntent().getExtras();
        String Tel= phone.getString("tel");
        cel= findViewById(R.id.Tel);
        cel.setText(Tel);

        Bundle twi= getIntent().getExtras();
        String twitte= twi.getString("Twi");
        twitter= findViewById(R.id.Twitter);
        twitter.setText(twitte);

        Bundle email= getIntent().getExtras();
        String Ema= email.getString("email");
        Correo= findViewById(R.id.Correo);
        Correo.setText(Ema);

        siguiente= findViewById(R.id.bt_regreso);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresa=new Intent(MainActivity2.this,MainActivity.class);
                String nombre= String.valueOf(nameUser.getText());
                regresa.putExtra("name",nombre);

                String tel= String.valueOf(cel.getText());
                regresa.putExtra("telefono",tel);

                String Twi= String.valueOf(twitter.getText());
                regresa.putExtra("twitt",Twi);

                String Co= String.valueOf(Correo.getText());
                regresa.putExtra("Corr",Co);

                startActivity(regresa);
            }
        });
    }
}