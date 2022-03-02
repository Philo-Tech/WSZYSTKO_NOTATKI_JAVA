package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class Adres {

    private String miejscowosc;
    private String numerDomu;
    private String nrLokalu;

    public Adres(String miejscowosc, String numerDomu, String nrLokalu){
        this.miejscowosc = miejscowosc;
        this.numerDomu = numerDomu;
        this.nrLokalu = nrLokalu;
    }
    public void wyswietl(){
        System.out.println(miejscowosc +" "+ numerDomu +"/ "+ nrLokalu);
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miejscowosc='" + miejscowosc + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", nrLokalu='" + nrLokalu + '\'' +
                '}';
    }
}
