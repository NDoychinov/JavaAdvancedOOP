package BirthdayCelebrations.Interfaces;

import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public interface Filterable {

    List<Birthdatable> filterByDate(List<Birthdatable> bday, String year);
}
