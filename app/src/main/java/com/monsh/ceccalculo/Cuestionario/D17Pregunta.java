package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class D17Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup17;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_d17_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup17 = (RadioGroup)findViewById(R.id.Rg_17);
//radioGroup11
        radioGroup17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a17 = bundle.getInt("A");
            Integer b17 = bundle.getInt("B");
            Integer c17 = bundle.getInt("C");
            Integer d17 = bundle.getInt("D");
            Integer e17 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g17:
//a11
                        a = a17 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), D18Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b17);
                        i.putExtra("C", c17);
                        i.putExtra("D", d17);
                        i.putExtra("E", e17);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g17:
                        b = b17 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), D18Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a17);
                        j.putExtra("C", c17);
                        j.putExtra("D", d17);
                        j.putExtra("E", e17);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g17:
                        c = c17 + 1;

                        Intent k = new Intent(getApplicationContext(), D18Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a17);
                        k.putExtra("B", b17);
                        k.putExtra("D", d17);
                        k.putExtra("E", e17);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g17:
                        d = d17 + 1;

                        Intent l = new Intent(getApplicationContext(), D18Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a17);
                        l.putExtra("B", b17);
                        l.putExtra("C", c17);
                        l.putExtra("E", e17);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g17:
                        e = e17 + 1;

                        Intent m = new Intent(getApplicationContext(), D18Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a17);
                        m.putExtra("B", b17);
                        m.putExtra("C", c17);
                        m.putExtra("D", d17);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
