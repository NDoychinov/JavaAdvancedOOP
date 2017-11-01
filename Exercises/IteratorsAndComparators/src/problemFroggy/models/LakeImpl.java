package problemFroggy.models;

import problemFroggy.interfaces.Frog;
import problemFroggy.interfaces.Lake;

import java.util.LinkedList;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class LakeImpl implements Lake {
    private LinkedList<Integer> platforms;
    private Frog frog;

    public LakeImpl() {
        this.platforms = new LinkedList<>();
        this.frog = new FrogImpl(this.platforms);
    }

    @Override
    public void addPlatform(Integer num) {
        this.platforms.addLast(num);
    }

    @Override
    public void frogJump() {
        this.frog.jump();
    }
}
