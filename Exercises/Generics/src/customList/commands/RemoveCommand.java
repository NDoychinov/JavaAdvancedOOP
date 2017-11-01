package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class RemoveCommand extends Command {

    public RemoveCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        Object removedEl = this.getList().remove(Integer.parseInt(super.getData()[1]));
        return String.format("Element /%s/ removed from list", removedEl);
    }
}
