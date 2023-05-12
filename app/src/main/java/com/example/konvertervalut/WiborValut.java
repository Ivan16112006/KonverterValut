package com.example.konvertervalut;

import static com.example.konvertervalut.MainActivity.konv;
import static com.example.konvertervalut.MainActivity.znach_valut1;
import static com.example.konvertervalut.MainActivity.znach_valut2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WiborValut extends AppCompatActivity {
    Intent m;
    Button RUB;
    Button USD;
    Button EUR;
    Button JPY;
    Button GBP;
    Button BYN;
    Button CNY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wibor_valut);
        init();

        RUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(1);
            }
        });

        USD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(2);
            }
        });
        EUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(3);
            }
        });
        JPY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(4);
            }
        });
        GBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(5);
            }
        });
        BYN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(6);
            }
        });
        CNY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oboznach(7);
            }
        });
    }
    void init(){
        RUB = (Button) findViewById(R.id.rub);
        USD = (Button) findViewById(R.id.usd);
        EUR = (Button) findViewById(R.id.eur);
        JPY = (Button) findViewById(R.id.jpy);
        GBP = (Button) findViewById(R.id.gbp);
        BYN = (Button) findViewById(R.id.byn);
        CNY = (Button) findViewById(R.id.cny);
        m = new Intent(this,MainActivity.class);
    }
    void oboznach(int i){
        if (konv == 1){
            znach_valut1 = i;
        }
        if (konv == 2){
            znach_valut2 = i;
        }
        startActivity(m);
    }
}