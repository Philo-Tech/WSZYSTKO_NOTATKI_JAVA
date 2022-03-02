package com.company.wstep;

public class MainKlasy1 {

    public static void main(String[] args) {

        System.out.println( wordConcat("wyświetlam"));

        String string1 = wordConcat("słowo");
        System.out.println(string1);

        System.out.println("Hello world");
       /* *
        komentarze wielowierszowe    shift+ ctrl + ?

        * */

    }

    public static String wordConcat(String string){

        return string + "  " + string;
    }
}
