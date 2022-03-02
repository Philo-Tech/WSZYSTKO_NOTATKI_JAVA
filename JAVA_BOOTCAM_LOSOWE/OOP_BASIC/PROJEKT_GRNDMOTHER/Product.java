package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PROJEKT_GRNDMOTHER;

import java.util.Objects;

public class Product {
    // klasa modelu danych reprezentująca Produkt -> POJO "Plain Old Java Object". Najlepiej tworzyć staor-javowe, niezależne, klasy

    private String name;
    private double price;
    private int count;

    public Product(String name, int count,double price) { // WAŻNE! żeby zachować taką samą kolejność jak zapis w pliku
        this.name = name;
        this.price = price;
        this.count = count;
    }
    // setterów nie potrzeba ponieważ lista już jest narzucona w pliku


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    // meotdy potrzebne do optymalizacji Kodu, ponieważ będę używał Kolekcji ArrayList<>
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && count == product.count && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, count);
    }

    // żeby ładnie wyświetlało to implementuję toString

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
