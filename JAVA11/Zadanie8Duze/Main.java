package com.company.Zadanie8Duze;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        opcje();

    }
    //########################################
    private static void wyswietlMenu(){
        System.out.println(
                "\nco chcesz zrobić? \n"
                + "d - wprowadz nowe dane \n"
                + "p - wyswietl wszystkie wprowadzone dane \n"
                + "n- podaj największą liczbę \n"
                + "m - podaj najmniejszą liczbę \n"
                + "s - podaj średnią arytmetyczną \n"
                + "r - podaj sumę liczb \n"
                + "w - podaj wariację \n"
                + "a - podaj wszystko \n"
                + "k - zakończ \n"
                + "-> ");
    }

    private static double[] wprowadzDane(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić: ");
        int dlugoscTabeli = scanner.nextInt();
        double[] liczby = new double[dlugoscTabeli];

        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Podaj " + (i + 1));
            liczby[i] = scanner.nextDouble();
        }
        return liczby;
    }
    
    private static void wypiszDane(double[] liczby){
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(i + "; " + liczby[i]);
        }
    }

    private static double podajNajwiekszaLiczbe(double[] liczby){
        double max = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            double a = liczby[i];

            if (a> max) max = a;
        }
        return max;
        }

    private static double podajNajmniejsząLiczbę(double[] liczby){
        double min = liczby[0];
        for (int i = 0; i < liczby.length ; i++) {
            double a = liczby[i];
            if (a < min) min = a;
        }
        return min;
    }

    private static double[] wprowadzNoweDane(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić: ");
        int dlugoscTabeli =scanner.nextInt();
        double[] liczby = new double[dlugoscTabeli];

        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Podaj " + (i + 1) + "liczbę z " + dlugoscTabeli);
            liczby[i] = scanner.nextDouble(); // co jeden krok (iteracja) czekamy aż użutkownik poda JEDNA liczbę i wciśnie enter
        }
        return liczby;
    }

    private static int podajIloscLiczb(double[] liczby){
        int iloscLiczb = 0;
        for (double liczba: liczby) {
            iloscLiczb++;
        }
        return iloscLiczb;
    }

    private static double podajSumeLiczb(double[] liczby){
        double suma = 0;
        for(double liczba : liczby){
            suma += liczba;
        }
        return suma;
    }

    private static double podajSredniaArytmetyczna (double[] liczby){
        return podajSumeLiczb(liczby)/ liczby.length;
    }

    private static  double podajWariacje(double[] liczby){
        double srednia = podajSredniaArytmetyczna(liczby);
        double suma = 0;
        for (double liczba : liczby){
            suma = suma + (liczba - srednia) * (1 - srednia);
        }
        double wariacja = suma / (liczby.length -1);
        return wariacja;
        }

    private static void podajWszystko(double[] liczby){
            System.out.println("***WYNIKI***");
            System.out.println("***DANE***");
            wypiszDane(liczby);
            System.out.println("MIN     " + podajNajmniejsząLiczbę(liczby));
            System.out.println("MAX     " + podajNajwiekszaLiczbe(liczby));
            System.out.println("Srednia " + podajSredniaArytmetyczna(liczby));
            System.out.println("Suma:   " + podajSumeLiczb(liczby));
            System.out.println("__________________");
        }

    private static void opcje(){
        String opcja = "";
        double[] liczby = new double[0];
        Scanner scanner = new Scanner(System.in);

        while (!opcja.equalsIgnoreCase("k")){
            wyswietlMenu();
            opcja = scanner.nextLine();
            if(liczby.length == 0 && !opcja.equalsIgnoreCase("k")){
                liczby = wprowadzDane();
            }

            switch (opcja){
                case "p":  wypiszDane(liczby);
                    break;
                case "d":  wprowadzDane();
                    break;
                case "n":  podajNajwiekszaLiczbe(liczby);
                    break;
                case "m" : podajNajmniejsząLiczbę(liczby);
                    break;
                case "s" : podajSredniaArytmetyczna(liczby);
                    break;
                case "w" : podajWariacje(liczby);
                    break;
                case "k" :
                    System.out.println("Koniec");
                break;
                default:
                    System.out.println("Wybrałeś błędną opcję...");
            }
        }
    }
}




