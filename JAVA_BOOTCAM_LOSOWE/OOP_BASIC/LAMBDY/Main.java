package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.LAMBDY;

public class Main {

    /*
    * (lista parametrów) -> ciało wyrażenia
    * () -> sout("");
    * (Integer x, Double y) -> x * y
    * */

    public static void main(String[] args) {

        // skorzystanie z interfejsu funkcyjnego
        Multiplication multiplication = (x, y) -> x * y;

        int result = multiplication.multiply(5,3);
        System.out.println(result);
        /////////////////////////////////////////////////////////
        System.out.println(getSum(2,3));

        UppercaseInterface upper = (s -> s.toUpperCase());// to samo na dwa sposoby
        UppercaseInterface upper2 = (String::toUpperCase);
        System.out.println(upper.makeUpperCase("ala ma kota"));
    }

    // z reguły tak się korzysta z interfejsów
    private static int getSum(int a, int b){
        Multiplication multiplication = (x,y) -> x + y;
        return multiplication.multiply(a,b);
    }

}
