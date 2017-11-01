package bg.softuni.models.fragments;


import bg.softuni.enums.FragmentType;

public abstract class BaseFragment implements Fragment {

    private static final String UNDER_ZERO_EXCEPTION_MESSAGE = "Pressure Affection is below zero";

    private String name;
    private FragmentType type;
    private Integer pressureAffection;

    protected BaseFragment(FragmentType type, String name, Integer pressureAffection) {
        this.setType(type);
        this.setName(name);
        this.setPressureAffection(pressureAffection);
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected void setName(String value) {
        this.name = value;
    }

    @Override
    public FragmentType getType() {
        return this.type;
    }

    protected void setType(FragmentType value) {
        this.type = value;
    }

    @Override
    public Integer getPressureAffection() {
        return this.pressureAffection;
    }

    protected void setPressureAffection(Integer value) {
        if (value < 0) {
            throw new IllegalArgumentException(UNDER_ZERO_EXCEPTION_MESSAGE);
        }

        if (this.getType() == FragmentType.Cooling) {
            value = -value;
        }

        this.pressureAffection = value;
    }
}
