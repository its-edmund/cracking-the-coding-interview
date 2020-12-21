package Ch02_Linked_Lists;

import java.util.*;

public class Q02_08_Loop_Detection {
    public LinkedListNode detect(LinkedListNode head) {
        ArrayList<LinkedListNode> already = new ArrayList<>();
        LinkedListNode temp = head;
        while(temp != null) {
            if(!already.contains(temp)) {
                already.add(temp);
            } else {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
