package com.company.JAVA_STUDIA_NOWE.Zadanie4_abstrakcja2;
// jest interfacem dlatego, że zawiera wyłącznie metody abstrakcyjne (może zawierać również "static final")
// ten interface został utworzony tylko po to, żeby w klasie księgowość działała funkcja "drukujPoleceniePrzelewu"
// na wszystkich obiektach klas, które mają "ileDoWyplaty" oraz "wyswietl"
interface IObiektZKontraktem {


    double ileDoWyplaty(); // jedna metoda abstrakcyjna, dlatego klasa też musi być
                            // w interface wszystko jest domyślnie "public abstract" dlatego nie trzeba tego pisać

    void wyswietl();// bo funkcja jej potrzebuje
}
