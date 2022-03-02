package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.TABLICE.Zad11;

public class Main {

    public static void main(String[] args) {

        int[] a = twoMiddle(new int[]{1,2,3,4});
        int[] b = twoMiddle(new int[]{1,2,3});


        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] twoMiddle(int[] tab){

        int[] temp = new int[2];
        int[] temp2 = new int[1];

        if (tab.length % 2 == 0) {

            temp[0]=tab[(tab.length/ 2)-1];
            temp[1]= tab[(tab.length/2)];
            return temp;
        }
        else {
            temp2[0] = tab[tab.length / 2];
        }
        return temp2;
    }
}
