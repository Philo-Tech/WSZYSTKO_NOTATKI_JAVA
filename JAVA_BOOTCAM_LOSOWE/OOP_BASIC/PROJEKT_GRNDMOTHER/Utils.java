package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PROJEKT_GRNDMOTHER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    // klasa do czytania pliku i zwracania w postaci Stringa

    public static String readFileContent(File file) throws IOException { // żeby nie obsługiwać błedu wewnątrz metody, która nie przynależy do żadnej warstwy programu

        StringBuilder stringBuilder = new StringBuilder(); // ponieważ wiem, że będę odczytywał coś w pętli, a chcę maksymalnie zoptymalizować

        FileInputStream fileInputStream = new FileInputStream(file); // Klasa rzucająca wyjątek, dlatego trzeba dopisać to do sygnatury metody. Potrafi odczytywać bajty
        InputStreamReader fileInputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); //ponieważ znajdują się polksie znaki, to używamy klasy przeznaczonej do czytania "charSetów".
        // Klasa potrafi zamieniać, odczytane bajty, na prwadziwy tekst, bez ręcznej konwersji za pomocą "char". Dzięki temu możemy sprecyzować kodowanie znaków,
        // czyli możemy odczytywać znaki narodowe
        // tworzymy Obiekt InputStreamReader, na podstawie fileInputStream i psrecyzować "charset" na UTF-8, czyli kodowanie w jakim zostały napisane znaki w pliku,
        // a następnie, w pętli poniżej, zamieniamy metodę czytającą, na Obiekt klasy "InputStreamReader"

        int read = 0;
        while ((read = fileInputStreamReader.read()) != -1) { // pętla czytająca plik
            stringBuilder.append((char) read); // dodaję, przeczytany tekst do StringBuldera. Rzutowanie na "char" musi pozostać, ale teraz odbywa się z odpowiednim charsetem

        }
        return stringBuilder.toString(); // zwracam treść odczytaną w metodzie
    }
}

// FileInputStream -> Klasa do odczytywania czystych plain-bajtów
// InputStreamReader -> Klasa, która potrafi przetłumaczyć bajty, pobrane przez Klasę "FileInputStream", na wskazany charset, czyli np UTF-8
