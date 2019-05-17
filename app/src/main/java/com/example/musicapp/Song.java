package com.example.musicapp;

public class Song {

    private String _title;
    private String _author;
    private String _details;

    public Song(String title, String author, String details) {
        _title = title;
        _author = author;
        _details = details;
    }

    public String getTitle() { return _title; }
    public String getAuthor() {
        return _author;
    }
    public String getDetails() { return _details; }

}
