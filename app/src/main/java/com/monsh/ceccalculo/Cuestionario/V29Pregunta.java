package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V29Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup29;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v29_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup29 = (RadioGroup)findViewById(R.id.Rg_29);
//radioGroup11
        radioGroup29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a29 = bundle.getInt("A");
            Integer b29 = bundle.getInt("B");
            Integer c29 = bundle.getInt("C");
            Integer d29 = bundle.getInt("D");
            Integer e29 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g29:
//a11
                        a = a29 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), T30Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b29);
                        i.putExtra("C", c29);
                        i.putExtra("D", d29);
                        i.putExtra("E", e29);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g29:
                        b = b29 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), T30Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a29);
                        j.putExtra("C", c29);
                        j.putExtra("D", d29);
                        j.putExtra("E", e29);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g29:
                        c = c29 + 1;

                        Intent k = new Intent(getApplicationContext(), T30Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a29);
                        k.putExtra("B", b29);
                        k.putExtra("D", d29);
                        k.putExtra("E", e29);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g29:
                        d = d29 + 1;

                        Intent l = new Intent(getApplicationContext(), T30Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a29);
                        l.putExtra("B", b29);
                        l.putExtra("C", c29);
                        l.putExtra("E", e29);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g29:
                        e = e29 + 1;

                        Intent m = new Intent(getApplicationContext(), T30Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a29);
                        m.putExtra("B", b29);
                        m.putExtra("C", c29);
                        m.putExtra("D", d29);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
