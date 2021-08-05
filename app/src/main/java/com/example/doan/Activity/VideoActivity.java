package com.example.doan.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.doan.Adapter.VideoAdapter;
import com.example.doan.Model.Video;
import com.example.doan.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView;
    public static String APIKey = "AIzaSyA61QvAZH6FXzAk4FdJVbCl8GS7DiwMNlI";
    String IDList    = "PLnEEsieItPVOQbCVYR-u_KU9SwAv1P9Zw";
    String urlJson = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId="+ IDList +"&key="+ APIKey +"&maxResults=50";
    ListView listvideo;
    ArrayList<Video> videoArrayList;
    VideoAdapter videoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        listvideo = findViewById(R.id.listVideo);
        videoArrayList = new ArrayList<>();
        videoAdapter = new VideoAdapter(this,R.layout.row_video,videoArrayList);
        listvideo.setAdapter(videoAdapter);
        listvideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VideoActivity.this,PlayVideoActivity.class);
                intent.putExtra("idVideoYoutube",videoArrayList.get(position).getId());
                startActivity(intent);
            }
        });
        GetjsonYoutube(urlJson);

    }
    private  void GetjsonYoutube(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest =new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("items");
                    String title = "";
                    String url = "";
                    String idVideo="";
                    for (int i = 0; i < jsonArray.length();i++)
                    {
                        JSONObject jsonItem = jsonArray.getJSONObject(i);
                        JSONObject jsonSnippet = jsonItem.getJSONObject("snippet");
                        title = jsonSnippet.getString("title");

                        JSONObject jsonThum= jsonSnippet.getJSONObject("thumbnails");
                        JSONObject jsonMedium= jsonThum.getJSONObject("medium");
                        url = jsonMedium.getString("url");

                        JSONObject jsonResouceID = jsonSnippet.getJSONObject("resourceId");
                        idVideo = jsonResouceID.getString("videoId");
                        videoArrayList.add(new Video(title,url,idVideo));
                    }
                    videoAdapter.notifyDataSetChanged();
                }catch (JSONException ex)
                {
                    ex.printStackTrace();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(VideoActivity.this, "Lỗi", Toast.LENGTH_SHORT).show();
                    }


                }
        );
        requestQueue.add(jsonObjectRequest);
    }
}