package com.company.Zadanie6;

public class Main {

    public static void main(String[] args) {

        someMethod();
        someMethod("jakieś imie");
        someMethod("jakieś imie", 25);

    }
    //#############################################

    //metoda jest przeciążona- program posiada drugą implementację tej samej metody
    public static void someMethod(){
        System.out.println("Jestem metodą, która nic nie robi");
    }

    public static void someMethod(String name) // przeciążanie metody
    {
        System.out.println("Jestem metodą zwracająca imię: " + name);
    }

    public static void someMethod(String name, int age){
        System.out.println("Jestem metodą zwracająca imię " + name + " oraz wiek " + age);
    }

    public static void someMethod(String name, int age, final String city){

    }

}
