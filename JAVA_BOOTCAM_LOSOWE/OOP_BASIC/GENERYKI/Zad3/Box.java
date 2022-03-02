package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.GENERYKI.Zad3;

public class Box <T extends Number>{ //  <T extends Number>   jeżeli chcemy, żeby ktoś podawał tylko liczby (boolean, int, float, Integer) // po czym ma dziedziczyć klasa podstawiana pod <T>
                                    // class Box <T extends A & B & C>      A- klasa   B i C - interfejs
                                    // 2018_04_14  6h 50 min
                                    // WildCart
                                    // Box <? extends String> box = new Box<>("5");  -> Stringi i wszystko co po nich dziedziczy  "?"
                                    // Box <? super String> box = new Box<>("5");    -> Stringi i wszystko
    private T[] array;

    public Box(int i){
        array= (T[]) new Object[i];  // żeby można było przechowywać wszystko, to robimy Object a póżniej rzutujemy na <T> gdzie zostanie podstawiony docelowy typ
    }

    public void add(T element){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array[i] = element;
                break;
            }
        }
    }

    public void printArray(){
        for (T t : array) {
            System.out.println(t);
        }
    }


}
