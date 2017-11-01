package problemStrategyPattern;

import problemStrategyPattern.interfaces.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Comparator<Person> sortByName = createComparatorByName();
        Comparator<Person> sortByAge = createComparatorByAge();

        TreeSet<Person> byName = new TreeSet<Person>(sortByName);
        TreeSet<Person> byAge = new TreeSet<Person>(sortByAge);

        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = sc.readLine().trim().split("\\s+");

            Person person = new PersonImpl(data[0], Integer.parseInt(data[1]));
            byName.add(person);
            byAge.add(person);
        }

        for (Person person : byName) {
            System.out.println(person.toString());
        }
        for (Person person : byAge) {
            System.out.println(person.toString());
        }
    }

    private static Comparator<Person> createComparatorByName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.compareByName(person2);
            }
        };
    }

    private static Comparator<Person> createComparatorByAge() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.compareByAge(person2);
            }
        };
    }

}
