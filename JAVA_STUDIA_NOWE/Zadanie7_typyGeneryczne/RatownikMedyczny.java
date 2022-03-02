package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class RatownikMedyczny extends Osoba {

    private String opisUprawnien;


    public RatownikMedyczny(String imie, String nazwisko, String opisUprawnien) {
        super(imie, nazwisko);
        this.opisUprawnien = opisUprawnien;
    }
    public String getOpisUprawnien(){
        return this.opisUprawnien;
    }
    public float wynagrodzenie(float godzinyPracy){
        return godzinyPracy * new ParametryFinansowe().getStawkaRatownikaMedycznegoZaGodzine();
    }
}
