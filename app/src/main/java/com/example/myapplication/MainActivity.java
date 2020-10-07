package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    public static final int waktu = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //kode membuka aktivity berikutnya
                Intent i = new Intent(MainActivity.this, BerandaActivity.class);
                MainActivity.this.startActivity(i);
                MainActivity.this.finish();// destroy
            }
        }, waktu);
    }
}