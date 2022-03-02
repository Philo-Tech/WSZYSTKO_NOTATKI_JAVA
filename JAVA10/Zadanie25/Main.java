package com.company.JAVA10.Zadanie25;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("white");
        colors.add("black");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolor: ");
        String s = scanner.next();

        System.out.println(findCIndexOfColor(s,colors));
        System.out.println(reversOfList(colors));

    }
    static int findCIndexOfColor(String color, List<String> colors){
       int index = 0;

            if (colors.contains(color)) {
                index = colors.indexOf(color);
            }else {
                return -1;
            }
            return index;
    }

    static List<String> reversOfList(List<String> colors){
        Collections.reverse(colors);
        return colors;
    }
}
