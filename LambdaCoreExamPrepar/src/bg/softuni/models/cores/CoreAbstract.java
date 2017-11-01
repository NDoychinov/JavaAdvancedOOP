package bg.softuni.models.cores;

import bg.softuni.collection.LStack;
import bg.softuni.collection.CustomStack;
import bg.softuni.enums.StatusType;
import bg.softuni.models.fragments.Fragment;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class CoreAbstract implements Core {

    private static final String FAILURE_EXCEPTION_MESSAGE = "Failed to create Core!";

    private String name;
    private String type;
    private CustomStack attachedFragments;
    private int totalPressure;
    private int durability;
    private int maximumDurability;

    protected CoreAbstract(String name, String type, int durability) {
        this.setType(type);
        this.setDurability(durability);
        this.setName(name);
        this.attachedFragments = new LStack();
        this.totalPressure = 0;
        this.maximumDurability = this.getDurability();
    }

    private void setType(String type) {
        this.type = type;
    }

    protected void setDurability(int durability) {

        if (durability < 0) {
            throw new IllegalArgumentException(FAILURE_EXCEPTION_MESSAGE);
        }

        this.durability = durability;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getFragmentsAmount() {
        return this.attachedFragments.size();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public StatusType status() {
        if (this.durability < this.maximumDurability) {
            return StatusType.CRITICAL;
        }
        return StatusType.NORMAL;
    }

    @Override
    public boolean attachFragment(Fragment fragment) {
        this.attachedFragments.push(fragment);
        this.totalPressure += fragment.getPressureAffection();

        this.updatePressureOnTheCore(this.totalPressure);
        return true;
    }

    @Override
    public String detachFragment() {
        if (this.attachedFragments.size() < 1) {
            return "Failed to detach Fragment!";
        }

        Fragment removedFragment = this.attachedFragments.pop();
        this.totalPressure -= removedFragment.getPressureAffection();

        this.updatePressureOnTheCore(this.totalPressure);

        return String.format("Successfully detached Fragment %s from Core %s!",
                removedFragment.getName(), this.getName());
    }

    private void updatePressureOnTheCore(int amount) {
        this.durability -= amount;

        if (this.durability < 0) {
            this.durability = 0;
        }

        if (this.durability > this.maximumDurability) {
            this.setDurability(this.maximumDurability);
        }
    }

    private void updatePressureOnTheCore() {
        this.durability -= this.totalPressure;

        if (this.durability < 0) {
            this.durability = 0;
        }

        if (this.durability > this.maximumDurability) {
            this.setDurability(this.maximumDurability);
        }
    }


}
