package Ch02_Linked_Lists;

import java.util.*;

public class Q02_01_Remove_Dups {

    public static void removeDups(Node head) {
        ArrayList<Integer> dupes = new ArrayList<>();
        Node temp = head;
        while (temp.next != null) {
            if (!dupes.contains(temp.next.data)) {
                dupes.add(temp.next.data);
                temp = temp.next;
            } else {
                if (temp.next.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(3);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        removeDups(head);
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
