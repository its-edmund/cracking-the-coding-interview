package Ch02_Linked_Lists;

public class Q02_02_Return_Kth_to_Last {
    public static int kthToLast(Node head, int k) {
        Node temp = head;
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
        return temp.data;
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
        System.out.println(kthToLast(head, 5));
    }
}
