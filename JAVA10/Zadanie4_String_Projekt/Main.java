package com.company.JAVA10.Zadanie4_String_Projekt;

public class Main {

    public static void main(String[] args) {

        String hello = "        Hello world        ";
        System.out.println(hello.length());
        System.out.println(hello);

        String hello2 = "Hello world        ";
        System.out.println(hello2.length());
        System.out.println(hello.trim());

        System.out.println(hello.toUpperCase());

        boolean b = hello.isEmpty();
        System.out.println(b);

        System.out.println(hello.length());

        int c = hello.length();
        System.out.println(c);

        char c1 = hello.charAt(8);
        System.out.println(c1);

        char c2 = 'p';
        System.out.println(c2);

        System.out.println((int) c2);
        System.out.println((char)112);

        /** toCharArray()   */
        char[] aa = hello.toCharArray();
        System.out.println(hello.toCharArray());

        System.out.println(aa);

        for (int i = 0; i < aa.length; i++) {

            System.out.print (aa[i]);

        }

        String sentence = "Ala ma kota i psa";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
        System.out.println(words[3]);

        String nowy = sentence.replace('a','.');
        System.out.println(nowy);

        boolean bo = hello.matches("hello : [0-30]");
        System.out.println(bo);

        /** equals() */

        String string4 = "hello";
        String string5 = "Hello";

        boolean bbb = string4.equals(string5);
        System.out.println(bbb);
        boolean ccc = string4.equalsIgnoreCase(string5);
        System.out.println(ccc);


    }
}
