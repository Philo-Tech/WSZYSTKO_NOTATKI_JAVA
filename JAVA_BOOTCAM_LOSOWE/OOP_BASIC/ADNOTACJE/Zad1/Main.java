package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ADNOTACJE.Zad1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    // Adnotacje to Metadane, nie mają żadnego wpływy na kod źródłowy (ale np sprawdzają, czy metoda jest nadpisana i czy jest dobrze przesłonięta)
    // za pomocą refleksji można sprawdzić czy występują adnotacje
    //
    // @Deprecated ->  coś co jest tym oznaczone, prawdopodobnie zostanie usunięte w przyszłości (jak ją wywołamy, to będzie przekreślona)
    // @SuppressWarnings() -> służy do pozbycia się błedu, gdy np chcemy skorzystać z jakiejś fukcjonalności, która była we wcześniejszej Java (później gdzieś zmienimy tę funkcjonalność)


    public static void main(String[] args) {

        docStrategy();

    }

    // silnik do adnotacji
    public static void docStrategy() {
        // piszemy parser
        Method[] methods = Person.class.getDeclaredMethods();
        Field[] fields = Person.class.getDeclaredFields();
        Constructor[] constructors = Person.class.getConstructors();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Doc.class)) {
                System.out.println(method.getAnnotation(Doc.class).info());
            }
        }

        for (Field field : fields) {
            if (field.isAnnotationPresent(Doc.class)) {
                System.out.println(field.getAnnotation(Doc.class).info());
            }
        }

        for (Constructor constructor : constructors) {
            if (constructor.isAnnotationPresent(Doc.class)){
                System.out.println(constructor.getAnnotation(Doc.class).toString());
            }
        }
    }

}
