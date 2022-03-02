package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class Lekarz extends Osoba{

    private String specjalizacja;

    public Lekarz(String imie, String nazwisko, String specjalizacja) {
        super(imie, nazwisko);
        this.specjalizacja=specjalizacja;
    }
    public String getSpecjalizacja(){
        return specjalizacja;
    }
    public float wynagrodzenie(float godzinyPracy){
        return godzinyPracy * new ParametryFinansowe().getStawkaLekarzaZaGodzine();
    }

}
