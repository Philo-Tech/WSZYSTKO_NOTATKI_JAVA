package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.DATA_JAVA8.Zad1;

public class Opis {

        // Date- stara Klasa
        // Calendar - nowa Klasa
        // DayOfWeek - enum przechowuje dni tygodnia (dla czytelności powinno się używać typó wyliczeniowych zamiast stałych)
        // Month - przechowuje miesiące

        // Klasa Instant - reprezentuje punkt na linii czasu (punktem zerowym jest 01.01.1970.
        // Wartości klasy Instant mogą sięgać miliarda lat). Nie zawiera informacji o strefie czasowej, więc w Polsce dla godziny 21 "Instant.now()" zwróci godzinę 19.
        // Klasa Instant, tak jak wszystkie pozostałe, w tym pakiecie, są niezmienne, co znaczy, że modyfikacje na Obiektach powodują utworzenie nowych instancji
        // now() -> metoda statyczna. Zwraca bieżącą datę i godzinę
        // between() ->

        // Duration -> Klasa opisująca długość odcinka czasu, jaki upłynął pomiedzy dwoma chwilami opisanymi Klasą Instant
        // Można pobrać długość Duration w zwykłych jednostkach, wywołując:
        // -toNanos
        // -toMilis
        // -toSeconds
        // -toMinutes
        // -toHours
        // -toDays

        // LocalDate - Klasa reprezentująca datę z rokiem, miesiącem, i dniem w miesiącu (czas lokalny. Nie zawiera strefy czasowej).
        // Służy głównie do przechowywania dat urodzin, świąt, uzgodnionych terminów () ale już możemy operować na dniach, a nie np. Milisekundach)
        // Metody klasy LocalDate przewidują niektóre niepoprawne operacje np. dodanie jednego miesiąca do daty "31 stycznia" nie zwróci daty "31 lutego". Zamiast tego zwróci ostatni poprawny dzień dla tego miesiąca(lutego)
        // until() -> metoda umożliwiająca porównanie dat. Zwraca ona Obiekt Klasy Period (i służy do porównywania dat lokalnych)

        // MODYFIKATORY DAT (metody)
        // TemporaryAdjusters -> Klasa która udostępnia kilka styatycznych metod umożliwiających typowe operacje (np. chcemy wiąż najbliższy wtorek)

        // CZAS LOKALNY
        // LocalTime -> Klasa reprezetuje godzinę taką jak "16:35:00"
        // now() of() -> metody do utworzenia instancji tej Klasy

        // MIX
        // LocalDateTime -> Klasa jest kombinacją "LocalDate" oraz "LocalTime"
        // Służy do reprezentowania czasu pod postacią daty i godziny. Nie operuje na strefach czasowych (nie możemy przerzucić się na inną strefę czasową).

        // CZAS STREFOWY
        // ZonedDataTime
        // Uwzględnia wszystkie strefy na całym świecie, a dodatkowo zmiany czasu z zimowego na letni i odwrotnie.
        // Stref czasowych jest około 600 i wszystkie maja swoje identyfikatory, np. "America/New_York" czy "Europe/Berlin"
        // Metody Klasy ZonedDataTime są bardzo podobne do Klasy LocalDateTime
        // Zastosowanie -> jak np chcemy dostać jaka godzina jest obecnie w innej strefie casowej. Zmieniamy tylko strefę czasową. Uwzględni poprawny dzień oraz poprawną strefę, czy jest czas letni, czy zimowy
        // !!! Zwróć szczególną uwagę przy modyfikacjach daty przekraczających granicę zmiany czasu. Np. jeśli ustalasz spotkanie na następny tydzień, nie dodawaj siedmiu dni przy użyciu Klasy Duration (!).
        // (!) Zamiast tego użyj Klasy Period (jako okres czasu -> uwzględni zmiany czasowe).

        // FORMATOWANIE I PRZETWARZANIE
        // DateTimeFormatter -> służy do formatowania dat na bardziej przyjazne ludziom
        // Domyślne formattery korzystają z bieżących ustawień regionalnych. Można jednak dowolnie je zmieniać, dzięki Klasie Locale.

        // METODY Z ZADAN
        // now.isBefore()
        // now.isAfter()

    }

