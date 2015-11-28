package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class SegundaPregunta extends AppCompatActivity {
    RadioGroup radioGroup2;
    Integer a = 0, b = 0, c = 0, d = 0, e = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pregunta);

        radioGroup2 = (RadioGroup) findViewById(R.id.Rg_2);

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent inn = getIntent();
            Bundle bundle = inn.getExtras();
            Integer a2 = bundle.getInt("A");
            Integer b2 = bundle.getInt("B");
            Integer c2 = bundle.getInt("C");
            Integer d2 = bundle.getInt("D");
            Integer e2 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbtn_1g2:
                        a = a2 + 1;

                        Intent i = new Intent(getApplicationContext(), TerceraPregunta.class);
                        i.putExtra("A", a);
                        i.putExtra("B",b2);
                        i.putExtra("C",c2);
                        i.putExtra("D",d2);
                        i.putExtra("E",e2);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();

                        startActivity(i);
                        break;
                    case R.id.rbtn_2g2:
                        b = b2 + 1;

                        Intent j = new Intent(getApplicationContext(), TerceraPregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A",a2);
                        j.putExtra("C",c2);
                        j.putExtra("D",d2);
                        j.putExtra("E",e2);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();

                        startActivity(j);
                        break;
                    case R.id.rbtn_3g2:
                        c = c2 + 1;

                        Intent k = new Intent(getApplicationContext(), TerceraPregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a2);
                        k.putExtra("B", b2);
                        k.putExtra("D", d2);
                        k.putExtra("E", e2);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();

                        startActivity(k);
                        break;
                    case R.id.rbtn_4g2:
                        d = d2 + 1;

                        Intent l = new Intent(getApplicationContext(), TerceraPregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a2);
                        l.putExtra("B", b2);
                        l.putExtra("C", c2);
                        l.putExtra("E", e2);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();

                        startActivity(l);
                        break;
                    case R.id.rbtn_5g2:
                        e = e2 + 1;

                        Intent m = new Intent(getApplicationContext(), TerceraPregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a2);
                        m.putExtra("B", b2);
                        m.putExtra("C", c2);
                        m.putExtra("D", d2);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });
    }
}
