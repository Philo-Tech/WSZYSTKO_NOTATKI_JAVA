package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad3;

public class Mem {

    private String name;
    private String url;
    private String description;
    private boolean isFavorite;


    public Mem(){}

    public Mem(String name, String url, String description, boolean isFavorite) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isFavorite = isFavorite;
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

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    @Override
    public String toString() {
        return "Mem { " +
                " name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", isFavorite=" + isFavorite +
                " }";
    }
}
