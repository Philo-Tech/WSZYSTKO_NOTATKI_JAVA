package com.company.JAVA10.Zadanie_30_Gra_Wojna;

public enum CardColor {

    Clubs(1), // tefl
    Diamods(2),    // karo
    Hearts(3),    // kier
    Spades(4) ;    // pik

    private int value;

    CardColor(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
