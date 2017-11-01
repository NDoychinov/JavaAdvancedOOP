package bg.softuni.models.cores;

public class SystemCore extends CoreAbstract {

    private static final String CORE_TYPE = "System";

    public SystemCore(String name, int durability) {
        super(name, CORE_TYPE, durability);
    }
}
