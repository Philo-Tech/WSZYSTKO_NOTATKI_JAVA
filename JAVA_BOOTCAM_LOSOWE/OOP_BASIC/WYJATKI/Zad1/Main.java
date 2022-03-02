package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WYJATKI.Zad1;

public class Main {

    // nieprawidlową sytuacje nalezy tylko zgłosić -> np podanie przez uzytkownika liczby zamiast imienia (albo rzucić wyjątek, albo obsłużyć "if-em")

    // dwie podstawowe kategorie to: 1) Exception  2) RuntimeException
    // 1) Po Klasie Exception dziedziczą wyjątki przymusowe -> muszą być obsłużone, albo aplikacja się nie skompiluje (checked)
    // 2) Runtime Exception -> opcjonalne (np. NullpointerException/ ArrayIndexOutOfBoundException). Można ale nie trzeba. Wyjątki czasu rzeczywostego, czyli mogace wystącpić podczas działania programu
    // 3) Error to również wyjątki niekontrolowane

    // Wyjątek jest bardzo ciężki !!! Jak nie potrzeba to nie używamy !!! Spowalania kod- piszemy jak najmniej w "TRY"
    // powinny leżeć w niskopoziomowych modułach, czyli na samym dole zależności metod (ostatni punkt hierarchii wywołań)


    // wszystkie wyjątki, które wyrzucamy sami, muszą dziedziczyć po RuntimeException bezpośrednio lub pośrednio

    // try...catch...(finally) może być więcej "catch"
    // finally -> opcjonalnie. Wykona się zawsze; niezależnie czy wyjątek wystąpi, czy nie


    public static void main(String[] args) {

        // Tak nie robimy, bo to jest łapanie zbyt ogólnego wyjątku

       /* try {
            String s = null;
            s.concat("test");
        } catch (Exception e) { // że padnie jakiś wyjatek, ale nie precyzuję który. Exception to typ bardziej ogólny, czyli rodzic
            System.out.println("zrob coś");
        } *//*catch (NullPointerException e) {   // NullPointerException -> wyjątek czasu rzeczywistego, czyli dziedziczy po Exception, czyli nigdy się nie wykona
            System.out.println("zrob cos 2");
        }*/

        // POWINNO BY TAK

        try {
            String s = null;
            s.concat("test");
        } catch (NullPointerException e) {
            System.out.println("zrob cos");
        } catch (Exception e) { // obsługa innych błędów
            System.out.println("coś innego jak niespodziewany błąd");
        }
    }


}
