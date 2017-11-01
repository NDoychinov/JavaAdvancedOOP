package problemCardGame;


import problemCardGame.enums.CardRanks;
import problemCardGame.enums.CardSuits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        List<String> drawedCards = new ArrayList<>();

        Player player1 = new Player(sc.readLine());
        Player player2 = new Player(sc.readLine());

        while (player1.hasEmptySpace()) {
            String input = sc.readLine();
            String[] data = input.split("\\s+");
            try {
                Card card = new Card(CardRanks.valueOf(data[0]),
                        CardSuits.valueOf(data[2]));
                if (!drawedCards.contains(input)) {
                    player1.addCard(card);
                    drawedCards.add(input);
                } else {
                    System.out.println("Card is not in the deck.");
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("No such card exists.");
            }
        }

        while (player2.hasEmptySpace()) {
            String input = sc.readLine();
            String[] data = input.split("\\s+");
            try {
                Card card = new Card(CardRanks.valueOf(data[0]),
                        CardSuits.valueOf(data[2]));

                if (!drawedCards.contains(input)) {
                    player2.addCard(card);
                    drawedCards.add(input);
                } else {
                    System.out.println("Card is not in the deck.");
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("No such card exists.");
            }
        }

        if (player1.getHighestCard().compareTo(player2.getHighestCard()) > 0){
            System.out.printf("%s wins with %s.", player1.getName(),
                    player1.getHighestCard().toString());
        } else {
            System.out.printf("%s wins with %s.", player2.getName(),
                    player2.getHighestCard().toString());
        }
    }
}
