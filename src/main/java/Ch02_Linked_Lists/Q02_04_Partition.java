package Ch02_Linked_Lists;

public class Q02_04_Partition {
    public static Node partition(Node head, int partition) {
        Node newTail = null;
        Node newHead = null;
        Node temp = head;
        while(temp != null) {
            if(temp.data < partition) {
                Node newNode = new Node(temp.data, null);
                if(newHead == null) {
                    newHead = newNode;
                } else {
                    Node tempHead = newHead;
                    while(tempHead.next != null) {
                        tempHead = tempHead.next;
                    }
                    tempHead.next = newNode;
                }
            } else {
                Node newNode = new Node(temp.data, newTail);
                newTail = newNode;
            }
            temp = temp.next;
        }
        Node tempHead = newHead;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = newTail;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.appendToTail(6);
        head.appendToTail(5);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(8);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        temp = partition(head, 5);
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
