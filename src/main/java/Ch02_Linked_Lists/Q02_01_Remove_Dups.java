package Ch02_Linked_Lists;

import java.util.*;

public class Q02_01_Remove_Dups {
    public LinkedListNode removeDups(LinkedListNode head) {
        if(head == null) {
            return null;
        }
        ArrayList<Integer> dupes = new ArrayList<>();
        LinkedListNode temp = head;
        while (temp.next != null) {
            if (!dupes.contains(temp.next.val)) {
                dupes.add(temp.next.val);
                temp = temp.next;
            } else {
                if (temp.next.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
            }
        }
        return head;
    }
}
