package problemBarracksWars.models.units;

/**
 * Created by Niki on 28.7.2016 г..
 */
public class Horseman extends AbstractUnit {
    private static final int PIKEMAN_HEALTH = 50;
    private static final int PIKEMAN_DAMAGE = 10;

    public Horseman() {
        super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
    }
}
