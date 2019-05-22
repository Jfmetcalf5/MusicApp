package com.example.musicapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle(R.string.favorites);

        String songTitle = NowPlayingDataHolder.getInstance().title;
        if (songTitle == "") {
            getSupportActionBar().setSubtitle("No song selected...");
        } else {
            getSupportActionBar().setSubtitle("Now playing: " + songTitle);
        }

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("title1", "author1", "details for 1"));
        songs.add(new Song("title4", "author4", "details for 4"));
        songs.add(new Song("title6", "author6", "details for 6"));
        songs.add(new Song("title8", "author8", "details for 8"));
        songs.add(new Song("title13", "author13", "details for 13"));
        songs.add(new Song("title15", "author15", "details for 15"));
        songs.add(new Song("title16", "author16", "details for 16"));

        FavoriteAdapter favoriteAdapter = new FavoriteAdapter(this, songs);

        ListView listView = findViewById(R.id.favorite_list_view);

        listView.setAdapter(favoriteAdapter);
    }

    @Override
    protected void onResume() {
        String songTitle = NowPlayingDataHolder.getInstance().title;
        if (songTitle == "") {
            getSupportActionBar().setSubtitle("No song selected...");
        } else {
            getSupportActionBar().setSubtitle("Now playing: " + songTitle);
        }
        super.onResume();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
