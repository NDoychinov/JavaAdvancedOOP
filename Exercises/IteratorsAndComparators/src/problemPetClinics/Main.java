package problemPetClinics;

import problemPetClinics.interfaces.Clinic;
import problemPetClinics.interfaces.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Clinic> clinicList = new HashMap<>();
        HashMap<String, Pet> createdPets = new HashMap<>();

        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = sc.readLine().split("\\s+");

            switch (data[0]) {
                case "Create":
                    if (data[1].equals("Pet")) {
                        Pet pet = new PetImpl(data[2],
                                Integer.parseInt(data[3]),
                                data[4]);
                        createdPets.put(data[2], pet);
                    } else {
                        try {
                            clinicList.put(data[2], new ClinicImpl(data[2],
                                    Integer.parseInt(data[3])));
                        }catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                    }
                    break;
                case "Add":
                    if (createdPets.containsKey(data[1])) {
                        Pet pet = createdPets.get(data[1]);
                        System.out.println(clinicList.get(data[2]).addPet(pet));
                    } else {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "Release":
                    System.out.println(clinicList.get(data[1]).releasePet());
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinicList.get(data[1]).hasEmptyRooms());
                    break;
                case "Print":
                    if (data.length == 2) {
                        clinicList.get(data[1]).printClinic();
                    } else {
                        clinicList.get(data[1]).printRoom(Integer.parseInt(data[2]) - 1);
                    }
                    break;
            }
        }
    }
}
