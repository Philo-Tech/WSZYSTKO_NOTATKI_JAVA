package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_3_lokalne_klasy_wew;

public class Main {

    public static void main(String[] args) {
                // lokalne klasy nie mają modyfikatorów dostępu
                class LocalClass{ // klasa stworzona w metodzie

                    private int number;
                    public String getSomeString(){// obojetnie czy publi/private/protected-> nie ma zastosowania
                        return "Jakiś ciekawy napis z klasy wewnetrznej lokalnej";
                    }
                }
                // utworzenie obiektu klasy wewnetrznej lokalnej
                LocalClass localClass = new LocalClass();
                System.out.println(localClass.getSomeString());

                //wywolanie pola prywatnego
                System.out.println(localClass.number);


    }
}
