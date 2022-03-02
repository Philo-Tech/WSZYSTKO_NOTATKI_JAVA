package com.company.JAVA10.Zadanie28_OOP.Zadanie2;


public class Pracownik {
    private String name;
    private String surName;
    private double pensja;
    private int age;

    public Pracownik(){ }
    private Pracownik(String name, String surName, double pensja, int age) {
        /*if (name.length() < 5 || Character.isLowerCase(name.charAt(0))){
            System.out.println("Imie musi mieć conajmniej 5 liter "
                    + "oraz musi zaczynać się z wielkiej litery");
        } else*/
        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.surName = surName.substring(0,1).toUpperCase() + surName.substring(1) ;
        this.pensja = pensja;
        this.age = age;
    }

    public Pracownik createNewPracownik(String name, String surName, double pensja, int age){
        if (name.length() >= 5 && surName.length() >=5 ){
            return new Pracownik (name, surName, pensja, age);
        } else {
            System.err.println("podałeś zbyt krótkie imie i nazwisko");
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        /*if (name.length() <=5 || Character.isLowerCase(name.charAt(0))){
            System.out.println("Imie musi mieć conajmniej 5 liter "
                    + "oraz musi zaczynać się z wielkiej litery");
        }

        else*/ this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getYearGeld(double pensjaMiesieczna){
        return pensjaMiesieczna * 12;
    }

    public void getSalaryPerYear(Pracownik pracownik){

        if(pracownik != null) {
            double salaryPerYear = pracownik.pensja * 12;
            System.out.println("Roczna pensja " + pracownik.name + " wynosi " + salaryPerYear);
        }else {
            System.err.println("Nie ma takiego pracownika");
        }
    }


    @Override
    public String toString() {
        return "Pracownik: " +
                " name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", pensja = " + pensja +
                ", age = " + age ;
    }
}
