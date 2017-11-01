package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class MinCommand extends Command {

    public MinCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        return super.getList().getMin().toString();
    }
}
