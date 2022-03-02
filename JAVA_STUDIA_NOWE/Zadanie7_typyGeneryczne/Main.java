package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ostatni wykład");

        Lekarz l1 = new Lekarz("Adam", "Tomczyk","KArdiolog");
        Lekarz l2 = new Lekarz("Adam2", "Tomczyk2","KArdiolog222");
        Pacjent p1 = new Pacjent("Artur", "Kot","111");

        ProceduraMedycznaLekarza proceduraMedycznaLekarza = new ProceduraMedycznaLekarza(l1,p1,"Badanie EKG");

        // wersja generyczna-> teraz można usunąć dwie klasy: ProceduraMedycznaLekarza oraz ProceduraMedycznaRatownika
        // ponieważ mamy już szablon dla każdej procedury podstawiając za <T>
        ProceduraMedycznaGeneryczna<Lekarz, Pacjent> proceduraMedycznaGeneryczna =
                new ProceduraMedycznaGeneryczna<>(l1,p1,"badanie KKK");

        BazaDanych bazaDanych =new BazaDanych();
        bazaDanych.getListaLekarzy().getLista().add(l1);
        bazaDanych.getListaLekarzy().getLista().add(l2);

        Kolekcja<Lekarz> kolekcja = new Kolekcja<>();
        kolekcja.getLista().add(l2);
        kolekcja.getLista().add(l2);
        kolekcja.getLista().add(l2);
        kolekcja.getLista().add(l2);

        BazaDanych.wypisz(kolekcja);// nie dziala

        System.out.println("Nazwisko drugiego lekarza: " + bazaDanych.getListaLekarzy().getLista().get(1).getNazwisko());




        System.out.println(
                        "Lekarz: "
                        + proceduraMedycznaGeneryczna.getWykonawca().getNazwisko()
                        + "wykonał procedurę: "
                        + proceduraMedycznaGeneryczna.getOpisProcedury()
                        +"dla pacjenta: "
                        +proceduraMedycznaGeneryczna.getOdbiorca().getNazwisko()
                        );
    }
}
