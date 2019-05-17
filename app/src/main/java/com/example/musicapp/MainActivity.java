package com.example.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songs = findViewById(R.id.songs_list);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView settings = findViewById(R.id.songs_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView saved = findViewById(R.id.songs_favorites);
        saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(numbersIntent);
            }
        });

    }
}
