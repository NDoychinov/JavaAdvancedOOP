package problemCardsWithPower;

import problemCardsWithPower.enums.CardRanks;
import problemCardsWithPower.enums.CardSuits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        CardRanks rank = CardRanks.valueOf(sc.readLine());
        CardSuits suit = CardSuits.valueOf(sc.readLine());
        Card card1 = new Card(rank, suit);

        rank = CardRanks.valueOf(sc.readLine());
        suit = CardSuits.valueOf(sc.readLine());
        Card card2 = new Card(rank, suit);

        if (card1.compareTo(card2) > 0) {
            System.out.println(card1.toString());
        } else {
            System.out.println(card2.toString());
        }
    }
}
