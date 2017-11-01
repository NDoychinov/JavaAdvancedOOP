package problemStackIterator;

import problemStackIterator.Interfaces.StackInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StackInteger intStack = new IntegerStack();
        String[] data = sc.readLine().trim().split("[ ,]+");

        while (!data[0].equals("END")){
            switch (data[0]){
                case "Push":
                    for (int i = 1; i < data.length; i++) {
                        intStack.push(Integer.parseInt(data[i]));
                    }
                    break;
                case "Pop":
                    try {
                        intStack.pop();
                    } catch (NoSuchElementException nsee){
                        System.out.println(nsee.getMessage());
                    }

                    break;
            }


            data = sc.readLine().trim().split("\\s+");
        }
        intStack.printAll();
        intStack.printAll();
    }
}
