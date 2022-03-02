package com.company.JAVA10.Zadanie_33_Static_COUNTER;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("jakiś", "pracownik");
        System.out.println(employe.getId());

        System.out.println(new Employe("jakis 2","szef").getId());
        System.out.println(new Employe("jakis 3","szef").getId());
        System.out.println(new Employe("jakis 4","szef").getId());
        System.out.println(new Employe("jakis 5","szef").getId());
        System.out.println(new Employe("jakis 6","szef").getId());

    }
}
