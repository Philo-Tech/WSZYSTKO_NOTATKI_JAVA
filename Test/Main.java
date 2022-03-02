package com.company.Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("podaj txt:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String f = s.replace("A","4");
        String r = s.replace("a", "@");

        System.out.println(f);
        System.out.println(r);
    }
}
