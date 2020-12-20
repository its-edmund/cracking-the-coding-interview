package Ch02_Linked_Lists;

public class Q02_07_Intersection {
    public static Node intersection(Node head1, Node head2) {
        while(head1 != null) {
            Node temp = head2;
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

    public static void main(String[] args) {
        Node head1 = new Node(1, null);
        Node intersection = new Node(3, null);
        head1.next = new Node(2, null);
        head1.next.next = intersection;
        Node head2 = new Node(1, null);
        head2.next = intersection;
        System.out.println(intersection(head1, head2).data);
    }
}
