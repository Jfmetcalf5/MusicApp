package com.example.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list_view);

        setTitle(R.string.favorites);

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("SongListActivity","Item " + position + " clicked");
                Intent intent = new Intent(FavoritesActivity.this, NowPlayingActivity.class);
                intent.putExtra("title",songs.get(position).getTitle());
                intent.putExtra("author",songs.get(position).getAuthor());
                intent.putExtra("details",songs.get(position).getDetails());
                startActivity(intent);
            }
        });

        listView.setAdapter(favoriteAdapter);
    }
}
