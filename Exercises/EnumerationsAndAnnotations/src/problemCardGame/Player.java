package problemCardGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Player {
    private String name;
    private List<Card> handOfCards;

    public Player(String name) {
        this.name = name;
        this.handOfCards = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public Card getHighestCard() {
        Card currHighest = this.handOfCards.get(0);
        for (int i = 1; i < this.handOfCards.size(); i++) {
            if (this.handOfCards.get(i).getCardPower() > currHighest.getCardPower()){
                currHighest = this.handOfCards.get(i);
            }
        }
        return currHighest;
    }

    public boolean hasEmptySpace(){
        if (this.handOfCards.size() < 5){
            return true;
        }
        return false;
    }

    public void addCard(Card card) {
        this.handOfCards.add(card);
    }
}
