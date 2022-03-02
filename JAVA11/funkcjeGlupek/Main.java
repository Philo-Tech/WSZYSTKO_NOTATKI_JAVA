package com.company.funkcjeGlupek;

public class Main {


    static int f(int x){

        return x;
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        System.out.println(f(5));

        int number = f(3);

        System.out.println(number);

        sayHello();
    }
}
