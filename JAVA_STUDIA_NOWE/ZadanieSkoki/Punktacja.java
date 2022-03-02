package com.company.JAVA_STUDIA_NOWE.ZadanieSkoki;

public class Punktacja {

    private float punktyZaWiatr;
    private int gdzieBelka;
    private float notyZaStyl;
    private float dlugoscSkoku;
    private float sumaPunktow;

    public Punktacja(){}

    public Punktacja(float punktyZaWiatr, int gdzieBelka, float notyZaStyl, float dlugoscSkoku, float sumaPunktow){
        this.punktyZaWiatr = punktyZaWiatr;
        this.gdzieBelka = gdzieBelka;
        this.notyZaStyl=notyZaStyl;
        this.dlugoscSkoku=dlugoscSkoku;
        this.sumaPunktow=sumaPunktow;
    }

    public float getPunktyZaWiatr(){
        return punktyZaWiatr;
    }
    public void setPunktyZaWiatr(float silaWiatru) {
        if(silaWiatru >= -10 && silaWiatru <=10 )
        this.punktyZaWiatr = punktyZaWiatr;
    }
    public int getGdzieBelka(){
        return this.gdzieBelka;
    }
    public void setGdzieBelka(int gdzieBelka) {
        if(gdzieBelka >= 1 && gdzieBelka <=30)
        this.gdzieBelka = gdzieBelka;
        else System.out.println("Podano złe parametry");
    }
    public float getNotyZaStyl(){
        return this.notyZaStyl;
    }

    public void setNotyZaStyl(float notaZaStyl){
        if(notaZaStyl >=0 && notaZaStyl <=20)
            this.notyZaStyl=notaZaStyl;
        else System.out.println("bląd");
    }
    public float getDlugoscSkoku(){
        return this.dlugoscSkoku;
    }

    public void setDlugoscSkoku(float dlugoscSkoku) {
        if(dlugoscSkoku >=0 && dlugoscSkoku <=50)
        this.dlugoscSkoku = dlugoscSkoku;
        else System.out.println("błąd danych");
    }

    //######################################

    public static float punktyZawiatr(float silaWiatru, int jakiWiatr){
        float punktyZaWiatr=0;

        if(jakiWiatr == 0) jakiWiatr=0;
        else if(jakiWiatr ==1) jakiWiatr = -1;
        else jakiWiatr= 1;

        return punktyZaWiatr = silaWiatru*jakiWiatr;
}}
