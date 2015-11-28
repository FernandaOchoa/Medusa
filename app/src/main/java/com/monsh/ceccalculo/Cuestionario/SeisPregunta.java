package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class SeisPregunta extends AppCompatActivity {

    RadioGroup radioGroup6;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seis_pregunta);

        radioGroup6 = (RadioGroup)findViewById(R.id.Rg_6);
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a6 = bundle.getInt("A");
            Integer b6 = bundle.getInt("B");
            Integer c6 = bundle.getInt("C");
            Integer d6 = bundle.getInt("D");
            Integer e6 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rbtn_1g6:
                        a = a6 + 1;

                        Intent i = new Intent(getApplicationContext(),SietePregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b6);
                        i.putExtra("C",c6);
                        i.putExtra("D",d6);
                        i.putExtra("E",e6);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g6:
                        b = b6 + 1;

                        Intent j = new Intent(getApplicationContext(),SietePregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a6);
                        j.putExtra("C",c6);
                        j.putExtra("D",d6);
                        j.putExtra("E",e6);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g6:
                        c = c6 + 1;

                        Intent k = new Intent(getApplicationContext(),SietePregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a6);
                        k.putExtra("B",b6);
                        k.putExtra("D",d6);
                        k.putExtra("E",e6);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g6:
                        d = d6 + 1;

                        Intent l = new Intent(getApplicationContext(),SietePregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a6);
                        l.putExtra("B",b6);
                        l.putExtra("C",c6);
                        l.putExtra("E",e6);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g6:
                        e = e6 +1;

                        Intent m = new Intent(getApplicationContext(),SietePregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a6);
                        m.putExtra("B",b6);
                        m.putExtra("C",c6);
                        m.putExtra("D",d6);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });
    }
}
