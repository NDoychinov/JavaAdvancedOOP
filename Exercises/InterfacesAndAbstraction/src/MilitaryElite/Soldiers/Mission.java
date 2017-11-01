package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.Missionable;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Mission implements Missionable {

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        if (isValidState(state)) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("Not valid state");
        }
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void CompleteMission() {
        if (this.state.equals("inProgress")) {
            this.state = "Finished";
        }
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }

    private boolean isValidState(String state) {
        if (state.equals("Finished") || state.equals("inProgress")) {
            return true;
        } else {
            return false;
        }
    }
}
