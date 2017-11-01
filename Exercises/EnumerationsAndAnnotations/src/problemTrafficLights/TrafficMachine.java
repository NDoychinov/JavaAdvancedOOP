package problemTrafficLights;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class TrafficMachine {

    private TrafficLights[] existingLights;
    private TrafficLights[] myLights;

    public TrafficMachine(String[] lightTrafficData) {
        this.initializeTrafficLights(lightTrafficData);
        this.setAllLights();
    }

    private void setAllLights() {
        this.existingLights = TrafficLights.values();
    }

    public void changeLights(){
        for (int j = 0; j < myLights.length; j++) {
            myLights[j] = existingLights[(myLights[j].ordinal() + 1) % 3];
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < myLights.length; i++) {
            output.append(myLights[i]).append(" ");
        }
        return output.toString();
    }

    private void printLights(TrafficLights[] lights) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < lights.length; i++) {
            output.append(lights[i]).append(" ");
        }
        System.out.println(output);
    }

    private void initializeTrafficLights(String[] data) {
        this.myLights = new TrafficLights[data.length];

        for (int i = 0; i < this.myLights.length; i++) {
            this.myLights[i] = TrafficLights.valueOf(data[i]);
        }
    }
}
