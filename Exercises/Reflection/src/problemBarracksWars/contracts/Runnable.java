package problemBarracksWars.contracts;

import java.lang.reflect.InvocationTargetException;

public interface Runnable {
	void run() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
