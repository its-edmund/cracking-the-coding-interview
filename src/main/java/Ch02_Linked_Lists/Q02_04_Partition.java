package Ch02_Linked_Lists;

public class Q02_04_Partition {
    public LinkedListNode partition(LinkedListNode head, int partition) {
        LinkedListNode newTail = null;
        LinkedListNode newHead = null;
        LinkedListNode temp = head;
        while(temp != null) {
            if(temp.val < partition) {
                LinkedListNode newNode = new LinkedListNode(temp.val);
                newNode.next = null;
                if(newHead == null) {
                    newHead = newNode;
                } else {
                    LinkedListNode tempHead = newHead;
                    while(tempHead.next != null) {
                        tempHead = tempHead.next;
                    }
                    tempHead.next = newNode;
                }
            } else {
                LinkedListNode newNode = new LinkedListNode(temp.val);
                newNode.next = newTail;
                newTail = newNode;
            }
            temp = temp.next;
        }
        LinkedListNode tempHead = newHead;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = newTail;
        return newHead;
    }
}
