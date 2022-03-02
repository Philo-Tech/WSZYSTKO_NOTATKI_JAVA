package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class Pacjent extends Osoba{

    private String numerKartyPacjenta;


    public Pacjent(String imie, String nazwisko, String numerKartyPacjenta) {
        super(imie, nazwisko);

        this.numerKartyPacjenta=numerKartyPacjenta;
    }

    public String getNumerKartyPacjenta(){
        return this.numerKartyPacjenta;
    }

}
