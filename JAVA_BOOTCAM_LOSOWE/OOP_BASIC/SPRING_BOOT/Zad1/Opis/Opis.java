package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.SPRING_BOOT.Zad1.Opis;

public class Opis {

    // Plugin, żeby robić UML z kodu -> "Code Iris"
    /*
    * Spring - działa w oparciu o Java Enterprise Edition (ma wysoki próg wejścia)
    * Póżniej powstał Spring MVC
    * Później powstał SpringBoot (najłatwiejszy)
    *
    *  Presta Schop - gotowy szablon do sklepu
    *
    *                                               MODULY Spring
    *
    *  IoC -> (inversion of control/ ID - dependency injection) Odwrócenie sterowalności.
    *         Przeniesienie odpowiedzialności za tworzenie Obiektów z programisty na tzw. "kontener"
    * - programista definiuje tylko jakie Obiekty, kiedy i gdzie mają być dostępne
    * - Fizycznym tworzeniem tych Obiektów i dostarczaniem ich we właściwe miejsce zajmuje się kontener
    * - Konfiguracja Springa to proces informowania kontenera jakie Obiekty będzie musiał utworzyć
    *
    *
    *                                   APPLICATION CONTEXT (centalna Klasa zarządzająca)
    *
    *  -centralny Obiekt, w którym Spring przetrzymuje całą konfigurację - informacje o wszystkich zarządzanych przez siebie Obiektach
    *
    *
    *                                       ARCHITEKTURA WARSTWOWA
    *
    *  - warstwa prezentacji (Web Layer)->  odpowiedzialna za przyjmowanie żądań od klientów i zwracanie odpowiedzi
    *       Tutaj definiujemy kontrolery/ exceptions hanler- nasłuchiwanie na exceptiony i reagowanie na nie/
    *       filtry- odpowiednie filtrowanie informacji wejściowych czyli np porzez REGEX/ widoki palikacji/ obsługa użytkownika oraz wyglądu
    * - wartwa usługi (Service Layer)-> realizacja logiki biznesowej, zarządzanie transakcjami i zasobami
    *       obliczenie wyników np. kalkulatora/
    * - warstwa dostępu do danych (Repository Layer)
    *       zapisuje w bazie danych/ plikach
    *
    *
    *                                               MVC
    *
    *   Warstwa prezentacji w systemach warstwowych jest najczęściej zaimplementowana za pomocą wzorca MVC
    *
    *   Model -> logika palikacji
    *   View  -> odpowiedzialnyc za prezentację Modelu
    *   Controller -> zarzadza calym flow: odbiera zadania pobrania/ modyfikacji Modelu, deleguje do Modelu, wybiera View
    * 
    *   DAO - Data Access Object
    *   JSP - Java Server Pages (odpowiednik Thymeleaf)
    *
    *
    *   Spring Initializr - www.start.spring.io
    *
    *
    *                                            MAVEN
    *
    *   -> Centralne repozytorium MAVENa -> https://mvnrepository.com/
    *
    *   - Bob Budowniczy dla projektu. Ma budować projekty.
    *   - Chodzi o uzupełnianie zależności. Maven ma za zadnie automatycznie zaciągać wszelkie zależności kolejnych potrzebnych bibliotek.
    *   - Wspiera testy jednostkowe (gotowe środowisko do testowania)
    *
    *
    *
    *                   BUDOWANIE PROJEKTU w MAVEN (za pomocą Spring Initializr)
    *
    *   1) start.spring.io
    *   2) lepiej skorzystać z wersji 1-2 starszej ze względu na Bugi, które jeszcze nie zostały odkryte
    *   3) Group -> pl.mojafirma/ Artifact -> SpringProjekt1 /
    *   4) Packaging -> "Jar" to wersja embedded/ plik wykownywalny(exe dla Java). Zawiera w sobie cały serwer- aplikacja połączona z serwerem(TO WYBIERAMY >!<)
    *                   "War" to wyodrębnienie aplikacji w postaci "czystej" aplikacji
    *
    *
    *
    *
    *                                           HTTP
    *
    *
    *   - Sposoby zapytania -> GET/ POST/ PUT/ DELETE (podstawowe zapytania CRUD; wszystkich jest 10)
    *   - Response (odpowiedź serwera na zapytanie HTTP)
    *
    *
    *
    *
    * */
}
