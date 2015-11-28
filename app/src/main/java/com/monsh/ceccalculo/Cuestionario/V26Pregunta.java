package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V26Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup26;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v26_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup26 = (RadioGroup)findViewById(R.id.Rg_26);
//radioGroup11
        radioGroup26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a26 = bundle.getInt("A");
            Integer b26 = bundle.getInt("B");
            Integer c26 = bundle.getInt("C");
            Integer d26 = bundle.getInt("D");
            Integer e26 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g26:
//a11
                        a = a26 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V27Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b26);
                        i.putExtra("C", c26);
                        i.putExtra("D", d26);
                        i.putExtra("E", e26);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g26:
                        b = b26 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V27Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a26);
                        j.putExtra("C", c26);
                        j.putExtra("D", d26);
                        j.putExtra("E", e26);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g26:
                        c = c26 + 1;

                        Intent k = new Intent(getApplicationContext(), V27Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a26);
                        k.putExtra("B", b26);
                        k.putExtra("D", d26);
                        k.putExtra("E", e26);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g26:
                        d = d26 + 1;

                        Intent l = new Intent(getApplicationContext(), V27Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a26);
                        l.putExtra("B", b26);
                        l.putExtra("C", c26);
                        l.putExtra("E", e26);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g26:
                        e = e26 + 1;

                        Intent m = new Intent(getApplicationContext(), V27Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a26);
                        m.putExtra("B", b26);
                        m.putExtra("C", c26);
                        m.putExtra("D", d26);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
