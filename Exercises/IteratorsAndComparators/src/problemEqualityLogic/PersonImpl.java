package problemEqualityLogic;


import problemEqualityLogic.interfaces.Person;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class PersonImpl implements Person, Comparable<Person> {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }

    @Override
    public int hashCode() {
        StringBuilder code = new StringBuilder();
        code.append(this.age);
        int sum = 0;
        for (int i = 0; i < this.name.length(); i++) {
            sum += this.name.charAt(i);
        }
        code.append(sum);
        return Integer.parseInt(code.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.hashCode() == this.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0) {
            result = Integer.compare(this.getAge(), o.getAge());
        }

        return result;
    }
}
