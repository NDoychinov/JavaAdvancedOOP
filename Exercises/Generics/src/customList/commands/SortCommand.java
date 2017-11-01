package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class SortCommand extends Command {

    public SortCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        super.getList().sortAscending();

        return "List sorted Ascending";
    }
}
