package Ch03_Stacks_and_Queues;

import java.util.LinkedList;
import java.util.ArrayList;

public class Q03_06_Animal_Shelter {
    LinkedList<Animal> shelter = new LinkedList<>();

    public void enqueueDog(int i) {
        Animal entry = new Animal("dog", i);
        shelter.addLast(entry);
    }

    public void enqueueCat(int i) {
        Animal entry = new Animal("cat", i);
        shelter.addLast(entry);
    }

    public int dequeueCat() {
        for(int i = 0; i < shelter.size(); i++) {
            if(shelter.get(i).getType() == "cat") {
                int num = (int) shelter.get(i).getVal();
                shelter.remove(i);
                return num;
            }
        }
        return 0;
    }

    public int dequeueDog() {
        for(int i = 0; i < shelter.size(); i++) {
            if(shelter.get(i).getType() == "dog") {
                int num = (int) shelter.get(i).getVal();
                shelter.remove(i);
                return num;
            }
        }
        return 0;
    }

    public int dequeueAny() {
        return (int) shelter.pop().getVal();
    }
}

class Animal {
    String type;
    int val;

    public Animal(String type, int val) {
        this.type = type;
        this.val = val;
    }

    public String getType() {
        return type;
    }

    public int getVal() {
        return val;
    }
}