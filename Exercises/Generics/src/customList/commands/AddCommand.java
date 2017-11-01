package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class AddCommand extends Command {


    public AddCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        super.getList().add(super.getData()[1]);
        return String.format("/%s/ added to list", super.getData()[1]);
    }
}
