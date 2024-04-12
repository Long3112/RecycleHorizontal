package com.example.home_glide;

import java.util.List;

public class Category {
    private String nameCategory;
    private List<Music> musics;

    public Category(String nameCategory, List<Music> musics) {
        this.nameCategory = nameCategory;
        this.musics = musics;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}
