package problemHarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Niki on 27.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String input = sc.readLine().trim();

        Field[] fields = RichSoilLand.class.getDeclaredFields();
        while(!input.equals("HARVEST")){
            for (int i = 0; i < fields.length; i++) {
                Field currField = fields[i];
                if (Modifier.toString(currField.getModifiers()).equalsIgnoreCase(input) ||
                        input.equals("all")) {
                    System.out.printf("%s %s %s%n",
                            Modifier.toString(currField.getModifiers()),
                            currField.getType().getSimpleName(),
                            currField.getName());
                }
            }

            input = sc.readLine().trim();
        }
    }
}
