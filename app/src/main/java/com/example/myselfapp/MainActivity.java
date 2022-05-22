package com.example.myselfapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//NIM    : 10119216
//Nama   : Muhammad Syarifuddin Rahiman
//Kelas  : IF-6
//Tanggal Pengerjaan : 22-05-2022

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,new HomeFragment()).commit();
        bottomNavigationView
                .setOnNavigationItemSelectedListener(item -> {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_daily:
                            selectedFragment = new DailyFragment();
                            break;
                        case R.id.nav_galery:
                            selectedFragment = new GaleryFragment();
                            break;
                        case R.id.nav_music:
                            selectedFragment = new MusicFragment();
                            break;
                        case R.id.nav_profle:
                            selectedFragment = new ProfileFragment();
                            break;

                    }

                    assert selectedFragment != null;
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container,selectedFragment).commit();

                    return true;
                });
    }
}