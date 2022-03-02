package com.company.JAVA_STUDIA_NOWE.Zadanie6_tablice_kolekcje;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, String stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public String getImie(){
        return this.imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public  String getNazwisko(){
        return this.nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public String getStanowisko(){
        return this.stanowisko;
    }
    public void setStanowisko(String stanowisko){
        this.stanowisko = stanowisko;
    }
}
