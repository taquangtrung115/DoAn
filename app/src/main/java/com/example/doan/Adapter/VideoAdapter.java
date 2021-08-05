package com.example.doan.Adapter;

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
import androidx.annotation.Nullable;

import com.example.doan.Model.Video;
import com.example.doan.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VideoAdapter extends ArrayAdapter<Video> {
    public VideoAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public VideoAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public VideoAdapter(@NonNull Context context, int resource, @NonNull Video[] objects) {
        super(context, resource, objects);
    }

    public VideoAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Video[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public VideoAdapter(@NonNull Context context, int resource, @NonNull List<Video> objects) {
        super(context, resource, objects);
    }

    public VideoAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Video> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup viewGroup) {

        Video video1 = getItem(position);
        view= LayoutInflater.from(getContext()).inflate(R.layout.row_video,viewGroup,false);

        TextView txtTen = (TextView) view.findViewById(R.id.txtTen);

        ImageView img = view.findViewById(R.id.imgThum);


        txtTen.setText(video1.getName());
        //txtMoTa.setText(food.getCachLam());
        Picasso.with(getContext()).load(video1.getImg()).into(img);

        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.animation);
        view.startAnimation(animation);
        return view;
    }
}
