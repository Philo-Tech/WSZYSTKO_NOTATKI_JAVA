package com.company.JAVA10.Zadanie28_OOP.Zadanie3;

import java.net.URL;

public class Mem {

    private String name;
    private String url;
    private String description;
    private boolean isFavorit;


    public Mem(){}
    public Mem (String name, String url, String description, boolean isFavorit) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isFavorit = isFavorit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFavorit() {
        return isFavorit;
    }

    public void setFavorit(boolean favorit) {
        isFavorit = favorit;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url=" + url +
                ", description='" + description + '\'' +
                ", isFavorit=" + isFavorit +
                '}';
    }
}
