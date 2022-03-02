package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZadanieZoo;

public abstract class Animal {
    /* ma własności klasy oraz interfejsu
    *  */

    private int id;
    protected String name;
    protected float weight;
    private static int COUNTER = 0;

    public Animal(String name, float weight) {
        this.id = ++COUNTER; // COUNTER jest statyczny, dlatego podczas tworzenia nowego Obiektu Klasy, on nie zostanie skasowany.
        // Zmienne statyczne, są ładowane do pamięci trwałej. Zachowują swój stan niezależnie od pracy aplikacji
        // Przy tworzeniu nowego Obiektu, przy użyciu tego samego Konstruktora, ta zmienna, zachowa swój poprzedni stan
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/ // wywalam "setId" bo nie chcę, żeby był dostępny na zewnątrz. Nie będzie można ustawić ręcznie

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Animal.COUNTER = COUNTER;
    }

    public abstract void introduce();// analogiczna metoda do metod z Interfejs. Trzeba trochę inaczej zapisać; dodać "public abstract"
    // metoda abstrakcyjna nie może mieć ciała
}
