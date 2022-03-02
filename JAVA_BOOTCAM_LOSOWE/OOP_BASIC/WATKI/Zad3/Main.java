package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.WATKI.Zad3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // Thread Executor -> wyzwalacze/ egzekutory wątków
    public static void main(String[] args) {

        // ExecutorService -> załatwi za nas zarządzanie tymi wątkami. Oddajemy sterowalność na rzecz Java
        // Jak zadanie się skończy to ten wątek nie umrze, tylko będzie oczekiwał w gotowości na następne zadanie
        // Umrze dopiero wtedy jeżeli my mu na to pozwolimy
        // Utworzy tylko jeden wątek w swojej strategii; najpierw wykona się jedno zadanie, a jak się zakończy to dopiero ruszy drugie na tym samym wątku
        ExecutorService executorService = Executors.newSingleThreadExecutor(); // najprostsza strategia
        // kilka strategii, np.
        // "newSingleThreadExecutor()" -> strategia zawierająca jeden wątek
        // "newScheduledThreadPool()" -> otwiera pole, gdzie będziemy mogli tworzyć powtarzalne wątki (żeby jakieś zadanie wtkonywało się kilkukrotnie)
        // "newFixedThreadPool()" -> sami będziemy ustalać ilość wątków w naszej strategii
        // "newSingleThreadScheduleExecutor()" -> zadanie będzie powtarzało się n-razy, tylko na pojedynczym wątku
        // "newCachedThreadPool()" ->  tworzy tyle wątków ile zadań do strategii przekażemy, ale jeżeli wątek nie ma zadania przez 30 sekund, sam się wyłącza i umiera


        executorService.execute(new Runnable() { // metoda execute() -> odpowiada za przekazanie zadania / za uruchomienie zadania w puli wątków /przekazujemy jakieś zadanie do puli wątków
            // new Runnable -> Klasa odpowiadająca za przekazanie zadania
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {

                    if (Thread.currentThread().isInterrupted()){ // sprawdza Flagę metody "shutDownNow()".
                        // Wstawiliśmy "furtkę awaryjną", gdyby flaga się zmieniłą, to przerwiemy działanie wątku, ponieważ wyjdziemy z pętli
                        //
                        break;
                    }
                    System.out.println("Witaj");
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Witaj 2");
                }
            }
        });
        // Wątek nadal czeka, bo nie wie, że nie ma więcej zadań do wykonania
        // Nawet aplikacja się nie wyłączy, ponieważ nasz wątek dalej sobie czeka, czyli ma ona działające wątki w sobie (po wykonaniu tych dwóch zadań)
        // Proces będzie działał dopóki wszystkie wątki nie zakończą swojej pracy
        // Są dwie komendy dla tej strategii: "shutdown" i "shutDownNow"

        //executorService.shutdown(); // komenda ta oznacza -> zamknij wątek roboczy (czyli nasz) i wyłącz ExecutorService, gdy skończysz wszystkie zadania, które były do obsłużenia
        executorService.shutdownNow(); // to samo co wyżej, ale po zakońćzeniu zadania, które się aktualnie wykonuje. Nie wykonuj zadań, które czekają, ale się jeszcze nie rzopoczęły
        // jezeli nie wykonujesz żadnego zadania w tym momencie, to wyłącz
        // zmienia "Flagę" na wątku. Ta flaga nazywa się "Interrupt"
    }
}
