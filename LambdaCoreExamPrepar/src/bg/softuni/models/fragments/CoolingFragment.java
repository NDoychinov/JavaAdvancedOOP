package bg.softuni.models.fragments;

import bg.softuni.enums.FragmentType;

public class CoolingFragment extends BaseFragment {

    public CoolingFragment(String name, Integer pressureAffection) {
        super(FragmentType.Cooling, name, pressureAffection);
    }

    @Override
    protected void setPressureAffection(Integer value) {
        super.setPressureAffection(value * 3);
    }
}
