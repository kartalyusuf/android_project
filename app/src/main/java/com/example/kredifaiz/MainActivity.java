package com.example.kredifaiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Date;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //kanka aç sen githubu haydaa :D kanka nerde ki 

    ImageView resim;
    EditText kullanici;
    EditText sifre;
    Button giris;
    RadioButton radioButton1, radioButton2;
    TextView tema;
    LinearLayout linearLayout;
    ArrayList<Kullanici> kullaniciArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resim = findViewById(R.id.resim);
        kullanici = findViewById(R.id.kullanici);
        sifre = findViewById(R.id.sifre);
        giris = findViewById(R.id.giris);
        radioButton1 = findViewById(R.id.light);
        radioButton2 = findViewById(R.id.dark);
        tema = findViewById(R.id.tema);
        linearLayout = findViewById(R.id.linear);
        kullaniciArrayList = new ArrayList<Kullanici>();
        kayitEt();
    }
    public void kayitEt(){
        Kullanici yusuf = new Kullanici("yusuf","12345");
        yusuf.setAcilisTarih("15/12/2020");
        yusuf.setKullaniciUID("1");
        yusuf.setHomeDizi("Prison Break");
        yusuf.setKalanSure("5000");
        Kullanici hüseyin = new Kullanici("hüseyin","12345");
        Kullanici burak = new Kullanici("burak","12345");
        Kullanici ali = new Kullanici("ali","12345");
        kullaniciArrayList.add(yusuf);
        kullaniciArrayList.add(hüseyin);
        kullaniciArrayList.add(burak);
        kullaniciArrayList.add(ali);
    }
    public void login(View view) {
        boolean control=false;
        for(int i=0;i<kullaniciArrayList.size();i++){
            String kullaniciIsım = kullaniciArrayList.get(i).getKullaniciAdi().toString();
            String password = kullaniciArrayList.get(i).getKullaniciSifre().toString();
            if(kullanici.getText().toString().equals(kullaniciIsım) && sifre.getText().toString().equals(password)){
                themeChange();
                control=true;
                break;
            }
            else{//kanka yapı nasıl şimdi onu tam bi izlmemiz lazım giriş yaptan nereye geçiyoruz
                control=false;
            }
        }
        if(!control){
            Toast.makeText(MainActivity.this, "Hatalı Giriş", Toast.LENGTH_LONG).show();//oldu inş :D
        }
        /*
        if (kullanici.getText().toString().equals("yusuf") && sifre.getText().toString().equals("12345")) {
            themeChange();//ney kanka onu onCreate de yapalım arrayliste atalım ? aynen

        } else {
            Toast.makeText(MainActivity.this, "Hatalı Giriş", Toast.LENGTH_LONG).show();
        }

         */
    }

    public void themeChange(){
        if(radioButton1.isChecked()){
            Intent intent = new Intent(MainActivity.this,yonlendirme.class);
           // intent.putExtra("users",kullaniciArrayList);
            intent.putExtra("colors","light");
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(MainActivity.this,yonlendirme.class);
            //intent.putExtra("users",kullaniciArrayList);
            intent.putExtra("colors","dark");
            startActivity(intent);
        }
    }


}
















