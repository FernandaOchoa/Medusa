package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V24Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup24;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v24_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup24 = (RadioGroup)findViewById(R.id.Rg_24);
//radioGroup11
        radioGroup24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a24 = bundle.getInt("A");
            Integer b24 = bundle.getInt("B");
            Integer c24 = bundle.getInt("C");
            Integer d24 = bundle.getInt("D");
            Integer e24 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g24:
//a11
                        a = a24 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V25Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b24);
                        i.putExtra("C", c24);
                        i.putExtra("D", d24);
                        i.putExtra("E", e24);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g24:
                        b = b24 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V25Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a24);
                        j.putExtra("C", c24);
                        j.putExtra("D", d24);
                        j.putExtra("E", e24);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g24:
                        c = c24 + 1;

                        Intent k = new Intent(getApplicationContext(), V25Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a24);
                        k.putExtra("B", b24);
                        k.putExtra("D", d24);
                        k.putExtra("E", e24);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g24:
                        d = d24 + 1;

                        Intent l = new Intent(getApplicationContext(), V25Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a24);
                        l.putExtra("B", b24);
                        l.putExtra("C", c24);
                        l.putExtra("E", e24);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g24:
                        e = e24 + 1;

                        Intent m = new Intent(getApplicationContext(), V25Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a24);
                        m.putExtra("B", b24);
                        m.putExtra("C", c24);
                        m.putExtra("D", d24);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
