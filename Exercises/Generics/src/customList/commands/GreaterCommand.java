package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class GreaterCommand extends Command {

    public GreaterCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        return Integer.toString(super.getList().countGreaterThat(super.getData()[1]));
    }
}
