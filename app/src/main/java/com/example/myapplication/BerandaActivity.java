package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class BerandaActivity extends AppCompatActivity {
    //variabel static untuk simpan data
    public static ArrayList<String> data_Pengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        if(data_Pengeluaran == null){
            //insialisasi
            data_Pengeluaran = new ArrayList<>();
            data_Pengeluaran.add("sarapan - 8.000");
            data_Pengeluaran.add("bensin - 10.000");

        }
    }

    public void btnkurang(View view) {
        //tambah pengeluaran
        Intent i = new Intent(BerandaActivity.this, lihatpengeluaran.class);
        this.startActivity(i);
    }

    public void btntambah(View view) {
        Intent i = new Intent(BerandaActivity.this, tambah.class);
        this.startActivity(i);
    }
}