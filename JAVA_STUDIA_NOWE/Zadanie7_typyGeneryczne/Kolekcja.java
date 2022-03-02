package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

import java.util.ArrayList;
import java.util.List;

//
public class Kolekcja<T> {

    private String nazwa;
    private List<T> lista;

    public Kolekcja(){
        this.lista = new ArrayList<T>();
    }
    public String getNazwa(){
        return this.nazwa;
    }
    public List<T> getLista(){
        return this.lista;
    }
}
