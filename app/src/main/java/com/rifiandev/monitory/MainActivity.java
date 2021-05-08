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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahKode(View view){
        Button btn_mulai = (Button) findViewById(R.id.btnMulai);
        String mulai = btn_mulai.getText().toString();
        Log.d("Main", "Nama : "+mulai);
        Intent intent = new Intent (this, kodeKeluarga.class);
        startActivity(intent);
    }


}