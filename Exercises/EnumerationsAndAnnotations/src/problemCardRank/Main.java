package problemCardRank;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        CardRanks[] cardRanks = CardRanks.values();

        System.out.println("Card Ranks:");
        for (int i = 0; i < cardRanks.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    cardRanks[i].ordinal(), cardRanks[i].toString());
        }
    }
}
