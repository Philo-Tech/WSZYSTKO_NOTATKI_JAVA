package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.REFLEKSJE.Zad2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    // zliczy liczbę argumentów metod w klasie Person
    public static void main(String[] args) {


        Method[] methodsInMyClass = Person.class.getDeclaredMethods();
        int counter = 0;

        for (Method inMyClass : methodsInMyClass) {
            inMyClass.setAccessible(true);
            counter += inMyClass.getParameterCount();
        }
        System.out.println(counter);

        try {
            Person person = Person.class.newInstance();
            Person.class.getMethod("setAge", int.class).invoke(person,5); // getMethod("nazwaMetody", coZwraca).invoke(obiektKlasy, naszArgument);   Trzeba dodać Exceptiony/ invoke -> uruchamiamy metodę
            // int.class -> to varArgs -> jak to pominiemy to tablica tworzy się pusta
            System.out.println(Person.class.getMethod("getAge").invoke(person));
            //person.setAge(5);
            System.out.println(person.getAge());

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        } /*catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/

        //
    }
}
