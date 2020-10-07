package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tambah extends AppCompatActivity {
    private EditText edtketerangan, edtnominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        //isinedit text
        this.edtketerangan = this.findViewById(R.id.edt_keterangan);
        this.edtnominal = this.findViewById(R.id.edt_nominal);

    }


    public void btn_simpan(View view) {

        // nilai dari edittext
        String keterangan = this.edtketerangan.getText().toString();
        String nominal = this.edtnominal.getText().toString();
        if (isangka(nominal)) //jika benar angka
        {
//simpan
            String pengeluaran = keterangan + " - " + nominal;

            BerandaActivity.data_Pengeluaran.add(pengeluaran);
            Toast.makeText(this, "data berhasil ditambahkan", Toast.LENGTH_SHORT).show();
        } else
            {
                Toast.makeText(this, "nominal harus berupa angka", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isangka(String nominal) {
        try {
            Double.parseDouble(nominal);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}