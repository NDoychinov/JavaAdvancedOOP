package problemBarracksWars.contracts;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws NotImplementedException;
}
