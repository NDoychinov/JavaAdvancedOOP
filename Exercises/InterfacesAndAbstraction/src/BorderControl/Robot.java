package BorderControl;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Robot implements BorderControl.interfaces.Robot {
    private String model;
    private String id;

    Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
}

    @Override
    public String getModel() {
        return this.model;
    }
}
