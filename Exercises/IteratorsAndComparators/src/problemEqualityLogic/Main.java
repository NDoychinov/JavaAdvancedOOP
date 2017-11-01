package problemEqualityLogic;

import problemEqualityLogic.interfaces.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Person> personTreeSet = new TreeSet<>();
        HashSet<Person> personHashSet = new HashSet<>();

        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = sc.readLine().split("\\s+");

            personTreeSet.add(new PersonImpl(data[0],Integer.parseInt(data[1])));
            personHashSet.add(new PersonImpl(data[0],Integer.parseInt(data[1])));
        }

        System.out.println(personTreeSet.size());
        System.out.println(personHashSet.size());
    }
}
