package com.example.navygayion13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new TableFragment();
        androidx.fragment.app.FragmentManager fm = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.contentFragment, fragment);
        transaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btm_table:
                        Toast.makeText(MainActivity.this, "Periodic Table", Toast.LENGTH_SHORT).show();
                        Fragment fragment = new TableFragment();
                        androidx.fragment.app.FragmentManager fm = getSupportFragmentManager();
                        androidx.fragment.app.FragmentTransaction transaction = fm.beginTransaction();
                        transaction.replace(R.id.contentFragment, fragment);
                        transaction.commit();
                        return true;
                    case R.id.btm_list:
                        Toast.makeText(MainActivity.this, "List", Toast.LENGTH_SHORT).show();
                        Fragment fragment2 = new ListFragment();
                        androidx.fragment.app.FragmentManager fm2 = getSupportFragmentManager();
                        androidx.fragment.app.FragmentTransaction transaction2 = fm2.beginTransaction();
                        transaction2.replace(R.id.contentFragment, fragment2);
                        transaction2.commit();
                        return true;
                    case R.id.btm_trend:
                        Toast.makeText(MainActivity.this, "Trend", Toast.LENGTH_SHORT).show();
                        Fragment fragment3 = new TrendFragment();
                        androidx.fragment.app.FragmentManager fm3 = getSupportFragmentManager();
                        androidx.fragment.app.FragmentTransaction transaction3 = fm3.beginTransaction();
                        transaction3.replace(R.id.contentFragment, fragment3);
                        transaction3.commit();
                        return true;
                }
                return true;
            }
        });
    }
}

