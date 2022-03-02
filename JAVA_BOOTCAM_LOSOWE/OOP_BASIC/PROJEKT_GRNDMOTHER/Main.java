package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PROJEKT_GRNDMOTHER;

import java.io.IOException;

public class Main {

    // nazwa: ilośc: cena /
    // Oblicz kwotę zakupów
    // jakich produktów kupiła najwięcej
    // czy nie kupiłą podówjnie jakiegoś towaru
    // ma do dyspozycji nominały; 5, 2, 1, 0.50, , 0.20, 0.10 -> ile musi mieć ze sobą najmniej monet, żeby opłacić zakupy

    // Jabłka:20:0.50/ Maka:10:5/ Jabłka:20:0.50/ Masło:2:14/ Kiełbasa:4:30.60/ Jajka:20:0.60/Leki:10:35/ Jabłka:20:0.50

    // zapisane w pliku/ klasa PRduct/ przekonwertować

    //##################################################################################################################

    public static void main(String[] args) {

        // Klasa Main jest stricte tserująca/ widokowa

        ProductList productList =null; // null jest postrzebny jako inicjalizacja dla wywołania metod
        // jeden "productList" reprezentuje jedną listę zakupów, czyli jeden plik

        try { // tutaj obsługujemy błąd z Konstruktora ProductList
            productList = new ProductList("C:\\Users\\marci\\Desktop\\ListaZzakupamiDoCwiczen.txt"); // trzeba najpier gdzieś utworzyć plik z zakupami
        } catch (IOException e) {
            System.out.println("Nie udało się załadować pliku");  // komunikat w przypadku wystąpienia błędu
            System.exit(1); // i zamykam aplikacjęz kodem "1"
            e.printStackTrace();
        }

        // przeciwnym wypadku, jeżeli wszystko pójdzoe OK, to wywołuję metody


        System.out.println(productList.getMaxProduct());
        System.out.println(productList.getMAxPriceProduct());
        System.out.println(productList.getTotalPrice());
        System.out.println(productList.hasListDoubleProduct());

    }


}
