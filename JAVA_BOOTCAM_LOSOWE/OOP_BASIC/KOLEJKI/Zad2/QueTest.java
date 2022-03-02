package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEJKI.Zad2;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueTest {
    public static void main(String[] args) {

        Queue<Task> priorityQueue = new PriorityQueue<>(); // działą zasada LISKO(???) dlatego możemy wpisać "PriorityQueue" w zwykłą kolejkę Queue

        priorityQueue.add(new Task(3, "Zrob pranie"));
        priorityQueue.add(new Task(1, "wyprowadz psa"));
        priorityQueue.add(new Task(5, "zrob zakupy"));
        priorityQueue.add(new Task(9, "podlej kwiaty"));

        for (Task t : priorityQueue) {
            System.out.println(t.getWeight() + " " + t.getTaskMessage());
        }
        System.out.println();

        for (int i = 0; i < priorityQueue.size(); i++) {
            System.out.println(priorityQueue.element().getTaskMessage());// wypisze 4x co jest "w głowie kolejki"
        }// element() -> podejrzymy co jest "na głowie kolejki". Rzuca wyjątek, gdy kolejka jest pusta
        // peak() -> to co wyżej, tylko nie ostrzega, że kolejka jest pusta, tylko zwraca "Null"


        System.out.println();
        System.out.println("Wielkość kolejki: " + priorityQueue.size()); // na kolejkcjach wielkość pokazuje metoda size()
        System.out.println();
        // ta pętla jest lepsza
        while (priorityQueue.size() > 0) {

            System.out.println(priorityQueue.poll().getTaskMessage());
        }

        // poll() -> usuwa wszystko i nie zwraca Null
        // remove() -> zwróci zadanie, a póżniej je usunie

        System.out.println("Wielkość kolejki: " + priorityQueue.size()); // na kolejkcjach wielkość pokazuje metoda size()

        // offer() -> rzuca wyjątki (gdy nie da się zrzutować/ NullPointer gdy element jest nullem, a kolejka tych nulli nie akceptuje/ illegalArgument gdy element nie może być dodany do kolejki )
        // add() -> rzuca wyjątkiem, gdy kolejka jest pełna i nie pozwala dodać elementu (IllegalStateException -> bo kolejka jest pusta i nie można dodać więcej). Metoda "offer()" nie rzuci takiego wyjątku

        // BlockingQueue - pozwala określić maksymalną ilość elementów w kolejce
    }
        public <T> void addToQueue(T task, Queue<T> queue){
            if (queue.size()>100){
                throw new IllegalStateException("Queue is full");
            }
            queue.add(task);
        }

        // lub mozna boolean jeżeli uda się dodać do kolejki i false, jeżeli się nie uda

    public <T> boolean addToQueue(T task, Queue<T> queue){
        if (queue.size()>100){
            return false;
        }
        queue.add(task);
        return true;
    }

}














