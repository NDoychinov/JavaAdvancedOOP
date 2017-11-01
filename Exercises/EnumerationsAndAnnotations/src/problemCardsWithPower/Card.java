package problemCardsWithPower;

import problemCardsWithPower.enums.CardRanks;
import problemCardsWithPower.enums.CardSuits;

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

    private void setRank(CardRanks rank) {
        this.rank = rank;
    }

    private void setSuit(CardSuits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(),
                this.suit.name(),
                this.cardPower);
    }


    @Override
    public int compareTo(Card card) {
        return Integer.compare(this.cardPower, card.cardPower);
    }
}
