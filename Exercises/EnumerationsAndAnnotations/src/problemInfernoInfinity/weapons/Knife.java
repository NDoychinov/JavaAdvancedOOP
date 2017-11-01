package problemInfernoInfinity.weapons;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Knife extends WeaponImpl {

    private static final int INITIAL_MIN_DMG = 3;
    private static final int INITIAL_MAX_DMG = 4;
    private static final int SOCKETS_AMOUNT = 2;

    public Knife(String name) {
        super(name, INITIAL_MIN_DMG, INITIAL_MAX_DMG, SOCKETS_AMOUNT);
    }
}
