package bg.softuni.models.cores;

public class ParaCore extends CoreAbstract {

    private static final String CORE_TYPE = "Para";

    public ParaCore(String name, int durability) {
        super(name, CORE_TYPE, durability);
    }

    @Override
    protected void setDurability(int durability) {
        super.setDurability(durability / 3);
    }
}
