package problemDeckOfCards;

import problemDeckOfCards.enums.CardRanks;
import problemDeckOfCards.enums.CardSuits;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        CardRanks[] ranks = CardRanks.values();
        CardSuits[] suits = CardSuits.values();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                System.out.printf("%s of %s%n", ranks[j], suits[i]);
            }
        }
    }
}
