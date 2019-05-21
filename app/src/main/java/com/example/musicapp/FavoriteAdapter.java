package com.example.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FavoriteAdapter extends ArrayAdapter<Song> {

    public FavoriteAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {

        final Song currentSong = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.favorite_list_layout, parent, false);
        }

        TextView titleTextView = listItemView.findViewById(R.id.song_title);
        titleTextView.setText(currentSong.getTitle());

        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView .setText(currentSong.getAuthor());

        TextView detailsTextView = listItemView.findViewById(R.id.details);
        detailsTextView.setText(currentSong.getDetails());

        Button playButton = listItemView.findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext(), NowPlayingActivity.class);
                intent.putExtra("title",currentSong.getTitle());
                intent.putExtra("author",currentSong.getAuthor());
                intent.putExtra("details",currentSong.getDetails());
                parent.getContext().startActivity(intent);
            }
        });

        return listItemView;
    }

}
