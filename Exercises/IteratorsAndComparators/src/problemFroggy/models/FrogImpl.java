package problemFroggy.models;

import problemFroggy.interfaces.Frog;

import java.util.LinkedList;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class FrogImpl implements Frog {

    private LinkedList<Integer> platforms;
    private int index = 0;

    public FrogImpl(LinkedList<Integer> platforms) {
        this.platforms = platforms;
    }

    @Override
    public void jump() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.platforms.size(); i += 2) {
           output.append(this.platforms.get(i)).append(", ");
        }
        for (int i = 1; i < this.platforms.size(); i += 2) {
            output.append(this.platforms.get(i)).append(", ");
        }
        System.out.println(output.substring(0, output.length() - 2));
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
