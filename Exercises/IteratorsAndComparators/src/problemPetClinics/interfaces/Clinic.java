package problemPetClinics.interfaces;

/**
 * Created by Niki on 19.7.2016 г..
 */
public interface Clinic {

    String getName();

    int roomsAmount();

    boolean addPet(Pet pet);

    boolean releasePet();

    boolean hasEmptyRooms();

    void printClinic();

    void printRoom(int index);
}
