package problemPetClinics;

import problemPetClinics.interfaces.Clinic;
import problemPetClinics.interfaces.Pet;
import problemPetClinics.interfaces.PetIterable;

import java.util.NoSuchElementException;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class ClinicImpl implements Clinic {

    private String name;
    private Pet[] rooms;

    ClinicImpl(String name, int rooms) {
        this.setName(name);
        this.setRooms(rooms);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRooms(int rooms) {
        if (rooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms = new Pet[rooms];
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int roomsAmount() {
        return this.rooms.length;
    }

    @Override
    public boolean addPet(Pet pet) {
        PetIterable<Pet> iterate = new PetAddIterator();

        while (iterate.hasNext()) {
            Pet current = iterate.next();

            if (this.isRoomEmpty(iterate.getLastIndex())) {
                this.rooms[iterate.getLastIndex()] = pet;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean releasePet() {
        PetIterable<Pet> iterate = new PetReleaseIterator();

        while (iterate.hasNext()) {
            Pet current = iterate.next();
            if (!this.isRoomEmpty(iterate.getLastIndex())) {
                this.rooms[iterate.getLastIndex()] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasEmptyRooms() {
        for (int i = 0; i < this.rooms.length; i++) {
            if (this.rooms[i] == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printClinic() {
        for (int i = 0; i < this.rooms.length; i++) {
            try {
                System.out.println(this.rooms[i].toString());
            } catch (NullPointerException npe) {
                System.out.println("Room empty");
            }
        }
    }

    @Override
    public void printRoom(int index) {
        try {
            System.out.println(this.rooms[index].toString());
        } catch (NullPointerException npe) {
            System.out.println("Room empty");
        }

    }

    private boolean isRoomEmpty(int index) {
        if (this.rooms[index] == null) {
            return true;
        }
        return false;
    }

    private class PetAddIterator implements PetIterable<Pet> {

        private int staticIndex;
        private int helpIndex;
        private boolean toLeftOrRight;
        private int lastIndex;

        private PetAddIterator() {
            this.staticIndex = ((roomsAmount() + 1) / 2) - 1;
            this.helpIndex = 0;
            toLeftOrRight = true;
        }

        public int getLastIndex() {
            return this.lastIndex;
        }

        @Override
        public boolean hasNext() {
            return this.helpIndex <= roomsAmount() / 2;
        }

        @Override
        public Pet next() {
            if (this.hasNext()) {
                if (this.helpIndex == 0 && rooms.length % 2 == 1) {

                    int currIndex = this.helpIndex;
                    this.helpIndex++;

                    this.lastIndex = this.staticIndex + currIndex;
                    return rooms[this.staticIndex + currIndex];

                } else {

                    if (toLeftOrRight) {
                        toLeftOrRight = false;

                        this.lastIndex = this.staticIndex - this.helpIndex;
                        return rooms[this.staticIndex - this.helpIndex];
                    } else {
                        toLeftOrRight = true;
                        int currIndex = this.helpIndex;
                        if (roomsAmount() % 2 == 0) {
                            currIndex++;
                        }
                        this.helpIndex++;

                        this.lastIndex = this.staticIndex + currIndex;
                        return rooms[this.staticIndex + currIndex];
                    }
                }
            }
            throw new NoSuchElementException();
        }
    }


    private class PetReleaseIterator implements PetIterable<Pet> {

        private int index;
        private boolean isStarted;
        private int lastIndex;

        private PetReleaseIterator() {
            this.index = ((roomsAmount() + 1) / 2) - 1;
            this.isStarted = false;
        }

        @Override
        public int getLastIndex() {
            return this.lastIndex;
        }

        @Override
        public boolean hasNext() {
            if (this.index == roomsAmount() / ((roomsAmount() + 1) / 2) - 1
                    && isStarted){
                return false;
            }

            return true;
        }

        @Override
        public Pet next() {
            if (this.hasNext()) {
                int currIndex = this.index;
                this.index++;
                this.index %= roomsAmount();
                this.isStarted = true;

                this.lastIndex = currIndex;
                return rooms[currIndex];
            }
            throw new NoSuchElementException();
        }
    }
}
