package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEJKI.Zad2;

public class Task implements Comparable<Task> { // Interfejs parametryzowany generycznie

    // żeby nasza klasa była porównywalna (Comparable), to trzeba zaimplementować taki Interfejs
    // Interfejs mówi, że "coś jest czymś". Interfejs Comparable mówi, że Klasa Task jest porównywalna

    private int weight;
    private String taskMessage;

    public Task(int weight, String taskMessage) {
        this.weight = weight;
        this.taskMessage = taskMessage;
    }

    public int getWeight() {
        return weight;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    // trzeba samemu przerobić
    //
    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.weight, o.getWeight());// żeby odrówić sortowanie rosnące->  "o.getWeght() * -1"
    } // meotoda Compare, wyciągnięta z Klasy Integer będzie porównywać rosnąco
}
