package com.example.kredifaiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class makine extends AppCompatActivity implements View.OnClickListener {

    Button no1,no2,no3,no4,no5,no6,no7,no8,no9,no0,toplama,cikarma,carpma,bolme,sifirla,sil,esittir;
    EditText sayial;
    double sayi1=0 ;
    double sayi2=0;
    double sonuc=0;
    String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makine);


            no1 = (Button) findViewById(R.id.no1);
            no2 = (Button) findViewById(R.id.no2);
            no3 = (Button) findViewById(R.id.no3);
            no4 = (Button) findViewById(R.id.no4);
            no5 = (Button) findViewById(R.id.no5);
            no6 = (Button) findViewById(R.id.no6);
            no7 = (Button) findViewById(R.id.no7);
            no8 = (Button) findViewById(R.id.no8);
            no9 = (Button) findViewById(R.id.no9);
            no0 = (Button) findViewById(R.id.no0);
            toplama = (Button) findViewById(R.id.barti);
            cikarma = (Button) findViewById(R.id.beksi);
            bolme = (Button) findViewById(R.id.bbolu);
            carpma = (Button) findViewById(R.id.bcarpi);
            esittir = (Button) findViewById(R.id.besittir);
            sifirla = (Button) findViewById(R.id.sifirla);
            sil = (Button) findViewById(R.id.teksil);
            sayial = (EditText) findViewById(R.id.islemekran);

            no1.setOnClickListener(this);
            no2.setOnClickListener(this);
            no3.setOnClickListener(this);
            no4.setOnClickListener(this);
            no5.setOnClickListener(this);
            no6.setOnClickListener(this);
            no7.setOnClickListener(this);
            no8.setOnClickListener(this);
            no9.setOnClickListener(this);
            no0.setOnClickListener(this);
            toplama.setOnClickListener(this);
            cikarma.setOnClickListener(this);
            carpma.setOnClickListener(this);
            bolme.setOnClickListener(this);
            esittir.setOnClickListener(this);
            sifirla.setOnClickListener(this);
            sil.setOnClickListener(this);
            sayial.setOnClickListener(this);


        }
        @Override
        public void onClick (View v){
            if (v.equals(no1)) {

                sayial.setText(sayial.getText() + "1");
            } else if (v.equals(no2)) {
                sayial.setText(sayial.getText() + "2");
            } else if (v.equals(no3)) {
                sayial.setText(sayial.getText() + "3");
            } else if (v.equals(no4)) {
                sayial.setText(sayial.getText() + "4");
            } else if (v.equals(no5)) {
                sayial.setText(sayial.getText() + "5");
            } else if (v.equals(no6)) {
                sayial.setText(sayial.getText() + "6");
            } else if (v.equals(no7)) {
                sayial.setText(sayial.getText() + "7");
            } else if (v.equals(no8)) {
                sayial.setText(sayial.getText() + "8");
            } else if (v.equals(no9)) {
                sayial.setText(sayial.getText() + "9");
            } else if (v.equals(no0)) {
                sayial.setText(sayial.getText() + "0");
            } else if (v.equals(toplama)) {
                if (!(sayial.getText().toString().equals(""))) {
                    sayi1 = Double.parseDouble(sayial.getText().toString());
                    sayial.setText("");
                    islem = "+";


                }
            } else if (v.equals(cikarma)) {
                if (!(sayial.getText().toString().equals(""))) {
                    sayi1 = Double.parseDouble(sayial.getText().toString());
                    sayial.setText("");
                    islem = "-";
                }
            } else if (v.equals(carpma)) {
                if (!(sayial.getText().toString().equals(""))) {
                    sayi1 = Double.parseDouble(sayial.getText().toString());
                    sayial.setText("");
                    islem = "x";

                }
            } else if (v.equals(bolme)) {
                if (!(sayial.getText().toString().equals(""))) {
                    sayi1 = Double.parseDouble(sayial.getText().toString());
                    sayial.setText("");
                    islem = "/";

                }
            } else if (v.equals(sifirla)) {
                sayial.setText("");
                islem = "";
                sayi1 = 0;
                sayi2 = 0;

            } else if (v.equals(sil)) {
                if (!(sayial.getText().toString().equals(""))) {
                    String kopyaekran = sayial.getText().toString();
                    kopyaekran = kopyaekran.substring(0, kopyaekran.length() - 1);
                    sayial.setText(kopyaekran);
                } else {
                    islem = "";
                }
            } else {
                sayi2 = Double.parseDouble((sayial.getText().toString()));
                if (islem.equals("+")) {
                    sonuc = sayi1 + sayi2;

                    sayi1 = 0;
                    sayi2 = 0;


                } else if (islem.equals("-")) {
                    sonuc = sayi1 - sayi2;
                    sayi1 = 0;
                    sayi2 = 0;

                } else if (islem.equals("x")) {
                    sonuc = sayi1 * sayi2;
                    sayi1 = 0;
                    sayi2 = 0;

                } else if (islem.equals("/")) {


                    sonuc = sayi1 / sayi2;
                    sayi1 = 0;
                    sayi2 = 0;


                }

                sayial.setText(Double.toString(sonuc));
            }
        }


    }



