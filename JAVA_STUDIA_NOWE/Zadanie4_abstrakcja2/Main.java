package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;

public class Main {
    public static void main(String[] args) {

        Ksiegowosc ksiegowosc = new Ksiegowosc();

        LekarzRodzinny lekarzRodzinny = new LekarzRodzinny("Tomek", "jakiś",20);
        ksiegowosc.drukujPoleceniePrzelewu(lekarzRodzinny);

        LekarzSpecjalista lekarzSpecjalista = new LekarzSpecjalista("jakis", "specjalista",20, "Dermatolog");
        ksiegowosc.drukujPoleceniePrzelewu(lekarzSpecjalista);

        Szpital szpital = new Szpital("Kopernika", new Adres("Lodz","15","5"),500);
        ksiegowosc.drukujPoleceniePrzelewu(szpital);
    }
}
