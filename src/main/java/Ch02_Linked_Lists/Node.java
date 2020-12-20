package Ch02_Linked_Lists;

public class Node {
    Node next = null;
    int data;

    public Node(int d, Node next) {
        data = d;
        this.next = next;
    }

    void appendToTail(int d) {
        Node end = new Node(d, null);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
