package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ADNOTACJE.Zad1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// gdzie może być używana nasza Adnotacja -> Target()
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.TYPE})
//Retencja -> ma trzy stany:
// 1) SOURCE- pomijana przez kompilator, istnieje tylko na etapie kodu źródłowego
// 2) RUNTIME -> działa podczas funkcjonowaniu programu
// 3) CLASS -> podejście domyślne, będzie w kodzie bajtowym, ale nie widać jej podczas działania aplikacji
@Retention(RetentionPolicy.RUNTIME) // musi być RUNTIME, ponieważ klasa będzie niewidoczna. Jeżeli chcemy korzystać z Adnotacji podczas działania programu
public  @interface Doc {
    // budowa jak Interfejs + @

    // przyjecie parametru
    String info();

    // dodajemy REGEX do kntroli



}
