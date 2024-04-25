package com.example.bottomnavactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class settings_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_settings);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    overridePendingTransition(R.anim.silde_in_right,R.anim.silde_out_left);
                    finish();
                    return true;
                case  R.id.bottom_search:
                    startActivity(new Intent(getApplicationContext(),search_Activity.class));
                    overridePendingTransition(R.anim.silde_in_right,R.anim.silde_out_left);
                    finish();
                    return true;
                case  R.id.bottom_settings:
                    return true;
                case  R.id.bottom_profile:
                    startActivity(new Intent(getApplicationContext(),profile_activity.class));
                    overridePendingTransition(R.anim.silde_in_right,R.anim.silde_out_left);
                    finish();
                    return true;

            }
            return false;

        });
    }
}