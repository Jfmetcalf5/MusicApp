package com.example.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list_view);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("title1", "author1", "details for 1"));
        songs.add(new Song("title4", "author2", "details for 2"));
        songs.add(new Song("title6", "author3", "details for 3"));
        songs.add(new Song("title8", "author4", "details for 4"));
        songs.add(new Song("title13", "author5", "details for 5"));
        songs.add(new Song("title15", "author6", "details for 6"));
        songs.add(new Song("title16", "author7", "details for 7"));

        FavoriteAdapter favoriteAdapter = new FavoriteAdapter(this, songs);

        ListView listView = findViewById(R.id.favorite_list_view);

        listView.setAdapter(favoriteAdapter);
    }
}
