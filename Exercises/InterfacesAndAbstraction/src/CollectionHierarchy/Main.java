package CollectionHierarchy;

import CollectionHierarchy.interfaces.AddCollection;
import CollectionHierarchy.interfaces.AddRemoveCollection;
import CollectionHierarchy.interfaces.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        AddCollection addCollection = new AddCollectionImpl();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollectionImpl();
        MyList myList = new MyListImpl();

        String[] data = sc.readLine().split("\\s+");
        int count = Integer.parseInt(sc.readLine());

        for (int i = 0; i < data.length; i++) {
            System.out.print(addCollection.add(data[i]) + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(addRemoveCollection.add(data[i]) + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(myList.add(data[i]) + " ");
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(addRemoveCollection.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(myList.remove() + " ");
        }
    }
}
