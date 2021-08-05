package com.example.doan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.doan.Adapter.FoodAdapter;
import com.example.doan.Data.DBFood;
import com.example.doan.Data.Input;
import com.example.doan.Activity.DentailActivity;
import com.example.doan.Model.Food;
import com.example.doan.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {

    ListView listView;
    ArrayList<Food> foodArrayList;
    FoodAdapter foodAdapter;
    Input input;
    DBFood dbFood;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        input = new Input(getContext());
        dbFood = new DBFood(getContext());

        return inflater.inflate(R.layout.fragment_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dbFood.createTable();
        if (dbFood.checkDBFood() == 0) {
            dbFood.createTable();
            dbFood.insertFood();
        }
//        dbFood.createTable();
//        dbFood.insertFood();
        listView = view.findViewById(R.id.lstViewFood);

        foodArrayList = dbFood.getALLFood();

        foodAdapter = new FoodAdapter(getContext(), foodArrayList);

        listView.setAdapter(foodAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Input.foodHistory.add(foodArrayList.get(position));
                Intent i = new Intent(getActivity(), DentailActivity.class);
                i.putExtra("id", foodArrayList.get(position).getMaMA());
                i.putExtra("name", foodArrayList.get(position).getTenMA().toString());
                i.putExtra("description", foodArrayList.get(position).getCachLam().toString());
                i.putExtra("image", foodArrayList.get(position).getHinhAnh());
                i.putExtra("like", foodArrayList.get(position).getYeuThich());
                Toast.makeText(getActivity(), ""+i.putExtra("id", foodArrayList.get(position).getMaMA()), Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });
    }


}