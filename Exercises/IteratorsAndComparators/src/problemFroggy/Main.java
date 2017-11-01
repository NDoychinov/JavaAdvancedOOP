package problemFroggy;

import problemFroggy.interfaces.Lake;
import problemFroggy.models.LakeImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        Lake lake = new LakeImpl();

        String[] platforms = sc.readLine().split("[, ]+");

        for (int i = 0; i < platforms.length; i++) {
            lake.addPlatform(Integer.parseInt(platforms[i]));
        }

        lake.frogJump();
    }
}
