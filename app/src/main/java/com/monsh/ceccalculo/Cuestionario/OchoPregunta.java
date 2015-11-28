package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class OchoPregunta extends AppCompatActivity {

    RadioGroup radioGroup8;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocho_pregunta);

        radioGroup8 = (RadioGroup)findViewById(R.id.Rg_8);
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a8 = bundle.getInt("A");
            Integer b8 = bundle.getInt("B");
            Integer c8 = bundle.getInt("C");
            Integer d8 = bundle.getInt("D");
            Integer e8 = bundle.getInt("E");


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_1g8:
                        a = a8 + 1;

                        Intent i = new Intent(getApplicationContext(),NuevePregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b8);
                        i.putExtra("C",c8);
                        i.putExtra("D",d8);
                        i.putExtra("E",e8);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g8:
                        b = b8 + 1;

                        Intent j = new Intent(getApplicationContext(),NuevePregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a8);
                        j.putExtra("C",c8);
                        j.putExtra("D",d8);
                        j.putExtra("E",e8);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g8:
                        c = c8 + 1;

                        Intent k = new Intent(getApplicationContext(),NuevePregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a8);
                        k.putExtra("B",b8);
                        k.putExtra("D",d8);
                        k.putExtra("E",e8);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g8:
                        d = d8 + 1;

                        Intent l = new Intent(getApplicationContext(),NuevePregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a8);
                        l.putExtra("B",b8);
                        l.putExtra("C",c8);
                        l.putExtra("E",e8);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g8:
                        e = e8 +1;

                        Intent m = new Intent(getApplicationContext(),NuevePregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a8);
                        m.putExtra("B",b8);
                        m.putExtra("C",c8);
                        m.putExtra("D",d8);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
