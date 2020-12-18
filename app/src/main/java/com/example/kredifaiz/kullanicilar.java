package com.example.kredifaiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class kullanicilar extends AppCompatActivity {
    ListView listView;
    ArrayList<Kullanici> kullaniciArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanicilar);
        listView=findViewById(R.id.listView);
        kullaniciArrayList = (ArrayList<Kullanici>) getIntent().getSerializableExtra("userss");
        for(int i=0;i<kullaniciArrayList.size();i++){
            System.out.println(kullaniciArrayList.get(0).getKullaniciAdi());
        }
    }

}