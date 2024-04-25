package com.example.bottomnavactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    return true;
                case  R.id.bottom_search:
                    startActivity(new Intent(getApplicationContext(),search_Activity.class));
                    overridePendingTransition(R.anim.silde_in_right,R.anim.silde_out_left);
                    finish();
                    return true;
                case  R.id.bottom_settings:
                    startActivity(new Intent(getApplicationContext(),settings_activity.class));
                    overridePendingTransition(R.anim.silde_in_right,R.anim.silde_out_left);
                    finish();
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