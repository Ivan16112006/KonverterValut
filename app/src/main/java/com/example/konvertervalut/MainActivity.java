package com.example.konvertervalut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button valut1;
    Button valut2;
    Button vich;
    EditText inputv;
    TextView result;
    Intent i;
    static int znach_valut1;
    static int znach_valut2;
    static public int konv;
    double[] zna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        valut1.setText("");
        valut2.setText("");
        valut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
                konv = 1;
            }
        });
        valut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
                konv = 2;
            }
        });
        vich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = Double.parseDouble(String.valueOf(inputv.getText()));
                result.setText(String.valueOf(konverter(n, zna[znach_valut1-1], zna[znach_valut2-1])));
            }
        });

    }
    void init(){
        valut1 = (Button) findViewById(R.id.valut1);
        valut2 = (Button) findViewById(R.id.valut2);
        inputv = (EditText) findViewById(R.id.inputValut1);
        result = (TextView) findViewById(R.id.otvet);
        i = new Intent(this, WiborValut.class);
        konv = 0;
        //znach_valut1 = 1;
        //znach_valut2 = 2;
        vich = (Button) findViewById(R.id.vich);
        double rub = 1; //рубль
        double usd = 74.76; //доллор
        double eur = 79.61; //евро
        double jpy = 0.56; //японская иена
        double gbp = 89.79; //фунт стерлингов
        double byn = 26.58; //белорусский рубль
        double cny = 10.84; //китайский юань
        zna = new double[]{rub, usd, eur, jpy, gbp, byn, cny};
    }
    static double konverter(double n, double valut1, double valut2){
        double a = n*valut1/valut2;
        return a;
    }



}