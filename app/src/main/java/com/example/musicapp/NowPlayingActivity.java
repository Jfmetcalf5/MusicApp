package com.example.musicapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    NowPlayingDataHolder nowP = NowPlayingDataHolder.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_list_layout);

        setTitle(R.string.now_playing);

        ImageView songTree = findViewById(R.id.song_tree);
        TextView titleTextView = findViewById(R.id.now_song_title);
        TextView authorTextView = findViewById(R.id.now_author);
        TextView detailsTextView = findViewById(R.id.now_details);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);


        int height = metrics.heightPixels/2;
        int width = metrics.widthPixels/2;

        songTree.setLayoutParams(new RelativeLayout.LayoutParams(width,height));
        songTree.setMaxHeight(height);
        songTree.setImageResource(R.drawable.music_tree);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String author = intent.getStringExtra("author");
        String details = intent.getStringExtra("details");

        if ((title == null) && (author == null) && (details == null)) {
            titleTextView.setText(nowP.title);
            authorTextView.setText(nowP.author);
            detailsTextView.setText(nowP.details);
        } else {
            nowP.title = title;
            nowP.author = author;
            nowP.details = details;
            titleTextView.setText(nowP.title);
            authorTextView.setText(nowP.author);
            detailsTextView.setText(nowP.details);
        }
    }
}
