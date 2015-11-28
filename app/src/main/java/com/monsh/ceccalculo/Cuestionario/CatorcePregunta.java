package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class CatorcePregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup14;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_catorce_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup14 = (RadioGroup)findViewById(R.id.Rg_14);
//radioGroup11
        radioGroup14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a14 = bundle.getInt("A");
            Integer b14 = bundle.getInt("B");
            Integer c14 = bundle.getInt("C");
            Integer d14 = bundle.getInt("D");
            Integer e14 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g14:
//a11
                        a = a14 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), QuincePregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b14);
                        i.putExtra("C", c14);
                        i.putExtra("D", d14);
                        i.putExtra("E", e14);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g14:
                        b = b14 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), QuincePregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a14);
                        j.putExtra("C", c14);
                        j.putExtra("D", d14);
                        j.putExtra("E", e14);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g14:
                        c = c14 + 1;

                        Intent k = new Intent(getApplicationContext(), QuincePregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a14);
                        k.putExtra("B", b14);
                        k.putExtra("D", d14);
                        k.putExtra("E", e14);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g14:
                        d = d14 + 1;

                        Intent l = new Intent(getApplicationContext(), QuincePregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a14);
                        l.putExtra("B", b14);
                        l.putExtra("C", c14);
                        l.putExtra("E", e14);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g14:
                        e = e14 + 1;

                        Intent m = new Intent(getApplicationContext(), QuincePregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a14);
                        m.putExtra("B", b14);
                        m.putExtra("C", c14);
                        m.putExtra("D", d14);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
