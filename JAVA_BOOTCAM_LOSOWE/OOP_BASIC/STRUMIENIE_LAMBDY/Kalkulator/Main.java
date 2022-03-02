package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.Kalkulator;

public class Main {
    public static void main(String[] args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a,b) -> a + b;
        IntegerMath substraction = (a,b) -> a - b;

        System.out.println("40 + 2 -> " + myApp.operationBinary(40, 2, addition));
        System.out.println("20 - 10 -> " + myApp.operationBinary(20,10, substraction));
    }
}
