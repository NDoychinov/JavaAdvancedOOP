package problemCardGame;


import problemCardGame.enums.CardRanks;
import problemCardGame.enums.CardSuits;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Card implements Comparable<Card> {

    private CardRanks rank;
    private CardSuits suit;
    private int cardPower;

    public Card(CardRanks rank, CardSuits suit) {
        this.setRank(rank);
        this.setSuit(suit);
        this.calculateCardPower();
    }

    private void calculateCardPower() {
        this.cardPower = this.rank.getPower();
        this.cardPower += this.suit.getPower();
    }

    public int getCardPower() {
        return cardPower;
    }

    private void setRank(CardRanks rank) {
        this.rank = rank;
    }

    private void setSuit(CardSuits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.rank.name(),
                this.suit.name());
    }


    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.cardPower, card.cardPower);
    }
}
