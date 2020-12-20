package Ch02_Linked_Lists;

import java.util.*;

public class Q02_08_Loop_Detection {
    public static boolean loopDetection(Node head) {
        ArrayList<Node> already = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            if(!already.contains(temp)) {
                already.add(temp);
            } else {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node head = new Node(1, null);
        System.out.println(loopDetection(head));
    }
}
