package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MEM;

public class Mem {

    private String name;
    private String subscribe;
    private boolean isFavorite;
    private String adresURL;

    public Mem(String name, String subscribe, boolean isFavorite, String adresURL) {
        this.name = name;
        this.subscribe = subscribe;
        this.isFavorite = isFavorite;
        this.adresURL = adresURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getAdresURL() {
        return adresURL;
    }

    public void setAdresURL(String adresURL) {
        this.adresURL = adresURL;
    }

    @Override
    public String toString() {
        return "Mem {" +
                " name='" + name + '\'' +
                ", subscribe='" + subscribe + '\'' +
                ", isFavorite=" + isFavorite +
                ", adresURL='" + adresURL + '\'' +
                "}\n";
    }
}
