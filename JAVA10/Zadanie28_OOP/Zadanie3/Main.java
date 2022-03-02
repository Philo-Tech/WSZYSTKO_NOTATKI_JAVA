package com.company.JAVA10.Zadanie28_OOP.Zadanie3;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mem mem = new Mem("pierwszy", "https://www.wp.pl", "jakis tam spobie mem", false);
        Mem mem2 = new Mem("drugi", "https://www.wp.pl", "jakis tam spobie mem", true);
        Mem mem3 = new Mem("trzeci", "www.wp.pl", "jakis tam spobie mem", true);
        Mem mem4 = new Mem("czwarty", "www.wp.pl", "jakis tam spobie mem", false);
        Mem mem5 = new Mem("piąty", "www.wp.pl", "jakis tam spobie mem", false);

        List<Mem> memList = new ArrayList<>();
        memList.add(mem);
        memList.add(mem2);
        memList.add(mem3);
        memList.add(mem4);
        memList.add(mem5);

        for (Mem m : memList) {
            if (m.isFavorit()) {
                System.out.println(m);
                URI uri = URI.create(mem.getUrl());
                System.out.println(uri.getHost());
            }

        }
    }
}
