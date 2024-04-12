package com.example.home_glide;

public class Music {
    private int resourceId;
    private String name;
    private String title;

    public Music(int resourceId, String name, String title) {
        this.resourceId = resourceId;
        this.name = name;
        this.title = title;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
