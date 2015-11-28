package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V27Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup27;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v27_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup27 = (RadioGroup)findViewById(R.id.Rg_27);
//radioGroup11
        radioGroup27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a27 = bundle.getInt("A");
            Integer b27 = bundle.getInt("B");
            Integer c27 = bundle.getInt("C");
            Integer d27 = bundle.getInt("D");
            Integer e27 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g27:
//a11
                        a = a27 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V28Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b27);
                        i.putExtra("C", c27);
                        i.putExtra("D", d27);
                        i.putExtra("E", e27);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g27:
                        b = b27 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V28Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a27);
                        j.putExtra("C", c27);
                        j.putExtra("D", d27);
                        j.putExtra("E", e27);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g27:
                        c = c27 + 1;

                        Intent k = new Intent(getApplicationContext(), V28Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a27);
                        k.putExtra("B", b27);
                        k.putExtra("D", d27);
                        k.putExtra("E", e27);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g27:
                        d = d27 + 1;

                        Intent l = new Intent(getApplicationContext(), V28Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a27);
                        l.putExtra("B", b27);
                        l.putExtra("C", c27);
                        l.putExtra("E", e27);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g27:
                        e = e27 + 1;

                        Intent m = new Intent(getApplicationContext(), V28Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a27);
                        m.putExtra("B", b27);
                        m.putExtra("C", c27);
                        m.putExtra("D", d27);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
