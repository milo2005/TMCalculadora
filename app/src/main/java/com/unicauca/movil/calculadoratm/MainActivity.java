package com.unicauca.movil.calculadoratm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultado;
    Button sumar, restar, div, mul;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView)findViewById(R.id.resultado);

        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);

        int r = 0;

        switch (v.getId()){
            case R.id.sumar:
                r = ni1 + ni2;
                break;
            case R.id.restar:
                r = ni1 - ni2;
                break;
            case R.id.mul:
                r = ni1 * ni2;
                break;
            case R.id.div:
                r = ni1 / ni2;
                break;
        }

        resultado.setText(""+r);

    }
}
