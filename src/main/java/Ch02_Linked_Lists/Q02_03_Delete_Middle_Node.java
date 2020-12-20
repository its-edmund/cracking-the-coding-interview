package Ch02_Linked_Lists;

public class Q02_03_Delete_Middle_Node {
    public static boolean deleteMiddleNode(Node node) {
        if (node == null) {
            return false;
        } else if (node.next == null) {
            node = null;
        } else {
            Node next = node.next;
            node.data = next.data;
            node.next = next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.appendToTail(6);
        head.appendToTail(5);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(8);
        int count = 2;
        Node delete = head;
        while (count != 0) {
            delete = delete.next;
            count--;
        }
        System.out.println(delete.data);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        deleteMiddleNode(delete);
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
