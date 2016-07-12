package Telephony;

import java.util.Scanner;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Callable callPhone = new Smartphone();

        String[] numbers = sc.nextLine().split("\\s+");
        for (int i = 0; i < numbers.length; i++) {
            callPhone.call(numbers[i]);
        }

        Browsable browsePhone = new Smartphone();
        String[] urls = sc.nextLine().split("\\s+");
        for (int i = 0; i < urls.length; i++) {
            browsePhone.browse(urls[i]);
        }

    }
}
