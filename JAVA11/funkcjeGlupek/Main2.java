package com.company.funkcjeGlupek;

public class Main2 {

    void sayBay(){
        System.out.println("Say bay bay");
    }

    public static void main(String[] args) {
        Main.sayHello();

        System.out.println(factorial(2));

        System.out.println(factorial(2)+factorial(2)+factorial(2));

        Main2 main2 = new Main2();
        main2.sayBay();
    }

    static int factorial(int n) {
        int sum = 1;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
