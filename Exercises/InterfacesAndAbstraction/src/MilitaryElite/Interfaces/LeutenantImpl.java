package MilitaryElite.Interfaces;

import MilitaryElite.Soldiers.Private;

import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public interface LeutenantImpl {
    void addPrivate(Private privateSoldier);
    List<Private> getPrivates();
}
