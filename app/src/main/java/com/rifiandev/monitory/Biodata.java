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

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindahHome(View view){
        Button btn_selanjutnya = (Button) findViewById(R.id.btnSelanjutnya);
        String selanjutnya = btn_selanjutnya.getText().toString();
        Log.d("Main", "Nama : "+selanjutnya);
        Intent intent = new Intent (this, Home.class);
        startActivity(intent);
    }

}