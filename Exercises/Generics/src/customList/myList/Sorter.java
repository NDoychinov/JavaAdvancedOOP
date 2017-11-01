package customList.myList;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class Sorter {

    public static <T extends Comparable> LinkedList<T> sortAscending(LinkedList<T> list) {
        Collections.sort(list, Comparable::compareTo);

        return list;
    }
}
