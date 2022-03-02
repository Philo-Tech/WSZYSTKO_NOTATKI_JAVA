package com.company.JAVA10.Zadanie_30_Gra_Wojna;

import java.util.List;

public class RarityBattle implements Battle{


    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2, boolean liveOutput) {

        int deck1RareCounter = 0;
        int deck2RareCounter = 0;

        for (Card card : deck1){
            if(card.isRare()) deck1RareCounter++;
        }
        System.out.println("Deck 1 contains " + deck1RareCounter + "rare cards");

        for (Card card : deck2){
            if(card.isRare()) deck2RareCounter++;
        }
        System.out.println("Deck 2 contains " + deck2RareCounter + "rare cards");

        if (deck1RareCounter > deck2RareCounter){
            return 1;
        }else if(deck1RareCounter < deck2RareCounter){
            return -1;
        }else return 0;
    }
}
