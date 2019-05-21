package com.example.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_view);

        setTitle(R.string.songs);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("title1", "author1", "details for 1"));
        songs.add(new Song("title2", "author2", "details for 2"));
        songs.add(new Song("title3", "author3", "details for 3"));
        songs.add(new Song("title4", "author4", "details for 4"));
        songs.add(new Song("title5", "author5", "details for 5"));
        songs.add(new Song("title6", "author6", "details for 6"));
        songs.add(new Song("title7", "author7", "details for 7"));
        songs.add(new Song("title8", "author8", "details for 8"));
        songs.add(new Song("title9", "author9", "details for 9"));
        songs.add(new Song("title10", "author10", "details for 10"));
        songs.add(new Song("title11", "author11", "details for 11"));
        songs.add(new Song("title12", "author12", "details for 12"));
        songs.add(new Song("title13", "author13", "details for 13"));
        songs.add(new Song("title14", "author14", "details for 14"));
        songs.add(new Song("title15", "author15", "details for 15"));
        songs.add(new Song("title16", "author16", "details for 16"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("SongListActivity","Item " + position + " clicked");
                Intent intent = new Intent(SongListActivity.this, NowPlayingActivity.class);
                intent.putExtra("title",songs.get(position).getTitle());
                intent.putExtra("author",songs.get(position).getAuthor());
                intent.putExtra("details",songs.get(position).getDetails());
                startActivity(intent);
            }
        });

        listView.setAdapter(songAdapter);
    }
}
