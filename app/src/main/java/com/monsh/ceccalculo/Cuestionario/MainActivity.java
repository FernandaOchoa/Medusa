package com.monsh.ceccalculo.Cuestionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.monsh.ceccalculo.R;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Integer a=0, b=0, c=0, d=0, e=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.Rg_1);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_1:
                        a = 1;

                        Intent i = new Intent(getApplicationContext(), SegundaPregunta.class);
                        i.putExtra("A", a);

                        Toast.makeText(getApplicationContext(), "A: " + a, Toast.LENGTH_SHORT).show();

                        startActivity(i);
                        break;
                    case R.id.rbtn_2:
                        b = 1;

                        Intent j = new Intent(getApplicationContext(),SegundaPregunta.class);
                        j.putExtra("B", b);

                        Toast.makeText(getApplicationContext(),"B: "+b, Toast.LENGTH_SHORT).show();

                        startActivity(j);
                        break;
                    case R.id.rbtn_3:
                        c = 1;

                        Intent k = new Intent(getApplicationContext(),SegundaPregunta.class);
                        k.putExtra("C", c);

                        Toast.makeText(getApplicationContext(),"C: "+c,Toast.LENGTH_SHORT).show();

                        startActivity(k);
                        break;
                    case R.id.rbtn_4:
                        d = 1;

                        Intent l = new Intent(getApplicationContext(),SegundaPregunta.class);
                        l.putExtra("D", d);

                        Toast.makeText(getApplicationContext(),"D: "+d,Toast.LENGTH_SHORT).show();

                        startActivity(l);
                        break;
                    case R.id.rbtn_5:
                        e = 1;

                        Intent m = new Intent(getApplicationContext(),SegundaPregunta.class);
                        m.putExtra("E",e);

                        Toast.makeText(getApplicationContext(),"E: "+e,Toast.LENGTH_SHORT).show();
                        startActivity(m);
                        break;
                }
            }
        });
    }
}
