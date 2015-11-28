package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class CuartaPregunta extends AppCompatActivity {
    RadioGroup radioGroup4;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_pregunta);

        radioGroup4 = (RadioGroup)findViewById(R.id.Rg_4);
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            Intent in = getIntent();
            Bundle bundle = in.getExtras();

            Integer a4 = bundle.getInt("A");
            Integer b4 = bundle.getInt("B");
            Integer c4 = bundle.getInt("C");
            Integer d4 = bundle.getInt("D");
            Integer e4 = bundle.getInt("E");

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rbtn_1g4:
                        a = a4 + 1;

                        Intent i = new Intent(getApplicationContext(),QuintaPregunta.class);
                        i.putExtra("A",a);
                        i.putExtra("B",b4);
                        i.putExtra("C",c4);
                        i.putExtra("D",d4);
                        i.putExtra("E",e4);

                        Toast.makeText(getApplicationContext(),"A: "+a,Toast.LENGTH_SHORT).show();
                        startActivity(i);
                        break;

                    case R.id.rbtn_2g4:
                        b = b4 + 1;

                        Intent j = new Intent(getApplicationContext(),QuintaPregunta.class);
                        j.putExtra("B",b);
                        j.putExtra("A",a4);
                        j.putExtra("C",c4);
                        j.putExtra("D",d4);
                        j.putExtra("E",e4);

                        Toast.makeText(getApplicationContext(),"B: "+b,Toast.LENGTH_SHORT).show();
                        startActivity(j);
                        break;

                    case R.id.rbtn_3g4:
                        c = c4 + 1;

                        Intent k = new Intent(getApplicationContext(),QuintaPregunta.class);
                        k.putExtra("C",c);
                        k.putExtra("A",a4);
                        k.putExtra("B",b4);
                        k.putExtra("D",d4);
                        k.putExtra("E",e4);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();
                        startActivity(k);
                        break;

                    case R.id.rbtn_4g4:
                        d = d4 + 1;

                        Intent l = new Intent(getApplicationContext(),QuintaPregunta.class);
                        l.putExtra("D",d);
                        l.putExtra("A",a4);
                        l.putExtra("B",b4);
                        l.putExtra("C",c4);
                        l.putExtra("E",e4);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();
                        startActivity(l);
                        break;

                    case R.id.rbtn_5g4:
                        e = e4 +1;

                        Intent m = new Intent(getApplicationContext(),QuintaPregunta.class);
                        m.putExtra("E",e);
                        m.putExtra("A",a4);
                        m.putExtra("B",b4);
                        m.putExtra("C",c4);
                        m.putExtra("D",d4);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });
    }
}
