package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.Zad2;

@FunctionalInterface
public interface Nameator {

    // metoda abstrakcyjna. Tylko jedna może być pod Lambda
    String getName(String s);




}

    /*
    * - Kluczem do sukcesu działania Lambdy jest Interfejs Funkcyjny
    *
    *-Interfejs Funkcyjny musi zawierać dokładnie jedną deklarację metody abstrakcyjnej
    *- Każad Lambda odpowiada danemu typowi, określonemu w Interfejsie
    *- By mieć pewność, że warunek ten jest spełniony, należy dodać do kodu adnotacje -> "@FunctionalInterface"
    *- Każde wyrażenie Lambda, danego typu, zostanie powiązane z tą metodą
    *
    *
    *   PRZYKLAD
    *
    * @FunctionalInterface
    * public interface Liczba{
    *       double getWartosc();
    * }
    *
    * ###########################
    * Jak już mamy zdefiniowany interfejs funkcyjny, to możemy do niego przypisac wyrazenie lambda i odwolac sie do niego
    *
    * public static void main(String[] args){
    *       Liczba pi = () -> 3.14;
    *       System.out.println { pi.getWartosc() };
    * }
    *
    *
    * */

