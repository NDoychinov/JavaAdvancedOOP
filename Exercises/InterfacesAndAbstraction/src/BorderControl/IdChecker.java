package BorderControl;

import BorderControl.interfaces.FakeCheckable;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class IdChecker implements FakeCheckable {
    private String fakeEnd;

    public IdChecker(String fakeEnd) {
        this.fakeEnd = fakeEnd;
    }

    @Override
    public boolean checkId(String id) {
        return id.endsWith(this.fakeEnd);
    }
}
