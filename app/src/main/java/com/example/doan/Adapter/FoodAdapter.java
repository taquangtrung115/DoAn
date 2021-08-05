package com.example.doan.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.doan.Model.Food;
import com.example.doan.R;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {
    public FoodAdapter(@NonNull Context context, @NonNull List<Food> objects)
    {
        super(context,0,objects);
    }



    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        Food food = getItem(position);
        view= LayoutInflater.from(getContext()).inflate(R.layout.row_food,viewGroup,false);

        TextView txtTen = (TextView) view.findViewById(R.id.txtNameFood);

        ImageView img = view.findViewById(R.id.imgFood);


        txtTen.setText(food.getTenMA());
        //txtMoTa.setText(food.getCachLam());
        img.setImageResource(food.getHinhAnh());

        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.animation);
        view.startAnimation(animation);
        return view;
    }
}
