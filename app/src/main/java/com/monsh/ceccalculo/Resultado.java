package com.monsh.ceccalculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {
    TextView carrera1;
    TextView carrera2;
    TextView carrera3;
    TextView carrera4;
    TextView carrera5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        carrera1 = (TextView) findViewById(R.id.tv_carrera1);
        carrera2 = (TextView) findViewById(R.id.tv_carrera2);
        carrera3 = (TextView) findViewById(R.id.tv_carrera3);
        carrera4 = (TextView) findViewById(R.id.tv_carrera4);
        carrera5 = (TextView) findViewById(R.id.tv_carrera5);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        Integer a = bundle.getInt("A");
        Integer b = bundle.getInt("B");
        Integer c = bundle.getInt("C");
        Integer d = bundle.getInt("D");
        Integer e = bundle.getInt("E");

        if (a > b && a > c && a > d && a > e) {
            carrera1.setText("Lic. en Arquitectura");
            carrera2.setText("Lic. en Diseño Grafico");

            Toast.makeText(getApplicationContext(), "A es mayor", Toast.LENGTH_SHORT).show();
        } else if (b > a && b > c && b > d && b > e) {
            carrera1.setText("Ing. Quimica");

            Toast.makeText(getApplicationContext(), "B es mayor", Toast.LENGTH_SHORT).show();
        } else if (c > a && c > b && c > d && c > e) {

            carrera1.setText("Ing. en Sistemas Computacionales");
            Toast.makeText(getApplicationContext(), "C es mayor", Toast.LENGTH_SHORT).show();
        } else if (d > a && d > b && d > c && d > e) {
            carrera1.setText("Lic. en Psicologia");
            carrera2.setText("Lic. en Educacion");
            Toast.makeText(getApplicationContext(), "D es mayor", Toast.LENGTH_SHORT).show();
        } else //if (e>a && e>b && e>c && e>d){
            carrera1.setText("Lic. en Contador Publico");
        carrera2.setText("Lic. en Administracion de Empresas");
        carrera3.setText("Lic. en Comercio Internacional");
        carrera4.setText("Lic. en Turismo");
        carrera5.setText("Lic. en Mercadotecnia");
        Toast.makeText(getApplicationContext(), "E es mayor", Toast.LENGTH_SHORT).show();
    //}
    }
}
