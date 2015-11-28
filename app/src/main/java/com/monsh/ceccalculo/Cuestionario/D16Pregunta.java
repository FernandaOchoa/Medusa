package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class D16Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup16;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_d16_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup16 = (RadioGroup)findViewById(R.id.Rg_16);
//radioGroup11
        radioGroup16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a16 = bundle.getInt("A");
            Integer b16 = bundle.getInt("B");
            Integer c16 = bundle.getInt("C");
            Integer d16 = bundle.getInt("D");
            Integer e16 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g16:
//a11
                        a = a16 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), D17Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b16);
                        i.putExtra("C", c16);
                        i.putExtra("D", d16);
                        i.putExtra("E", e16);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g16:
                        b = b16 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), D17Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a16);
                        j.putExtra("C", c16);
                        j.putExtra("D", d16);
                        j.putExtra("E", e16);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g16:
                        c = c16 + 1;

                        Intent k = new Intent(getApplicationContext(), D17Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a16);
                        k.putExtra("B", b16);
                        k.putExtra("D", d16);
                        k.putExtra("E", e16);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g16:
                        d = d16 + 1;

                        Intent l = new Intent(getApplicationContext(), D17Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a16);
                        l.putExtra("B", b16);
                        l.putExtra("C", c16);
                        l.putExtra("E", e16);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g16:
                        e = e16 + 1;

                        Intent m = new Intent(getApplicationContext(), D17Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a16);
                        m.putExtra("B", b16);
                        m.putExtra("C", c16);
                        m.putExtra("D", d16);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
