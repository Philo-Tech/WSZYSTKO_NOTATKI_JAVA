package com.company.JAVA10.Zadanie1_String;

public class Main {

    public static void main(String[] args) {

        // ********* METODY Klasy String **********

        // charAt()       - zwraca znak zadanej pozycji w napisie
        // contains()     - zwraca informacje, czy napis zawiera określone znaki
        // endsWith()     - zwraca informacje, czy napis kończy się określonym znakiem
        // startsWith()   - zwraca informacje, czy napis zaczyna się określonym znakiem
        // indexOf()      - zwraca pozycję zadanego napisu
        // isEmpty()      - zwraca informację czy napis jest pusty
        // length()       - zwraca informację o długości napisu/ tekstu (również wszystkie białe znaki)
        // replace()      - zamieina wszystkie wystapienia jednego znaku na drugi znak (zastąp)
        // split()        - rozdziela napis na elementy wg podanego parametru
        // trim()         - usunięcie białych znaków z końca i początku napisu (nie usunie spacji po środku)
        // toLowerCase()  - zmienia wszystkie znaki (cały napis) na małe znaki
        // toUpperCase()  - zmienia wszystkie znaki (cały napis) na wielkie znaki

        // format         - służy do podstawiania wartości pod zdany szablon
        // %s             - jakakolwiek wartość/ dowolny ciąg znaków/ dowolna zmienna
        // %f             -


        String s1 = "cos tam";
        String s2 = "i jeszcze";
        String s3 = "cos tam";

        if(s1.equals(s2)){
            System.out.println("takie same");

        } else System.out.println("inne");

        System.out.println(s1.charAt(s1.length()-1));


        if (s1.compareToIgnoreCase(s2) == 0) System.out.println("takie same");
        else System.out.println("a jednak są inne");

        System.out.println(s1 == s3);

        String s = s1 + s2; // dopuszczalne, ale niewydajne
        // String s = (new StringBuilder()).append("hello").append("world").toString();  --> wykona się pod spodem
        System.out.println(s);

        String hello = new String("hello").concat(" world");
        System.out.println(hello);

        System.out.println(s1.substring(3));
        System.out.println(s1.substring(1,s1.length()));
        //------------------------------------------------------

        String name = "sonoo";
        String sf1 = String.format("name is %s", name);  // format - pisane kursywą
        String sf2 = String.format("value is %f", 32.4444444);
        String sf3 = String.format("value is %32.12f", 32.444444);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}
