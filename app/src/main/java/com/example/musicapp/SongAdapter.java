package com.example.musicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Song currentSong = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView titleTextView = listItemView.findViewById(R.id.song_title);
        titleTextView.setText(currentSong.getTitle());

        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView .setText(currentSong.getAuthor());

        TextView detailsTextView = listItemView.findViewById(R.id.details);
        detailsTextView.setText(currentSong.getDetails());

        return listItemView;
    }
}

