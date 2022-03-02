package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.GIT_OSKAR.Zad1;

public class Git_OPIS {

    // DropBox - aplikacja gdzie wrzucamy plik i on się aktualizuje z automatu
    // Git to system kontroli wersji
    // automatycznie wywoła komędę Git Init jak zrobimy w Inteliji
    /*
    //    " WORK DIR"
    * Git śledzi wszystkie pliki w repozytorium. Będzie śledził wszystkie zmiany w pliku, wykonane od ostatniego commita.
    * Jeżeli oznaczymy Klasę, że nie chcemy jej śledzić, to Git nie będzie jej trzymał w "working dir"
    *Jeżeli chcemy, żeby śledził, to musi sami dodać taki plik
    *
    *     " COMMITY "
    * Jeżeli plik jest "jasnobrązowy", to wtedy Git go nie śledzi
    * (wprowadziliśmy jakieś zmiany-> dodaliśmy Klasę/ coś dopisaliśmy) ->
    * -> VCS -> commit (na zielono będzie co dodaliśmy)
    */

    /*
    *     " STAGING AREA " (tutaj czekają na wrzucenie na serwer)
    *  jak zrobiliśmy commit, to pliku pojawią się tutaj
    *  (możemy dodać kolejne zmiany i zrobić commita)
    *
    *
    *
    *   "ZDALNE REPOZYTORIUM"
    *  żeby poliki tutaj trafiły, to trzeba zrobić "push" (wypchenimy ze Staging Area na zdalne repozytorium)
    *  Git będzie porównywał (robi sumy kontrolne), czy wersja Klas jest taka sama jak w naszym "Working Directory".
    *  Jeżeli jest to nic się nie dzieje wielkiego i commity ze Staging Area, trafią do zdalnego repozytorium.
    *  Jeżeli nie jest taka sama to jest konflikt)
    *
    *  KONFLIKT -> jeżeli wersja Klasy ze zdalnego repozytorium różnic się od Klas z Working Directory
    *  To oznacza, że ktoś, w międzyczasie wrzucił innąwersję kodu na zda;ne repozytorium, a my jej nie pobraliśmy na nasz komputer i pracujemy na nieaktualnej wersji kodu.
    *  Niektóre konflikty rozwiązują się automatycznie
    *  Podstawowy konflikt->  np.: ktoś podmieni tekst w metodzie, którą my też edytujemy (albo ktoś złamał zasadę SOLID i zmienił nazwę metody)
    *  Jeżeli jest konflikt, to Git każe najpierw pobrać repozytorium (pull), a dopiero póżniej możesz "push"
    *  Będzie trzeba rozwiązać konflikty, żeby "pull" przeszedł i wtedy można spróbować "push"
    *  --! -> jak się przytnie to trzeba zrobić jakąś zmiane i puścić jeszcze raz
    *
    *  WSPÓLPRACA:
    *
    * -> trzeba wejść w "Collaborants" na GitHub i dodać Nick (albo adres email) kto będzie współpracował w moim projekcie
    * -> Trzeba potwierdzić zaproszenie do współpracy
    *
    * */
    /* - synchronizacja kodu. Stworzył twórca Linuxa
    *  - stworzył protokół przesyłu danych
    *  - do tego powstały serwery; GitLab, GitHub, Bitbucket (różnią się polityką prywatności oraz różnymi bajerami)
    *
    *  - GitSCM -> gitscm.com
    *
    *
    *   BRANCH
    *
    * - odgałęzienie dla wersji Beta np dla wersji 1.1 (bo np. były bugi w wersji 1.0)
    * -> GIT -> branches -> add new branch | przełącza na gałąź, więc -> coomit + push
    *
    *
    *   SCALANIE
    *
    *   REBASE -> wtedy główny Branch będzie 1.1, czyli ten nowy
    *   MERGE -> wtedy dołączymy Branch 1.1 do głównego (origin/ master). Będąc na Master, czyli przyciagamy gałąź od tej na której jesteśmy
    *   (będąc na Master, wchodzą i zaznaszam 1.1-> Merge into current)
    *
    *
    *   COFNIĘCIE SIĘ
    *   - każdy commit ma swoją wersję kontrolną
    *   - git revert SHA
    *
    *#######    INSTALACJA:
    *
    * - autokofigurowalna (idiotoodporna)
    * - VIM -> edytor tekstowy z Linukca (w przypadku WIndowsa będzie uruchamiał zwykły notatnik)
    * - Use from WIndows Console
    * - Open SLL do autentyfikacji z różnymi serwerami
    * - Windows Style Line ending (czyli zostawiamy, żeby również obsługiwało w Linux)
    * - czyli...dalej, dalej, dalej
    *
    *
    *#######   KONSOLA CMD
    *
    * Komendy:
    * git - czy pojawi się opis
    * git --version
    *
    *PODPINANIE GITA POD INTELIJI:
    *
    * File -> settings -> (zkładka) version control -> (zkłądka) git ->
    *
    * --> path to git executable(wiersz do wpisania na górze) ->
    * --> wstawiamy ścieżkę do pliku gdzie zainstalował na się git (czyli do pliku git.exe)
    * --> Klikamy TEST (żeby sprawdzić czy wszystko działa)
    *
    * ZAKLADAMY KONTO NA GIT HUB (moje -> "Philo-Tech")
    *
    * WRZUCANIE PROJEKTU Z POZIOMU INTELIJI
    * VCS -> Share Project on GitHub -> (poprosi o logowanie) wybieramy "password" (a nie token)
    * -> podajemy login i hasło
    *
    * (gdybyśmy pracowali w Git, to repozytorium trzeba zrobić ręcznie po stronie GitHub, a później łączyć się przez konsolę)
    * Inteliji sam robi repozytorium na GitHub, póżniej sam robi commit i push
    *
    * "remote name" -> odnośnik/ nazwa do naszego serwera; domyślnie podaje się nazwę "origin"; drugi odnośnik nie może nazywać się tak samo (jednak naszym serwerem jest GitHub )
    * nie zmieniamy opisu projektu (albo i zmieniamy :)
    *
    * -> dostaniemy link do naszego projektu
    *
    * CONFIGURACJA (w CMD):
    * git config --global user.name "Nick"  // sprawdzenie: git config --global user.name
    * git config --global user.email "moj@adres.pl"  //sprawdzenie:  git config --global user.email
    *
    * SPRAWDZENIE CZY JEST COS DO COMMITOWANIA:
    * VCS -> commit (czy wyświetlą się jakieś commity do zrobienia)
    * -> Wstawić opis do commita (description)
    * -> VCS -> Git -> Push
    *
    *
    *
    *
    *
    *
    *
    * */
}
