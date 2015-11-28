package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class DiezPregunta extends AppCompatActivity {
    RadioGroup radioGroup10;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diez_pregunta);

        radioGroup10 = (RadioGroup)findViewById(R.id.Rg_10);
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a10 = bundle.getInt("A");
            Integer b10 = bundle.getInt("B");
            Integer c10 = bundle.getInt("C");
            Integer d10 = bundle.getInt("D");
            Integer e10 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_1g10:
                        a = a10 + 1;

                        Intent i = new Intent(getApplicationContext(),OncePregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b10);
                        i.putExtra("C",c10);
                        i.putExtra("D",d10);
                        i.putExtra("E",e10);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g10:
                        b = b10 + 1;

                        Intent j = new Intent(getApplicationContext(),OncePregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a10);
                        j.putExtra("C",c10);
                        j.putExtra("D",d10);
                        j.putExtra("E",e10);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g10:
                        c = c10 + 1;

                        Intent k = new Intent(getApplicationContext(),OncePregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a10);
                        k.putExtra("B",b10);
                        k.putExtra("D",d10);
                        k.putExtra("E",e10);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g10:
                        d = d10 + 1;

                        Intent l = new Intent(getApplicationContext(),OncePregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a10);
                        l.putExtra("B",b10);
                        l.putExtra("C",c10);
                        l.putExtra("E",e10);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g10:
                        e = e10 +1;

                        Intent m = new Intent(getApplicationContext(),OncePregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a10);
                        m.putExtra("B",b10);
                        m.putExtra("C",c10);
                        m.putExtra("D",d10);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
