package problemCardsWithPower.enums;

import problemCardsWithPower.annotations.Suit;

/**
 * Created by Niki on 20.7.2016 г..
 */

@Suit
public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

}
