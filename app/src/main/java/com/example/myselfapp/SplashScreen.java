package com.example.myselfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), Viewpager.class));
            finish();
        }, 3000L);
    }
}