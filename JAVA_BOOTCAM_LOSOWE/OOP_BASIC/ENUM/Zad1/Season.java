package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ENUM.Zad1;

// Enum - typ wyliczeniowy. Sluzy do definiowania małych zbiorów stałych (jeżeli jest więcej niż 10 danych, to powinno się już użyć czegoś innego)
// jest porównywalny -> Comparable
// jest serializowany -> Serializable

public enum Season { // klasa, ale nie da się zapisać instacji enumów

    WINTER(-5), SUMMER(30), SPRING(20), AUTUMN(15); // -> gotowe instacje enumów, nie trzeba używać new do tworzenia Obiektów. Są statyczne i finalne

    // parametr klasy enum
    private int avgTemp;

    // konstruktor prywatny, domyślnie!!! (może też być package)
    private Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    // getter (setterów się nie robi ponieważ są immutable)
    public int getAvgTemp() {
        return this.avgTemp;
    }

    @Override
    public String toString() {
        return "Season{" +
                "avgTemp=" + avgTemp +
                '}';
    }
}

// enum ma własne wbudowane metody
// static values() -> zwraca tablicę zawierającą wszystkie Obiekty enum
// static valuesOf(String) -> zwraca wartość enuma, w postaci Obiektu enum, dla klucza określanego jako String
// static valueOf(Class<T>, String) -> zwraca wartość enuma w postaci obiektu enum, dkla klucza określonego jako String z klasy enumów
// działają w Switch,  If ,
// porównujemy operatorem porównania