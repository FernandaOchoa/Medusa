package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V20Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup20;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v20_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup20 = (RadioGroup)findViewById(R.id.Rg_20);
//radioGroup11
        radioGroup20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a20 = bundle.getInt("A");
            Integer b20 = bundle.getInt("B");
            Integer c20 = bundle.getInt("C");
            Integer d20 = bundle.getInt("D");
            Integer e20 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g20:
//a11
                        a = a20 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V21Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b20);
                        i.putExtra("C", c20);
                        i.putExtra("D", d20);
                        i.putExtra("E", e20);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g20:
                        b = b20 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V21Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a20);
                        j.putExtra("C", c20);
                        j.putExtra("D", d20);
                        j.putExtra("E", e20);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g20:
                        c = c20 + 1;

                        Intent k = new Intent(getApplicationContext(), V21Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a20);
                        k.putExtra("B", b20);
                        k.putExtra("D", d20);
                        k.putExtra("E", e20);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g20:
                        d = d20 + 1;

                        Intent l = new Intent(getApplicationContext(), V21Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a20);
                        l.putExtra("B", b20);
                        l.putExtra("C", c20);
                        l.putExtra("E", e20);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g20:
                        e = e20 + 1;

                        Intent m = new Intent(getApplicationContext(), V21Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a20);
                        m.putExtra("B", b20);
                        m.putExtra("C", c20);
                        m.putExtra("D", d20);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}

