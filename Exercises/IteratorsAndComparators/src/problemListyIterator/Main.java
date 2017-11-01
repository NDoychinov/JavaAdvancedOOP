package problemListyIterator;

import problemListyIterator.interfaces.Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Iterator<String> myIterator = new ListyIterator<String>();

        String[] data = sc.readLine().trim().split("\\s+");

        while (!data[0].equals("END")) {
            switch (data[0]) {
                case "Create":
                    for (int i = 1; i < data.length; i++) {
                        myIterator.addEl(data[i]);
                    }
                    break;
                case "Move":
                    System.out.println(myIterator.move());
                    break;
                case "Print":
                    try {
                        myIterator.print();
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(myIterator.hasNext());
                    break;

            }


            data = sc.readLine().trim().split("\\s+");
        }
    }
}
