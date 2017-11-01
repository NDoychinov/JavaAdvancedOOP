package bg.softuni.models.fragments;

import bg.softuni.enums.FragmentType;

public class NuclearFragment extends BaseFragment {

    public NuclearFragment(String name, Integer pressureAffection) {
        super(FragmentType.Nuclear, name, pressureAffection);
    }

    @Override
    protected void setPressureAffection(Integer value) {
        super.setPressureAffection(value * 2);
    }
}
