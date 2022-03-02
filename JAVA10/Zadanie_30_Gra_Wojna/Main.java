package com.company.JAVA10.Zadanie_30_Gra_Wojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        printDeck(createDeck(10,5));

        Battle battle = new RarityBattle();
        //int whoWin = battle.checkWinner(createDeck(10,5), createDeck(10,5));

    }

    public static List<Card> createDeck(int randSeed, int deckSize){
        List<Card> rc = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < deckSize; i++) {
            int cValue = random.nextInt(10) + 1;
            CardColor cardColor = CardColor.values()[random.nextInt(CardColor.values().length)];
            boolean cRare = random.nextBoolean();
            rc.add(new Card(cValue, cardColor, cRare));
        }
        return rc;
    }

    public static void printDeck(List<Card> cards){
        for(Card c: cards){
            System.out.println(c + " ");
        }
        System.out.println();
    }
}
