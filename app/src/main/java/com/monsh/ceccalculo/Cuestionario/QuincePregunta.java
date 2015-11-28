package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class QuincePregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup15;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_quince_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup15 = (RadioGroup)findViewById(R.id.Rg_15);
//radioGroup11
        radioGroup15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a15 = bundle.getInt("A");
            Integer b15 = bundle.getInt("B");
            Integer c15 = bundle.getInt("C");
            Integer d15 = bundle.getInt("D");
            Integer e15 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g15:
//a11
                        a = a15 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), D16Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b15);
                        i.putExtra("C", c15);
                        i.putExtra("D", d15);
                        i.putExtra("E", e15);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g15:
                        b = b15 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), D16Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a15);
                        j.putExtra("C", c15);
                        j.putExtra("D", d15);
                        j.putExtra("E", e15);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g15:
                        c = c15 + 1;

                        Intent k = new Intent(getApplicationContext(), D16Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a15);
                        k.putExtra("B", b15);
                        k.putExtra("D", d15);
                        k.putExtra("E", e15);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g15:
                        d = d15 + 1;

                        Intent l = new Intent(getApplicationContext(), D16Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a15);
                        l.putExtra("B", b15);
                        l.putExtra("C", c15);
                        l.putExtra("E", e15);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g15:
                        e = e15 + 1;

                        Intent m = new Intent(getApplicationContext(), D16Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a15);
                        m.putExtra("B", b15);
                        m.putExtra("C", c15);
                        m.putExtra("D", d15);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
