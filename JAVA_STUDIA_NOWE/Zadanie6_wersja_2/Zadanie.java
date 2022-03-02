package com.company.JAVA_STUDIA_NOWE.Zadanie6_wersja_2;

public class Zadanie {

    private String tytul;
    private String opis;
    private String status;
    private double punktyZaZadanie;
    private Pracownik wykonawca;


    public Zadanie(String tytul, String opis, String status, double punktyZaZadanie, Pracownik wykonawca){
        this.tytul = tytul;
        this.opis = opis;
        this.status = status;
        this.punktyZaZadanie = punktyZaZadanie;
        this.wykonawca = wykonawca;
    }

    public String getTytul(){
        return this.tytul;
    }
    public void setTytul(String tytul){
        this.tytul = tytul;
    }
    public String getOpis(){
        return this.opis;
    }
    public void setOpis(String opis){
        this.opis = opis;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public double getPunktyZaZadanie(){
        return this.punktyZaZadanie;
    }
    public void setPunktyZaZadanie(double punktyZaZadanie){
        this.punktyZaZadanie = punktyZaZadanie;
    }
    public Pracownik getWykonawca(){
        return this.wykonawca;
    }
    public void setWykonawca(Pracownik wykonawca){
        this.wykonawca = wykonawca;
    }

    public void wyswietl(){
        System.out.println("Tytuł: " + getTytul());
        System.out.println("Opis: " + getOpis());
        System.out.println("Status: " + getStatus());
        System.out.println("Liczba ounktów: " + getPunktyZaZadanie());
        System.out.println("Wykonawca: " + wykonawca.getImie() + " " + wykonawca.getNazwisko());
    }

}