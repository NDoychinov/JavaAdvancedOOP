package problemPetClinics.interfaces;


import java.util.Iterator;

/**
 * Created by Niki on 20.7.2016 г..
 */
public interface PetIterable<Pet> extends Iterator<Pet> {

    int getLastIndex();
}
