package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lihatpengeluaran extends AppCompatActivity {

    private ListView lstpengeluaran;
    private ArrayAdapter<String>adapterlstpengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);
        this.lstpengeluaran = this.findViewById(R.id.lstpengeluaran);
        //adapter
        this.adapterlstpengeluaran = new ArrayAdapter<String>(
                this,
                R.layout.layoutlistview,
                BerandaActivity.data_Pengeluaran
        );
        this.lstpengeluaran.setAdapter(this.adapterlstpengeluaran);

    }
}