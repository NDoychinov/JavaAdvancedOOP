package customList.commands;

import customList.interfaces.Executable;
import customList.interfaces.MyList;

/**
 * Created by Niki on 5.8.2016 г..
 */
public abstract class Command implements Executable {

    private String[] data;
    private MyList list;

    protected Command(String[] data, MyList list) {
        this.data = data;
        this.list = list;
    }

    private void setList(MyList list) {
        this.list = list;
    }

    protected String[] getData() {
        return data;
    }

    protected MyList getList() {
        return list;
    }

    @Override
    public abstract String execute();
}
