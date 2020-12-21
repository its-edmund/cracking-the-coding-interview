package Ch02_Linked_Lists;

public class Q02_03_Delete_Middle_Node {
    public boolean deleteMiddleNode(LinkedListNode node) {
        if (node == null) {
            return false;
        } else if (node.next == null) {
            node = null;
        } else {
            LinkedListNode next = node.next;
            node.val = next.val;
            node.next = next.next;
        }
        return true;
    }
}
