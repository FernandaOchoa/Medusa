package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.Cuestionario.CuartaPregunta;
import com.monsh.ceccalculo.R;

public class TerceraPregunta extends AppCompatActivity {
    RadioGroup radioGroup3;
    Integer a = 0, b = 0, c = 0, d = 0, e = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_pregunta);

        radioGroup3 = (RadioGroup) findViewById(R.id.Rg_3);
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent inn = getIntent();
            Bundle bundle = inn.getExtras();
            Integer a3 = bundle.getInt("A");
            Integer b3 = bundle.getInt("B");
            Integer c3 = bundle.getInt("C");
            Integer d3 = bundle.getInt("D");
            Integer e3 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbtn_1g3:
                        a = a3 + 1;

                        Intent i = new Intent(getApplicationContext(), CuartaPregunta.class);
                        i.putExtra("A", a);
                        i.putExtra("B",b3);
                        i.putExtra("C",c3);
                        i.putExtra("D",d3);
                        i.putExtra("E",e3);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();

                        startActivity(i);
                        break;
                    case R.id.rbtn_2g3:
                        b = b3 + 1;

                        Intent j = new Intent(getApplicationContext(), CuartaPregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A",a3);
                        j.putExtra("C",c3);
                        j.putExtra("D",d3);
                        j.putExtra("E",e3);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();

                        startActivity(j);
                        break;
                    case R.id.rbtn_3g3:
                        c = c3 + 1;

                        Intent k = new Intent(getApplicationContext(), CuartaPregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a3);
                        k.putExtra("B", b3);
                        k.putExtra("D", d3);
                        k.putExtra("E", e3);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();

                        startActivity(k);
                        break;
                    case R.id.rbtn_4g3:
                        d = d3 + 1;

                        Intent l = new Intent(getApplicationContext(), CuartaPregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a3);
                        l.putExtra("B", b3);
                        l.putExtra("C", c3);
                        l.putExtra("E", e3);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();

                        startActivity(l);
                        break;
                    case R.id.rbtn_5g3:
                        e = e3 + 1;

                        Intent m = new Intent(getApplicationContext(), CuartaPregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a3);
                        m.putExtra("B", b3);
                        m.putExtra("C", c3);
                        m.putExtra("D", d3);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });
    }
}
