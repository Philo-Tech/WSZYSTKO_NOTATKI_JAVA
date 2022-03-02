package com.company.JAVA10.Zadanie23_stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Integer.toBinaryString
        // Stack- stos - LIFO Last In First Out
        System.out.println(stringToBinary(5));
    }

    public static String stringToBinary(int n){
        Stack<Integer> stck = new Stack<>();

        while (n != 0){
            stck.add(n % 2);
            n /=2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stck.isEmpty()){
            stringBuilder.append(stck.pop());
        }
        return  stringBuilder.toString();

    }
}
