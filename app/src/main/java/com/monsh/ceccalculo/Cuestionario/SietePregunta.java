package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class SietePregunta extends AppCompatActivity {

    RadioGroup radioGroup7;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siete_pregunta);

        radioGroup7 = (RadioGroup)findViewById(R.id.Rg_7);
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a7 = bundle.getInt("A");
            Integer b7 = bundle.getInt("B");
            Integer c7 = bundle.getInt("C");
            Integer d7 = bundle.getInt("D");
            Integer e7 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rbtn_1g7:
                        a = a7 + 1;

                        Intent i = new Intent(getApplicationContext(),OchoPregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b7);
                        i.putExtra("C",c7);
                        i.putExtra("D",d7);
                        i.putExtra("E",e7);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g7:
                        b = b7 + 1;

                        Intent j = new Intent(getApplicationContext(),OchoPregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a7);
                        j.putExtra("C",c7);
                        j.putExtra("D",d7);
                        j.putExtra("E",e7);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g7:
                        c = c7 + 1;

                        Intent k = new Intent(getApplicationContext(),OchoPregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a7);
                        k.putExtra("B",b7);
                        k.putExtra("D",d7);
                        k.putExtra("E",e7);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g7:
                        d = d7 + 1;

                        Intent l = new Intent(getApplicationContext(),OchoPregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a7);
                        l.putExtra("B",b7);
                        l.putExtra("C",c7);
                        l.putExtra("E",e7);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g7:
                        e = e7 +1;

                        Intent m = new Intent(getApplicationContext(),OchoPregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a7);
                        m.putExtra("B",b7);
                        m.putExtra("C",c7);
                        m.putExtra("D",d7);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }

            }
        });
    }
}
