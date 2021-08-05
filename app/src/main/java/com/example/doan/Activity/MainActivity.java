package com.example.doan.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.doan.Fragment.CategoryFragment;
import com.example.doan.Fragment.DashFragment;
import com.example.doan.Fragment.FavoritesFragment;
import com.example.doan.Fragment.FoodFragment;
import com.example.doan.Fragment.VideoFragment;
import com.example.doan.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navView;
    boolean status = false;
    EditText searchView;
    MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        loadFragment(new FoodFragment());
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.mnudanhsach);
        //this.getSupportActionBar().setTitle("Danh Sách Món Ăn");
        searchView= findViewById(R.id.search);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.mnudanhsach:
                    //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        getSupportActionBar().setTitle("Danh Sách Món Ăn");
                        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D32323")));
                        fragment = new FoodFragment();
                        loadFragment(fragment);
                        return true;
                case R.id.mnudanhsachvideo:
                    getSupportActionBar().setTitle("Danh Sách Video");
                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D32323")));
                    fragment = new VideoFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.mnudanhmuc:
                    getSupportActionBar().setTitle("Danh Mục Món Ăn");
                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D32323")));
                    fragment = new DashFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.mnuyeuthich:
                    getSupportActionBar().setTitle("Danh Sách Yêu Thích");
                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D32323")));
                    fragment = new FavoritesFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }

    };
    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_fragment,fragment);
       transaction.addToBackStack(null);
        transaction.commit();
    }
}