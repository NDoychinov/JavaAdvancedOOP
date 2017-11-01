package problemInfernoInfinity.weapons;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Sword extends WeaponImpl {

    private static final int INITIAL_MIN_DMG = 4;
    private static final int INITIAL_MAX_DMG = 6;
    private static final int SOCKETS_AMOUNT = 3;

    public Sword(String name) {
        super(name, INITIAL_MIN_DMG, INITIAL_MAX_DMG, SOCKETS_AMOUNT);
    }
}
