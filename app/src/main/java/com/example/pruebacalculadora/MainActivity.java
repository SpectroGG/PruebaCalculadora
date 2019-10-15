package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    TextView msj1, msj2;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.suma);
        btn2 = (Button) findViewById(R.id.resta);
        btn3 = (Button) findViewById(R.id.dividir);
        btn4 = (Button) findViewById(R.id.producto);

        msj1 = (TextView) findViewById(R.id.msg1);
        msj2 = (TextView) findViewById(R.id.msg2);

        num1 = (EditText) findViewById(R.id.n1);
        num2 = (EditText) findViewById(R.id.n2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int nm1 = Integer.parseInt(num1.getText().toString());
        int nm2 = Integer.parseInt(num2.getText().toString());
        int nm3 = nm1 + nm2;
        int nm4 = nm1 - nm2;
        int nm5 = nm1 * nm2;
        int nm6 = nm1 / nm2;

        if (view.getId() == R.id.suma) {
            Intent intentbtn1 = new Intent(this, Suma.class);
            msj1.setText("El resultado es " +nm3);
        } else if (view.getId() == R.id.resta) {
            Intent intentbtn2 = new Intent(this, Resta.class);
            msj1.setText("El resultado es " +nm4);

        } else if (view.getId() == R.id.producto) {


        } else if (view.getId() == R.id.dividir) {

        }
    }
}