package com.example.doan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.doan.Activity.DentailActivity;
import com.example.doan.Adapter.CategoryAdapter;
import com.example.doan.Adapter.FoodAdapter;
import com.example.doan.Data.DBFood;
import com.example.doan.Data.Input;
import com.example.doan.Model.Category;
import com.example.doan.Model.Food;
import com.example.doan.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {

    ListView listView;
    ArrayList<Food> arrayList;
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

    public CategoryFragment() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static CategoryFragment newInstance(int pos) {
        Bundle args = new Bundle();
        args.putInt("category",pos);
        CategoryFragment categoryFragment = new CategoryFragment();
        categoryFragment.setArguments(args);
        return categoryFragment;
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
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        listView = view.findViewById(R.id.listViewCate);
        arrayList = dbFood.getFoodFromCategory(bundle.getInt("category"));
        foodAdapter = new FoodAdapter(getContext(),arrayList);
        listView.setAdapter(foodAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dbFood.foodHistory.add(arrayList.get(position));
                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), DentailActivity.class);
                i.putExtra("name", arrayList.get(position).getTenMA().toString());
                i.putExtra("description",arrayList.get(position).getCachLam().toString());
                i.putExtra("image", arrayList.get(position).getHinhAnh());
                i.putExtra("like", arrayList.get(position).getYeuThich());
                startActivity(i);
            }
        });
    }
}