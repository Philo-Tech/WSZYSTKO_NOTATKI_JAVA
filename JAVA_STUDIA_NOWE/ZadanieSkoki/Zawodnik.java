package com.company.JAVA_STUDIA_NOWE.ZadanieSkoki;

public class Zawodnik {

    private String imieInazwisko;

    public Zawodnik(String imieInazwisko){
        this.imieInazwisko = imieInazwisko;
    }
    public String getImieInazwisko(){
        return imieInazwisko;
    }
    public void setImieInazwisko(String imieInazwisko){
        if((imieInazwisko.length() >= 3 && imieInazwisko.length() <=20)
        && imieInazwisko.contains(" "))
        this.imieInazwisko=imieInazwisko;
    }
}
