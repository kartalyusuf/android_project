package com.example.kredifaiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class hesap extends AppCompatActivity {

    TextView kartal , oran , textTaksit;
    EditText kredi , taksit ;
    RadioGroup faiz ;
    RadioButton faiz1 , faiz2 , faiz5 ;   // %1 faiz , %2 , % 5
    Button hesapla ;
    Double taksitTutarı;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesap);
        kartal=findViewById(R.id.kartal);
        oran = findViewById(R.id.oran) ;
        kredi = findViewById(R.id.kredi);
        taksit= findViewById(R.id.taksit);
        faiz = findViewById(R.id.faiz);
        faiz1=findViewById(R.id.faiz1);
        faiz2=findViewById(R.id.faiz2);
        faiz5=findViewById(R.id.faiz5);
        hesapla=findViewById(R.id.hesapla);
        textTaksit=findViewById(R.id.textTaksit);

    }
    @SuppressLint("SetTextI18n")
    public void hesapla(View view){
        Double bir = 1.0;
        Double artiBir;
        Double n = Double.parseDouble(taksit.getText().toString());
        Double faiz;
        Double krediTutar = Double.parseDouble(kredi.getText().toString());

        if(faiz1.isChecked()){
            faiz = 0.01;
            artiBir=faiz+1;
        }
        else if(faiz2.isChecked()){
            faiz=0.02;
            artiBir=faiz+1;
        }
        else {//:D
            faiz = 0.05;
            artiBir=faiz+1;
        }
        taksitTutarı= krediTutar * (faiz * Math.pow(artiBir,n) / Math.pow(artiBir,n) - bir);
        textTaksit.setText("Odemeniz gereken taksit tutarı : " + taksitTutarı +" kadardır"+"\nArtiBir Sonucu="+artiBir);


    }
}