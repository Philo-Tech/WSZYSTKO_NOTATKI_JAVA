package com.company.JAVA10.Zadanie18_Tablica_stringów;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] str = new String[]{"Kupa1", "Kupa2", "KUP", "CoS"};
        System.out.println(Arrays.toString(zwrocPiecioliterowe(str)));
        System.out.println(Arrays.toString(zwrocTabliceMaleLitery(str)));
    }


    static String[] zwrocPiecioliterowe(String[] str){

        int wielkoscNowej = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i].length() == 5){
                wielkoscNowej++;
            }
        }

        String[] strNowa = new String[wielkoscNowej];

        int k = 0;
            for (int j = 0; j < str.length; j++) {

                if(str[j].length() == 5){
                    strNowa[k] = str[j];
                    k++;

                } else continue;
            }
         return strNowa;
    }

    static String[] zwrocTabliceMaleLitery(String[] str){

        String[] strMale = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            strMale[i] = str[i].toLowerCase();
        }
        return strMale;
    }
}
