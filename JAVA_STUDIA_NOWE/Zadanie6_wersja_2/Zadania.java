package com.company.JAVA_STUDIA_NOWE.Zadanie6_wersja_2;



import java.util.ArrayList;
import java.util.List;

// to jest klasa która bedzie przechowywała
public class Zadania {

    private List<Zadanie> listaZadania;


    public Zadania(){
        listaZadania = new ArrayList<Zadanie>();
    }

    public void dodajZadanie(Zadanie zadanie){

        listaZadania.add(zadanie);
        System.out.println("Dodano nowe zadanie\n");
    }
    public  Zadanie pobierzZadanie(int i){
        return listaZadania.get(i);
    }

    public void wyswietlWszystkieZadania(){
        for (int i = 0; i < listaZadania.size(); i++) {
            pobierzZadanie(i).wyswietl();
            System.out.println();
        }
    }
}

