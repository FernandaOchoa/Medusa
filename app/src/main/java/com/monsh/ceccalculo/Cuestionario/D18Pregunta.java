package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class D18Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup18;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_d18_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup18 = (RadioGroup)findViewById(R.id.Rg_18);
//radioGroup11
        radioGroup18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a18 = bundle.getInt("A");
            Integer b18 = bundle.getInt("B");
            Integer c18 = bundle.getInt("C");
            Integer d18 = bundle.getInt("D");
            Integer e18 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g18:
//a11
                        a = a18 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), D19Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b18);
                        i.putExtra("C", c18);
                        i.putExtra("D", d18);
                        i.putExtra("E", e18);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g18:
                        b = b18 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), D19Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a18);
                        j.putExtra("C", c18);
                        j.putExtra("D", d18);
                        j.putExtra("E", e18);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g18:
                        c = c18 + 1;

                        Intent k = new Intent(getApplicationContext(), D19Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a18);
                        k.putExtra("B", b18);
                        k.putExtra("D", d18);
                        k.putExtra("E", e18);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g18:
                        d = d18 + 1;

                        Intent l = new Intent(getApplicationContext(), D19Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a18);
                        l.putExtra("B", b18);
                        l.putExtra("C", c18);
                        l.putExtra("E", e18);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g18:
                        e = e18 + 1;

                        Intent m = new Intent(getApplicationContext(), D19Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a18);
                        m.putExtra("B", b18);
                        m.putExtra("C", c18);
                        m.putExtra("D", d18);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
