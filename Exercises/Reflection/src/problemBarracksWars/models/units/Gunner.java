package problemBarracksWars.models.units;

/**
 * Created by Niki on 28.7.2016 г..
 */
public class Gunner extends AbstractUnit {
    private static final int PIKEMAN_HEALTH = 20;
    private static final int PIKEMAN_DAMAGE = 20;

    public Gunner() {
        super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
    }
}
