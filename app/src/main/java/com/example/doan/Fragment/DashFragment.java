package com.example.doan.Fragment;

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

import com.example.doan.Adapter.CategoryAdapter;
import com.example.doan.Adapter.DashAdapter;
import com.example.doan.Data.DBFood;
import com.example.doan.Data.Input;
import com.example.doan.Model.Category;
import com.example.doan.Model.Food;
import com.example.doan.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashFragment extends Fragment {

    GridView gridView;
    ArrayList<Category> arrayList;
    DashAdapter dashAdapter;
    Input input;
    //DBHelper dbHelper;
    DBFood dbFood;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DashFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DashFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DashFragment newInstance(String param1, String param2) {
        DashFragment fragment = new DashFragment();
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
        //input = new Input(getContext());
        dbFood = new DBFood(getContext());
        return inflater.inflate(R.layout.fragment_dash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.gripViewDash);
        dbFood.createTable();
        if (dbFood.checkDBCategory() == 0) {
            dbFood.createTable();
            dbFood.insertCategories();
        }
        arrayList = dbFood.getALLCategories();
        dashAdapter = new DashAdapter(getContext(),R.layout.row_cate,arrayList);
        gridView.setAdapter(dashAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_fragment,CategoryFragment.newInstance(position));
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public ArrayList<Category> getMockData(){
        ArrayList<Food> arrayListBed = new ArrayList<>();
        ArrayList<Food> arrayListLiving = new ArrayList<>();
        ArrayList<Food> arrayListMeeting = new ArrayList<>();
        ArrayList<Food> arrayListAccessories = new ArrayList<>();
        ArrayList<Category> tmp = new ArrayList<>();
        tmp.add(new Category("Món Bún",arrayListBed,R.drawable.bunbohue));
        tmp.add(new Category("Món",arrayListLiving,R.drawable.canhrongbien));
        tmp.add(new Category("Meeting",arrayListMeeting,R.drawable.chaoga));
        tmp.add(new Category("Accessories",arrayListAccessories,R.drawable.canhgachienncmam));
        return tmp;
    }
}