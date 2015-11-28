package com.monsh.ceccalculo.Cuestionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;
import com.monsh.ceccalculo.Resultado;

// class OncePregunta (D16,V21,V22,T30)
public class T30Pregunta extends AppCompatActivity {

    //radioGroup11
    RadioGroup radioGroup30;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//.activity_once_pregunta
        setContentView(R.layout.activity_t30_pregunta);

//radioGroup11    R.id.Rg_11
        radioGroup30 = (RadioGroup)findViewById(R.id.Rg_30);
//radioGroup11
        radioGroup30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();
            //a11,b11,c11,d11,e11
            Integer a30 = bundle.getInt("A");
            Integer b30 = bundle.getInt("B");
            Integer c30 = bundle.getInt("C");
            Integer d30 = bundle.getInt("D");
            Integer e30 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
//.rbtn_1g11,g12,g13
                    case R.id.rbtn_1g30:
//a11
                        a = a30 + 1;
//DocePregunta.class
                        Intent i = new Intent(getApplicationContext(), Resultado.class);
//b11,c11
                        i.putExtra("A", a);
                        i.putExtra("B", b30);
                        i.putExtra("C", c30);
                        i.putExtra("D", d30);
                        i.putExtra("E", e30);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;
//.rbtng11
                    case R.id.rbtn_2g30:
                        b = b30 + 1;
//b11
//DocePregunta.class
                        Intent j = new Intent(getApplicationContext(), Resultado.class);
                        j.putExtra("B", b);
                        j.putExtra("A", a30);
                        j.putExtra("C", c30);
                        j.putExtra("D", d30);
                        j.putExtra("E", e30);

                        Toast.makeText(getApplicationContext(), "B: " + b, Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g30:
                        c = c30 + 1;

                        Intent k = new Intent(getApplicationContext(), Resultado.class);
                        k.putExtra("C", c);
                        k.putExtra("A", a30);
                        k.putExtra("B", b30);
                        k.putExtra("D", d30);
                        k.putExtra("E", e30);

                        Toast.makeText(getApplicationContext(), "C: " + c, Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g30:
                        d = d30 + 1;

                        Intent l = new Intent(getApplicationContext(), Resultado.class);
                        l.putExtra("D", d);
                        l.putExtra("A", a30);
                        l.putExtra("B", b30);
                        l.putExtra("C", c30);
                        l.putExtra("E", e30);

                        Toast.makeText(getApplicationContext(), "D: " + d, Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g30:
                        e = e30 + 1;

                        Intent m = new Intent(getApplicationContext(), Resultado.class);
                        m.putExtra("E", e);
                        m.putExtra("A", a30);
                        m.putExtra("B", b30);
                        m.putExtra("C", c30);
                        m.putExtra("D", d30);

                        Toast.makeText(getApplicationContext(), "E: " + e, Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
