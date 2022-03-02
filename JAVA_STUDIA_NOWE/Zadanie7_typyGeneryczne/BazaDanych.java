package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

import java.util.Arrays;

public class BazaDanych {// utworzenie list na podstawie Klasy generycznej: Kolekcja

    private Kolekcja<Lekarz> listaLekarzy;
    private Kolekcja<Pacjent> listaPacjentow;
    private Kolekcja<RatownikMedyczny> listaRatownikowMedycznych;

    public BazaDanych(){
        this.listaLekarzy = new Kolekcja<>();
        this.listaPacjentow = new Kolekcja<>();
        this.listaRatownikowMedycznych = new Kolekcja<>();
    }

    public Kolekcja<Lekarz> getListaLekarzy(){
        return this.listaLekarzy;
    }
    public Kolekcja<Pacjent> getListaPacjentow(){
        return this.listaPacjentow;
    }
    public Kolekcja<RatownikMedyczny> getListaRatownikowMedycznych(){
        return this.listaRatownikowMedycznych;
    }

    public static void wypisz(Kolekcja<?> kolekcja){
        Kolekcja kolekcja1 = new Kolekcja();
        System.out.println(kolekcja1.toString());
    }


}
