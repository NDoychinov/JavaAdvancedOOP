package Ferrari;

import java.util.Scanner;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        FerrariImpl ferrari = new Ferrari(name);

        System.out.printf("%s/%s/%s/%s%n", ferrari.carModel,
                ferrari.useBrakes(),
                ferrari.pushGas(),
                ferrari.getDriver());

    }
}
