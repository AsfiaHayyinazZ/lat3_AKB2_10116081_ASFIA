package com.example.lat3_akb2_10116081_asfia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadFragment extends AppCompatActivity {

    public LoadFragment(HomeFragment homeFragment) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_fragment);
        // kita set default nya Home Fragment
        new LoadFragment(new HomeFragment());
// inisialisasi BottomNavigaionView
        MainActivity bottomNavigationView = findViewById(R.id.bn_main);
// beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
}
