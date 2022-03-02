package com.company.JAVA10.Zadanie2_StringBuffer;

public class Main {

    // ************ StringBuffer *******************
    // - jest Mutable (mozna ja modyfikować)
    // - bezpieczny do modyfikacji wielowątkowej
    // - wykonuje operacje na ciagach ()
    // - jest jest klasą synchronizowaną i działą wolniej od StringBuilder

    public static void main(String[] args) {


        StringBuffer sBuffer = new StringBuffer("Hello world");
        sBuffer.append(sBuffer);
        System.out.println(sBuffer);
    }
}
