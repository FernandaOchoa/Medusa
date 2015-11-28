package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V25Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup25;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v25_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup25 = (RadioGroup)findViewById(R.id.Rg_25);
//radioGroup11
        radioGroup25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a25 = bundle.getInt("A");
            Integer b25 = bundle.getInt("B");
            Integer c25 = bundle.getInt("C");
            Integer d25 = bundle.getInt("D");
            Integer e25 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g25:
//a11
                        a = a25 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V26Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b25);
                        i.putExtra("C", c25);
                        i.putExtra("D", d25);
                        i.putExtra("E", e25);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g25:
                        b = b25 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V26Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a25);
                        j.putExtra("C", c25);
                        j.putExtra("D", d25);
                        j.putExtra("E", e25);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g25:
                        c = c25 + 1;

                        Intent k = new Intent(getApplicationContext(), V26Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a25);
                        k.putExtra("B", b25);
                        k.putExtra("D", d25);
                        k.putExtra("E", e25);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g25:
                        d = d25 + 1;

                        Intent l = new Intent(getApplicationContext(), V26Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a25);
                        l.putExtra("B", b25);
                        l.putExtra("C", c25);
                        l.putExtra("E", e25);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g25:
                        e = e25 + 1;

                        Intent m = new Intent(getApplicationContext(), V26Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a25);
                        m.putExtra("B", b25);
                        m.putExtra("C", c25);
                        m.putExtra("D", d25);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
