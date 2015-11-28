package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class TrecePregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup13;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_trece_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup13 = (RadioGroup)findViewById(R.id.Rg_13);
//radioGroup11
        radioGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a13 = bundle.getInt("A");
            Integer b13 = bundle.getInt("B");
            Integer c13 = bundle.getInt("C");
            Integer d13 = bundle.getInt("D");
            Integer e13 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g13:
//a11
                        a = a13 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), CatorcePregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b13);
                        i.putExtra("C", c13);
                        i.putExtra("D", d13);
                        i.putExtra("E", e13);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g13:
                        b = b13 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), CatorcePregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a13);
                        j.putExtra("C", c13);
                        j.putExtra("D", d13);
                        j.putExtra("E", e13);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g13:
                        c = c13 + 1;

                        Intent k = new Intent(getApplicationContext(), CatorcePregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a13);
                        k.putExtra("B", b13);
                        k.putExtra("D", d13);
                        k.putExtra("E", e13);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g13:
                        d = d13 + 1;

                        Intent l = new Intent(getApplicationContext(), CatorcePregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a13);
                        l.putExtra("B", b13);
                        l.putExtra("C", c13);
                        l.putExtra("E", e13);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g13:
                        e = e13 + 1;

                        Intent m = new Intent(getApplicationContext(), CatorcePregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a13);
                        m.putExtra("B", b13);
                        m.putExtra("C", c13);
                        m.putExtra("D", d13);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
