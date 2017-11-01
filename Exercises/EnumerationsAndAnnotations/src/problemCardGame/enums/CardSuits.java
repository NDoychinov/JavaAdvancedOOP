package problemCardGame.enums;

/**
 * Created by Niki on 20.7.2016 г..
 */

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
