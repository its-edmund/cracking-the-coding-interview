package Ch03_Stacks_and_Queues;

import java.util.LinkedList;
import java.util.ArrayList;

public class Q03_06_Animal_Shelter {
    LinkedList<ArrayList> shelter = new LinkedList<>();

    public void enqueueDog(int i) {
        ArrayList entry = new ArrayList();
        entry.add(i);
        entry.add("dog");
        shelter.addLast(entry);
    }

    public void enqueueCat(int i) {
        ArrayList entry = new ArrayList();
        entry.add(i);
        entry.add("cat");
        shelter.addLast(entry);
    }

    public int dequeueCat() {
        for(int i = 0; i < shelter.size(); i++) {
            if(shelter.get(i).get(1) == "cat") {
                int num = (int) shelter.get(i).get(0);
                shelter.remove(i);
                return num;
            }
        }
        return 0;
    }

    public int dequeueDog() {
        for(int i = 0; i < shelter.size(); i++) {
            if(shelter.get(i).get(1) == "dog") {
                int num = (int) shelter.get(i).get(0);
                shelter.remove(i);
                return num;
            }
        }
        return 0;
    }

    public int dequeueAny() {
        return (int) shelter.pop().get(0);
    }
}
