package com.company.Zadanie9_rekurencja;

public class Main {

    public static void main(String[] args) {
        System.out.println(crazyMethod(10));

    }

    private static int crazyMethod(int a ){
        System.out.println(a);
        return crazyMethod(a + 1);
    }
}
