package problemTrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String[] data = sc.readLine().split("\\s+");
        TrafficMachine trafficMachine = new TrafficMachine(data);

        int count = Integer.parseInt(sc.readLine());
        for (int i = 0; i < count; i++) {
            trafficMachine.changeLights();
            System.out.println(trafficMachine.toString());
        }
    }
}
