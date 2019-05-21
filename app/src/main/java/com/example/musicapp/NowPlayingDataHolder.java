package com.example.musicapp;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;

public class NowPlayingDataHolder {

    private NowPlayingDataHolder() {}

    private static NowPlayingDataHolder nowPlayingDataHolder = new NowPlayingDataHolder();

    public static NowPlayingDataHolder getInstance() {
        return nowPlayingDataHolder;
    }

    public String title = "";
    public String author = "";
    public String details = "";

}
