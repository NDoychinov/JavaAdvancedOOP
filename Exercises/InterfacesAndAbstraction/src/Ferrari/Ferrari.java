package Ferrari;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Ferrari implements FerrariImpl {
    private String driverName;


    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String getDriver() {
        return this.driverName;
    }




}
