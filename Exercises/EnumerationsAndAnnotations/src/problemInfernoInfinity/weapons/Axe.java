package problemInfernoInfinity.weapons;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Axe extends WeaponImpl {

    private static final int INITIAL_MIN_DMG = 5;
    private static final int INITIAL_MAX_DMG = 10;
    private static final int SOCKETS_AMOUNT = 4;

    public Axe(String name) {
        super(name, INITIAL_MIN_DMG, INITIAL_MAX_DMG, SOCKETS_AMOUNT);
    }
}
