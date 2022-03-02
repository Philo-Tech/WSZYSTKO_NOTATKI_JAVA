package com.company.JAVA10.Zadanie_31_Kantor_NIE_SKOŃCZONE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import static com.company.JAVA10.Zadanie_31_Kantor_NIE_SKOŃCZONE.Constans.API_KEY;


public class CurrencyConverter {

    public static double convert(Currency from, Currency to) {

        String urlString = "https://free.currconv.com/api/v7/convert"
                + "?apiKey" + API_KEY   // wykonałem import statyczny, dlatego nie trzeba podawać Klasy, aby dostać się do stałej
                + "&q=" + from.getName() + "_" + to.getName()
                + "&compact=ultra";                          // zamieniliśmy "y" na "ultra". Lepiej wyświetla
        try {
            URL url = new URL(urlString); //klasa wykonująca zapytania GET na serwer

            // czytnik strumienia wejściowego -> bufferedReader (przyjmuje dane z pliku wejściowego -> Klasa InputStreamReader)
            InputStream inputStream = url.openStream(); // musimy stworzyć obiekt strumienia/ Klasa przechwytująca strumień bajtowy
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();

            if (line.length() > 0) {
                int startIndex = line.indexOf(":") + 1;
                int endIndex = line.indexOf(")");

                String filteredVAlue = line.substring(startIndex, endIndex);
                System.out.println(filteredVAlue);
                return Double.parseDouble(filteredVAlue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;

    }
}
