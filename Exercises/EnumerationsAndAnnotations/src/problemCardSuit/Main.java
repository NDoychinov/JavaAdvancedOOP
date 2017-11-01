package problemCardSuit;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        CardSuits[] suitses = CardSuits.values();

        System.out.println("Card Suits:");

        for (int i = 0; i < suitses.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    suitses[i].ordinal(), suitses[i].toString());
        }
    }
}
