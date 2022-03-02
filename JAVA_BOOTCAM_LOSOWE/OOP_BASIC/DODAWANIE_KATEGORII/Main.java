package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DODAWANIE_KATEGORII;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Produkt, Kategoria> map = new HashMap();

        Scanner scanner = new Scanner(System.in);
        System.out.println(  "1 dodaj produkt"
                            +"2 dodaj kategorię"
                            +"3 Przypisz produkt do kategorii"
                            +"4 Wyświetl wszystkie produkty"
                            +"5 Wyświetl wszystkie kategorie");
        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                System.out.println("Podaj nazwę: ");
                Produkt produkt = new Produkt(scanner.nextLine());
                break;
                

        }




    }
}
