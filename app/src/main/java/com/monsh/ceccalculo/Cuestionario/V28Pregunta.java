package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

// class OncePregunta (D16,V21,V22,T30)
public class V28Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup28;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_v28_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup28 = (RadioGroup)findViewById(R.id.Rg_28);
//radioGroup11
        radioGroup28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a28 = bundle.getInt("A");
            Integer b28 = bundle.getInt("B");
            Integer c28 = bundle.getInt("C");
            Integer d28 = bundle.getInt("D");
            Integer e28 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g28:
//a11
                        a = a28 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), V29Pregunta.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b28);
                        i.putExtra("C", c28);
                        i.putExtra("D", d28);
                        i.putExtra("E", e28);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g28:
                        b = b28 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), V29Pregunta.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a28);
                        j.putExtra("C", c28);
                        j.putExtra("D", d28);
                        j.putExtra("E", e28);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g28:
                        c = c28 + 1;

                        Intent k = new Intent(getApplicationContext(), V29Pregunta.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a28);
                        k.putExtra("B", b28);
                        k.putExtra("D", d28);
                        k.putExtra("E", e28);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g28:
                        d = d28 + 1;

                        Intent l = new Intent(getApplicationContext(), V29Pregunta.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a28);
                        l.putExtra("B", b28);
                        l.putExtra("C", c28);
                        l.putExtra("E", e28);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g28:
                        e = e28 + 1;

                        Intent m = new Intent(getApplicationContext(), V29Pregunta.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a28);
                        m.putExtra("B", b28);
                        m.putExtra("C", c28);
                        m.putExtra("D", d28);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
