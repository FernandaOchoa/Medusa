package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V22Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup22;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v22_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup22 = (RadioGroup)findViewById(R.id.Rg_22);
//radioGroup11
        radioGroup22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a22 = bundle.getInt("A");
            Integer b22 = bundle.getInt("B");
            Integer c22 = bundle.getInt("C");
            Integer d22 = bundle.getInt("D");
            Integer e22 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g22:
//a11
                        a = a22 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V23Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b22);
                        i.putExtra("C", c22);
                        i.putExtra("D", d22);
                        i.putExtra("E", e22);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g22:
                        b = b22 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V23Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a22);
                        j.putExtra("C", c22);
                        j.putExtra("D", d22);
                        j.putExtra("E", e22);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g22:
                        c = c22 + 1;

                        Intent k = new Intent(getApplicationContext(), V23Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a22);
                        k.putExtra("B", b22);
                        k.putExtra("D", d22);
                        k.putExtra("E", e22);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g22:
                        d = d22 + 1;

                        Intent l = new Intent(getApplicationContext(), V23Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a22);
                        l.putExtra("B", b22);
                        l.putExtra("C", c22);
                        l.putExtra("E", e22);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g22:
                        e = e22 + 1;

                        Intent m = new Intent(getApplicationContext(), V23Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a22);
                        m.putExtra("B", b22);
                        m.putExtra("C", c22);
                        m.putExtra("D", d22);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
