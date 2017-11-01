package BirthdayCelebrations;

import BirthdayCelebrations.Interfaces.Birthdatable;
import BirthdayCelebrations.Interfaces.Filterable;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class DateFilter implements Filterable {

    @Override
    public List<Birthdatable> filterByDate(List<Birthdatable> bdays, String year) {
        return bdays.stream().filter(d -> d.getBirthdate().endsWith(year)).collect(Collectors.toList());
    }
}
