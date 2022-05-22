package com.example.myselfapp;

public class MusicModel {

    int image;
    String title;
    String artist;

    public MusicModel(int image, String title, String artist) {
        this.image = image;
        this.title = title;
        this.artist = artist;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
