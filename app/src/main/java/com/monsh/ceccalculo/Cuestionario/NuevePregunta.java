package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class NuevePregunta extends AppCompatActivity {
    RadioGroup radioGroup9;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueve_pregunta);

        radioGroup9 = (RadioGroup)findViewById(R.id.Rg_9);
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a9 = bundle.getInt("A");
            Integer b9 = bundle.getInt("B");
            Integer c9 = bundle.getInt("C");
            Integer d9 = bundle.getInt("D");
            Integer e9 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_1g9:
                        a = a9 + 1;

                        Intent i = new Intent(getApplicationContext(),DiezPregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b9);
                        i.putExtra("C",c9);
                        i.putExtra("D",d9);
                        i.putExtra("E",e9);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g9:
                        b = b9 + 1;

                        Intent j = new Intent(getApplicationContext(),DiezPregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a9);
                        j.putExtra("C",c9);
                        j.putExtra("D",d9);
                        j.putExtra("E",e9);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g9:
                        c = c9 + 1;

                        Intent k = new Intent(getApplicationContext(),DiezPregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a9);
                        k.putExtra("B",b9);
                        k.putExtra("D",d9);
                        k.putExtra("E",e9);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g9:
                        d = d9 + 1;

                        Intent l = new Intent(getApplicationContext(),DiezPregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a9);
                        l.putExtra("B",b9);
                        l.putExtra("C",c9);
                        l.putExtra("E",e9);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g9:
                        e = e9 +1;

                        Intent m = new Intent(getApplicationContext(),DiezPregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a9);
                        m.putExtra("B",b9);
                        m.putExtra("C",c9);
                        m.putExtra("D",d9);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
