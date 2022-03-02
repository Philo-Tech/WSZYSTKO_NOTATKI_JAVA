package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.METODY3.Zad7;

public class Main {
    public static void main(String[] args) {

        addTwoStringa("aaa", "bbb");
    }

    public static int addTwoStringa(String s1, String s2){

        String nowy = s1.concat(s2);
        System.out.println(nowy.length());
        return nowy.length();
    }
}
