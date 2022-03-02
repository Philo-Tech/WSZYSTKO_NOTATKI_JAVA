package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public class Gra1 {

    public static void main(String[] args) {

        Postac postac = new Postac("Mag", 3,"czary-mary");
        postac.prezentuj();

        Mag mag = new Mag("Mag", 3, "czary-mary");
        Mag mag2 = new Mag("Mag2", 4, "czary-mary");

        Wojownik wojownik = new Wojownik("Wojownik", 3, "UUUU");
        Wojownik wojownik2 = new Wojownik("Wojownik2", 7, "BBBBBUUUU");

        Walka walka = new Walka();
        walka.walcz(mag,wojownik,10,10);
        walka.walcz(wojownik, wojownik2, 12,12);

    }
}
