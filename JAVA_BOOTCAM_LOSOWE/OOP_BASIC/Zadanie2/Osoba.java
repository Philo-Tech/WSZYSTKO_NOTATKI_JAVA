package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Zadanie2;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String PESEL;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie.substring(0,1).toUpperCase() + imie.substring(1);
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie.length()>=5 && ((imie.substring(0,1)) == (imie.substring(0,1).toUpperCase())))
            this.imie = imie;
        else {
            System.err.println("Baranie! źle napisałeś imię...poprawiliśmy");
        }
        this.imie = imie.substring(0, 1).toUpperCase().concat(imie.substring(1).toLowerCase());
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
