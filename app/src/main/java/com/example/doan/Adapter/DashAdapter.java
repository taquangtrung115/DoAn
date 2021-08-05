package com.example.doan.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doan.Model.Category;
import com.example.doan.R;

import java.util.List;

public class DashAdapter extends BaseAdapter {
    private Context context;
    private int layout;

    public DashAdapter(Context context, int layout, List<Category> categoryList) {
        this.context = context;
        this.layout = layout;
        this.categoryList = categoryList;
    }

    private List<Category> categoryList;
    @Override
    public int getCount() {
        return getCategoryList().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public class ViewHolder{
        ImageView imageView;

        TextView txtName;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(getLayout(),null);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imgCate);
            viewHolder.txtName = view.findViewById(R.id.txtNameCate);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Category category = getCategoryList().get(i);

        viewHolder.imageView.setImageResource(category.getHinAnhDM());
        viewHolder.txtName.setText(category.getTenDM());
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.animation);
        view.startAnimation(animation);
        return view;
    }
}
