package bg.softuni.repository;

import bg.softuni.models.cores.Core;
import bg.softuni.models.fragments.Fragment;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class CoreRepository implements Repository {

    private Core selectedCore;
    private LinkedList<Core> registeredCores;

    public CoreRepository() {
        this.registeredCores = new LinkedList<>();
    }

    @Override
    public Core getSelectedCore() {
        return selectedCore;
    }

    @Override
    public void addCore(Core core) {
        this.registeredCores.add(core);
    }

    @Override
    public Core removeCore(String name) {
        for (int i = 0; i < this.registeredCores.size(); i++) {
            if (this.registeredCores.get(i).getName().equals(name)) {
                Core removedCore = this.registeredCores.remove(i);
                if (this.selectedCore == removedCore) {
                    this.selectedCore = null;
                }
                return removedCore;
            }
        }

        return null;
    }

    @Override
    public Core selectCore(String name) {
        for (Core registeredCore : this.registeredCores) {
            if (registeredCore.getName().equals(name)) {
                this.selectedCore = registeredCore;
                return registeredCore;
            }
        }

        throw new IllegalArgumentException(String.format("Failed to select Core %s!", name));
    }

    @Override
    public void attachFragment(Fragment fragment) {
        if (this.selectedCore == null) {
            throw new IllegalArgumentException(
                    String.format("Failed to attach Fragment %s!", fragment.getName()));
        }

        this.selectedCore.attachFragment(fragment);
    }

    @Override
    public String detachFragment() {
        if (this.selectedCore == null) {
            return "Failed to detach Fragment!";
        }

        return this.selectedCore.detachFragment();
    }

    @Override
    public int getTotalDurability() {
        int sum = 0;

        for (Core registeredCore : this.registeredCores) {
            sum += registeredCore.getDurability();
        }

        return sum;
    }

    @Override
    public int getTotalCores() {
        return this.registeredCores.size();
    }

    @Override
    public int getTotalFragments() {
        int sum = 0;

        for (Core registeredCore : this.registeredCores) {
            sum += registeredCore.getFragmentsAmount();
        }

        return sum;
    }

    @Override
    public Iterator<Core> iterator() {
        return new Iterator<Core>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < registeredCores.size();
            }

            @Override
            public Core next() {
                return registeredCores.get(index++);
            }
        };
    }
}
