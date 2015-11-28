package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V23Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup23;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v23_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup23 = (RadioGroup)findViewById(R.id.Rg_23);
//radioGroup11
        radioGroup23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a23 = bundle.getInt("A");
            Integer b23 = bundle.getInt("B");
            Integer c23 = bundle.getInt("C");
            Integer d23 = bundle.getInt("D");
            Integer e23 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g23:
//a11
                        a = a23 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V24Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b23);
                        i.putExtra("C", c23);
                        i.putExtra("D", d23);
                        i.putExtra("E", e23);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g23:
                        b = b23 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V24Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a23);
                        j.putExtra("C", c23);
                        j.putExtra("D", d23);
                        j.putExtra("E", e23);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g23:
                        c = c23 + 1;

                        Intent k = new Intent(getApplicationContext(), V24Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a23);
                        k.putExtra("B", b23);
                        k.putExtra("D", d23);
                        k.putExtra("E", e23);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g23:
                        d = d23 + 1;

                        Intent l = new Intent(getApplicationContext(), V24Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a23);
                        l.putExtra("B", b23);
                        l.putExtra("C", c23);
                        l.putExtra("E", e23);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g23:
                        e = e23 + 1;

                        Intent m = new Intent(getApplicationContext(), V24Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a23);
                        m.putExtra("B", b23);
                        m.putExtra("C", c23);
                        m.putExtra("D", d23);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
