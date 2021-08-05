package com.example.doan.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.doan.Data.DBFood;
import com.example.doan.Model.Food;
import com.example.doan.R;

public class DentailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView itemName, itemDes;
    ToggleButton toggleButton;
    DBFood dbFood;
    Food food;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentail);
        //this.getActionBar().setDisplayHomeAsUpEnabled(true);
        dbFood = new DBFood(getApplicationContext());
        Intent intent = getIntent();
//        ActionBar actionBar;
//        actionBar = getSupportActionBar();
//
     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cách Làm");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#D32323")));
        imageView = findViewById(R.id.imgDentail_img);
        itemName = findViewById(R.id.txtDentail_Name);
        itemDes = findViewById(R.id.txtDentail_Des);
        itemName.setText(intent.getStringExtra("name"));
        itemDes.setText(intent.getStringExtra("description"));
        imageView.setImageResource(intent.getIntExtra("image", 0));
        itemDes.setMovementMethod(new ScrollingMovementMethod());
        int id = intent.getIntExtra("id", 0);
        toggleButton = (ToggleButton) findViewById(R.id.btnFavorite);
        //toggleButton.setChecked(false);
        //toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_baseline_favorite_dark_24));
        if (dbFood.checkLike(id) == 0) {
            toggleButton.setChecked(false);
            //toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_baseline_favorite_dark_24));
        } else {
            toggleButton.setChecked(true);
            //toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_baseline_favorite_24));
        }

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    int id = intent.getIntExtra("id", 0);
                    dbFood.updateFood(id);
                    toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_baseline_favorite_24));
                } else if (!isChecked) {
                    int id = intent.getIntExtra("id", 0);
                    dbFood.updateFood2(id);
                    toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_baseline_favorite_dark_24));
                }
            }
        });
    }
}