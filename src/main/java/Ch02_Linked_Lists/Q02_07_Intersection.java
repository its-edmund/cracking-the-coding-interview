package Ch02_Linked_Lists;

public class Q02_07_Intersection {
    public LinkedListNode intersects(LinkedListNode head1, LinkedListNode head2) {
        while(head1 != null) {
            LinkedListNode temp = head2;
            while(temp != null) {
                if(head1 == temp) {
                    return head1;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        return null;
    }
}
