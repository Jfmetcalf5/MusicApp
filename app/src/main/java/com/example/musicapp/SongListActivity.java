package com.example.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));
        songs.add(new Song("title", "author", "details"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(songAdapter);
    }
}
