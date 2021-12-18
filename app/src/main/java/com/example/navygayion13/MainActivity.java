package com.example.navygayion13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btm_table:
                        Toast.makeText(MainActivity.this, "Periodic Table", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.btm_list:
                        Toast.makeText(MainActivity.this, "List", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.btm_trend:
                        Toast.makeText(MainActivity.this, "Trend", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}

