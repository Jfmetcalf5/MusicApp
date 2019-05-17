package com.example.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_list_view);

        TextView titleTextView = findViewById(R.id.song_title);
        TextView authorTextView = findViewById(R.id.author);
        TextView detailsTextView = findViewById(R.id.details);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String author = bundle.getString("author");
        String details = bundle.getString("details");

        titleTextView.setText(title);
        authorTextView.setText(author);
        detailsTextView.setText(details);
    }
//
//    @Override
//    public Intent getIntent() {
//        TextView titleTextView = findViewById(R.id.song_title);
//        TextView authorTextView = findViewById(R.id.author);
//        TextView detailsTextView = findViewById(R.id.details);
//
//        Intent intent = getIntent();
//        String title = intent.getStringExtra("title");
//        String author = intent.getStringExtra("author");
//        String details = intent.getStringExtra("details");
//
//        titleTextView.setText(title);
//        authorTextView.setText(author);
//        detailsTextView.setText(details);
//
//        Log.v("NowPlayingActivity", "Got the intent " + intent.getExtras());
//
//        return super.getIntent();
//    }
}
