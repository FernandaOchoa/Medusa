package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class OncePregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup11;
    Integer a = 0, b = 0, c = 0, d = 0, e = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_once_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup11 = (RadioGroup) findViewById(R.id.Rg_11);
//radioGroup11
        radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a11 = bundle.getInt("A");
            Integer b11 = bundle.getInt("B");
            Integer c11 = bundle.getInt("C");
            Integer d11 = bundle.getInt("D");
            Integer e11 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g11:
//a11
                        a = a11 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), DocePregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b11);
                        i.putExtra("C", c11);
                        i.putExtra("D", d11);
                        i.putExtra("E", e11);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g11:
                        b = b11 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), DocePregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a11);
                        j.putExtra("C", c11);
                        j.putExtra("D", d11);
                        j.putExtra("E", e11);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g11:
                        c = c11 + 1;

                        Intent k = new Intent(getApplicationContext(), DocePregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a11);
                        k.putExtra("B", b11);
                        k.putExtra("D", d11);
                        k.putExtra("E", e11);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g11:
                        d = d11 + 1;

                        Intent l = new Intent(getApplicationContext(), DocePregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a11);
                        l.putExtra("B", b11);
                        l.putExtra("C", c11);
                        l.putExtra("E", e11);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g11:
                        e = e11 + 1;

                        Intent m = new Intent(getApplicationContext(), DocePregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a11);
                        m.putExtra("B", b11);
                        m.putExtra("C", c11);
                        m.putExtra("D", d11);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
