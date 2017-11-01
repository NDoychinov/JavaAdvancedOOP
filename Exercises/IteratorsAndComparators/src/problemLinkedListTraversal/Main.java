package problemLinkedListTraversal;

import problemLinkedListTraversal.interfaces.MyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        MyLinkedList<Integer> list = new MyLinkedListImpl<>();
        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = sc.readLine().split("\\s+");

            switch (data[0]){
                case "Add":
                    list.add(Integer.parseInt(data[1]));
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(data[1]));
                    break;
            }
        }
        System.out.println(list.getSize());
        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }
    }
}
