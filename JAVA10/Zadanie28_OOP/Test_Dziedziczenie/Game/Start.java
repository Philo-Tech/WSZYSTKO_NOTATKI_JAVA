package com.company.JAVA10.Zadanie28_OOP.Test_Dziedziczenie.Game;

import com.company.JAVA10.Zadanie28_OOP.Test_Dziedziczenie.Buildings.Towers.BowTower;
import com.company.JAVA10.Zadanie28_OOP.Test_Dziedziczenie.Buildings.Towers.Tower;

public class Start {

    public static void main(String[] args) {

        Tower bowTower = new BowTower("Bow Tower", 120,24.5,0.2, 0.2);
        System.out.println(bowTower);

        BowTower bowTower1 = new BowTower();
        System.out.println("\n\n " + bowTower1.getTitle());


    }
}
