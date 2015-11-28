package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class QuintaPregunta extends AppCompatActivity {
    RadioGroup radioGroup5;
    Integer a=0, b=0, c=0, d=0, e=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_pregunta);

        radioGroup5 = (RadioGroup)findViewById(R.id.Rg_5);
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a5 = bundle.getInt("A");
            Integer b5 = bundle.getInt("B");
            Integer c5 = bundle.getInt("C");
            Integer d5 = bundle.getInt("D");
            Integer e5 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rbtn_1g5:
                        a = a5 + 1;

                        Intent i = new Intent(getApplicationContext(),SeisPregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b5);
                        i.putExtra("C",c5);
                        i.putExtra("D",d5);
                        i.putExtra("E",e5);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g5:
                        b = b5 + 1;

                        Intent j = new Intent(getApplicationContext(),SeisPregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a5);
                        j.putExtra("C",c5);
                        j.putExtra("D",d5);
                        j.putExtra("E",e5);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g5:
                        c = c5 + 1;

                        Intent k = new Intent(getApplicationContext(),SeisPregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a5);
                        k.putExtra("B",b5);
                        k.putExtra("D",d5);
                        k.putExtra("E",e5);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g5:
                        d = d5 + 1;

                        Intent l = new Intent(getApplicationContext(),SeisPregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a5);
                        l.putExtra("B",b5);
                        l.putExtra("C",c5);
                        l.putExtra("E",e5);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g5:
                        e = e5 +1;

                        Intent m = new Intent(getApplicationContext(),SeisPregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a5);
                        m.putExtra("B",b5);
                        m.putExtra("C",c5);
                        m.putExtra("D",d5);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });

    }
}
