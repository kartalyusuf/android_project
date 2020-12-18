package com.example.kredifaiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class yonlendirme extends AppCompatActivity {

    TextView textView1 , textView2;
    Button kredi , hesapmakinesi , bilgi ;
    ArrayList<Kullanici> kullaniciArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonlendirme);
        changeBG();

        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);

       // kullaniciArrayList = (ArrayList<Kullanici>) getIntent().getSerializableExtra("users");


        kredi = (Button) findViewById(R.id.kredi);
        kredi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yonlendirme.this, hesap.class);
                startActivity(i);
            }
        });

        bilgi = (Button) findViewById(R.id.bilgi);
        bilgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(yonlendirme.this,kullanicilar.class);
               // i2.putExtra("userss",kullaniciArrayList);
                startActivity(i2);
            }
        });


        hesapmakinesi = (Button) findViewById(R.id.hesapmakinesi) ;
        hesapmakinesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(yonlendirme.this,makine.class);
                startActivity(i1);
            }
        });
    }






    public void changeBG(){
        Intent intent = getIntent();
        String color = intent.getStringExtra("colors");;

        if(color.equals("light")){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        else{
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }
    }
}