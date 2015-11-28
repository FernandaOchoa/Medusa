package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class DocePregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup12;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_doce_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup12 = (RadioGroup)findViewById(R.id.Rg_12);
//radioGroup11
        radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a12 = bundle.getInt("A");
            Integer b12 = bundle.getInt("B");
            Integer c12 = bundle.getInt("C");
            Integer d12 = bundle.getInt("D");
            Integer e12 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g12:
//a11
                        a = a12 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), TrecePregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b12);
                        i.putExtra("C", c12);
                        i.putExtra("D", d12);
                        i.putExtra("E", e12);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g12:
                        b = b12 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), TrecePregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a12);
                        j.putExtra("C", c12);
                        j.putExtra("D", d12);
                        j.putExtra("E", e12);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g12:
                        c = c12 + 1;

                        Intent k = new Intent(getApplicationContext(), TrecePregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a12);
                        k.putExtra("B", b12);
                        k.putExtra("D", d12);
                        k.putExtra("E", e12);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g12:
                        d = d12 + 1;

                        Intent l = new Intent(getApplicationContext(), TrecePregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a12);
                        l.putExtra("B", b12);
                        l.putExtra("C", c12);
                        l.putExtra("E", e12);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g12:
                        e = e12 + 1;

                        Intent m = new Intent(getApplicationContext(), TrecePregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a12);
                        m.putExtra("B", b12);
                        m.putExtra("C", c12);
                        m.putExtra("D", d12);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
