package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class D19Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup19;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_d19_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup19 = (RadioGroup)findViewById(R.id.Rg_19);
//radioGroup11
        radioGroup19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a19 = bundle.getInt("A");
            Integer b19 = bundle.getInt("B");
            Integer c19 = bundle.getInt("C");
            Integer d19 = bundle.getInt("D");
            Integer e19 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g19:
//a11
                        a = a19 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V20Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b19);
                        i.putExtra("C", c19);
                        i.putExtra("D", d19);
                        i.putExtra("E", e19);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g19:
                        b = b19 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V20Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a19);
                        j.putExtra("C", c19);
                        j.putExtra("D", d19);
                        j.putExtra("E", e19);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g19:
                        c = c19 + 1;

                        Intent k = new Intent(getApplicationContext(), V20Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a19);
                        k.putExtra("B", b19);
                        k.putExtra("D", d19);
                        k.putExtra("E", e19);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g19:
                        d = d19 + 1;

                        Intent l = new Intent(getApplicationContext(), V20Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a19);
                        l.putExtra("B", b19);
                        l.putExtra("C", c19);
                        l.putExtra("E", e19);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g19:
                        e = e19 + 1;

                        Intent m = new Intent(getApplicationContext(), V20Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a19);
                        m.putExtra("B", b19);
                        m.putExtra("C", c19);
                        m.putExtra("D", d19);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
