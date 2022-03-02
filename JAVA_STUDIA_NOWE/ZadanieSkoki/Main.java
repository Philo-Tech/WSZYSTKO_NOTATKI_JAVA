package com.company.JAVA_STUDIA_NOWE.ZadanieSkoki;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zawodnik zawodnik = new Zawodnik("Artur Kornatka");
        Punktacja punktacja = new Punktacja();
        Ranking ranking = new Ranking();

        System.out.println("Ilu zawodników: ");
        int iluZawodnikow = scanner.nextInt();
        ranking.setListaZawodnikow(iluZawodnikow);


        System.out.println("Podaj długość skoku: ");
        float dlugoscSkoku = scanner.nextFloat();
        punktacja.setDlugoscSkoku(dlugoscSkoku);

        System.out.println("Jaki stopień belki?");
        int stopienBelki = scanner.nextInt();
        punktacja.setGdzieBelka(stopienBelki);

        int[] tab = new int[5];
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Podaj note: ");
            int nota = scanner.nextInt();
            tab[i] = nota;
        }
        ranking.setNotySedziow(tab);


        float silaWiatru= BazaPytan.silaWiatru();
        int jakiWiatr = BazaPytan.jakiWiatr();

        System.out.println("Ktora Belka? ");

        System.out.println("punkty za wiatr: "+ Punktacja.punktyZawiatr(silaWiatru,jakiWiatr));

    }
}
