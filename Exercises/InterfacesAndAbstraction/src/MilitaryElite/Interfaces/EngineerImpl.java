package MilitaryElite.Interfaces;

import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public interface EngineerImpl {
    void addRepair(Repairable repair);
    List<Repairable> getRepairs();
}
