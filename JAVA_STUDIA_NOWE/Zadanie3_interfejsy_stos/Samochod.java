package com.company.JAVA_STUDIA_NOWE.Zadanie3_interfejsy_stos;

public class Samochod implements ObiektZdrukuj{

    private String numerRejestracyjny;
    private String vin;

    public Samochod(String numerRejestracyjny, String vin){

        this.numerRejestracyjny = numerRejestracyjny;
        this.vin = vin;
    }

    @Override
    public void wyswietl() {

        System.out.println("Numer rejestracyjny: " + numerRejestracyjny);
        System.out.println("VIN: " + vin + "\n");
    }
}
