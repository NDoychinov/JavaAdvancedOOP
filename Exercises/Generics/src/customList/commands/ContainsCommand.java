package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class ContainsCommand extends Command {

    public ContainsCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        return Boolean.toString(super.getList().contains(super.getData()[1])) ;
    }
}
