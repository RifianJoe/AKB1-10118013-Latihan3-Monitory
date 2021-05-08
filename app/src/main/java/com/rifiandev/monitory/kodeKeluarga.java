package com.rifiandev.monitory;

/*
Tanggal Pengerjaan : Sabtu, 08 Mei 2021
NIM : 10118013
Nama : Rifian Joe Premilenio
Kelas : IF-01
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class kodeKeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_keluarga);
    }

    public void pindahBiodata(View view){
        Button btn_masuk = (Button) findViewById(R.id.btnMasuk);
        String masuk = btn_masuk.getText().toString();
        Log.d("Main", "Nama : "+masuk);
        Intent intent = new Intent (this, Biodata.class);
        startActivity(intent);
    }

}