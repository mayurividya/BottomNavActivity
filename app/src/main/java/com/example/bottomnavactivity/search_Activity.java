package com.example.bottomnavactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class search_Activity extends AppCompatActivity {
    private  BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
            TextView searchtextView= null;
            switch (item.getItemId()) {
                case R.id.bottom_home:
                searchtextView = new TextView(searchtextView.getContext().toString().trim();
                break;;
                case R.id.bottom_profile:
                    searchtextView = new TextView(searchtextView.getContext().toString().trim();

                    break;;
                case R.id.bottom_settings:
                    searchtextView = new TextView(searchtextView.getContext().toString().trim();
                    break;;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.bottomNavigationView,searchtextView)

        });


    }
}