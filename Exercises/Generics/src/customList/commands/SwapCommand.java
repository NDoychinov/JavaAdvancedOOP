package customList.commands;

import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public class SwapCommand extends Command {

    public SwapCommand(String[] data, MyList list) {
        super(data, list);
    }

    @Override
    public String execute() {
        super.getList().swap(Integer.parseInt(super.getData()[1]),
                Integer.parseInt(super.getData()[2]));
        return String.format("Item /%s/ swaped with /%s/",
                super.getList().get(Integer.parseInt(super.getData()[1])),
                super.getList().get(Integer.parseInt(super.getData()[2])));
    }
}
