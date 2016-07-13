package com.wordpress.jonyonandroidcraftsmanship.basicrecyclerviewtest;

public class Data {
    private int iconId=0;
    private String title =null;

    public Data(int iconId, String text) {
        this.iconId = iconId;
        this.title = text;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
