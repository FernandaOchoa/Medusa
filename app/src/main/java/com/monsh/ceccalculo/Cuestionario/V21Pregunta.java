package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V21Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup21;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v21_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup21 = (RadioGroup)findViewById(R.id.Rg_21);
//radioGroup11
        radioGroup21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a21 = bundle.getInt("A");
            Integer b21 = bundle.getInt("B");
            Integer c21 = bundle.getInt("C");
            Integer d21 = bundle.getInt("D");
            Integer e21 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g21:
//a11
                        a = a21 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V22Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b21);
                        i.putExtra("C", c21);
                        i.putExtra("D", d21);
                        i.putExtra("E", e21);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g21:
                        b = b21 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V22Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a21);
                        j.putExtra("C", c21);
                        j.putExtra("D", d21);
                        j.putExtra("E", e21);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g21:
                        c = c21 + 1;

                        Intent k = new Intent(getApplicationContext(), V22Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a21);
                        k.putExtra("B", b21);
                        k.putExtra("D", d21);
                        k.putExtra("E", e21);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g21:
                        d = d21 + 1;

                        Intent l = new Intent(getApplicationContext(), V22Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a21);
                        l.putExtra("B", b21);
                        l.putExtra("C", c21);
                        l.putExtra("E", e21);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g21:
                        e = e21 + 1;

                        Intent m = new Intent(getApplicationContext(), V22Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a21);
                        m.putExtra("B", b21);
                        m.putExtra("C", c21);
                        m.putExtra("D", d21);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}

