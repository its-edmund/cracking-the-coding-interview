package Ch02_Linked_Lists;

public class Q02_02_Return_Kth_to_Last {
    public LinkedListNode kthToLast(LinkedListNode head, int k) {
        LinkedListNode temp = head;
        int length = 0;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        int index = length - k;
        temp = head;
        while (index != 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }
}
