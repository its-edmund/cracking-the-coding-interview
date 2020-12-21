package Ch02_Linked_Lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Q02_07_Intersection_Test {

    private Q02_07_Intersection s = new Q02_07_Intersection();

    @Test
    public void withTwoEmptyLists() {
        assertNull(s.intersects(LinkedListNode.empty(), LinkedListNode.empty()));
    }

    @Test
    public void withOneEmptyList() {
        assertNull(s.intersects(LinkedListNode.empty(), LinkedListNode.of(1, 2, 3)));
        assertNull(s.intersects(LinkedListNode.of(1, 2, 3), LinkedListNode.empty()));
    }

    @Test
    public void withTwoSeparatedLists() {
        assertNull(s.intersects(LinkedListNode.of(1, 2, 3), LinkedListNode.of(4, 5, 6)));
    }

    @Test
    public void withTwoSeparatedLists_HavingSameValue() {
        assertNull(s.intersects(LinkedListNode.of(1, 2, 3), LinkedListNode.of(4, 2, 3)));
    }

    @Test
    public void withIntersectedLists() {
        LinkedListNode l1 = LinkedListNode.of(1, 2, 3, 4, 5);
        LinkedListNode l2 = LinkedListNode.of(6, 7, 8);
        l2.next.next.next = l1.next;
        assertEquals(2, s.intersects(l1, l2).val);
    }
}