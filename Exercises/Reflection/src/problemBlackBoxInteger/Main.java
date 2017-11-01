package problemBlackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ReflectiveOperationException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input = sc.readLine().trim();

        String destination = "problemBlackBoxInteger.";
        Class<?> myClass = Class.forName(destination + "BlackBoxInt");

        Constructor constructor = myClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();

        while (!input.equals("END")) {
            String[] data = input.split("_");
            String methodName = data[0];
            int param = Integer.parseInt(data[1]);

            Method method = instance.getClass().getDeclaredMethod(methodName,
                    int.class);

            method.setAccessible(true);
            method.invoke(instance, param);

            Field field = instance.getClass().getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.get(instance));

            input = sc.readLine().trim();
        }
    }
}
