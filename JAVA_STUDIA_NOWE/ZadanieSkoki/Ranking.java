package com.company.JAVA_STUDIA_NOWE.ZadanieSkoki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ranking {

    private Zawodnik zawodnik;
    private List<Zawodnik> listaZawodnikow;
    private int[] notySedziow = new int[5];
    private Punktacja zdobytePunkty;
    private Map<Punktacja, Zawodnik> zestawienie;

    public Ranking(){
        Map<Punktacja, Zawodnik> zestawienie = new HashMap<>();
    }
    public Zawodnik getZawodnik(){
        return zawodnik;
    }
    public Punktacja getZdobytePunkty(){
        return zdobytePunkty;
    }

    public void setListaZawodnikow(int liczbaZawodnikow){

        if(liczbaZawodnikow >0 && liczbaZawodnikow <=100)
            this.listaZawodnikow = new ArrayList<>(liczbaZawodnikow);
        else System.out.println("Bledna liczba zawodnikow");
    }
    public void dodajZawodnika(Zawodnik zawodnik){
        this.listaZawodnikow.add(zawodnik);
    }

    public void setNotySedziow(int[] noty){
        if(noty.length == 5){
            for (int i = 0; i <this.notySedziow.length ; i++) {
                this.notySedziow[i] = noty[i];
            }

        }else System.out.println("zła liczba ocen");
    }
}
