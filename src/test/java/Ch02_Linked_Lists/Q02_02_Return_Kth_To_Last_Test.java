package Ch02_Linked_Lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Q02_02_Return_Kth_To_Last_Test {

    private Q02_02_Return_Kth_to_Last s = new Q02_02_Return_Kth_to_Last();

    @Test
    public void withOutOfScopeK() {
        assertNull(s.kthToLast(LinkedListNode.of(1, 2, 3), 3));
    }

    @Test
    public void withZero() {
        assertEquals(3, s.kthToLast(LinkedListNode.of(1, 2, 3), 0).val);
    }

    @Test
    public void withNoneZero() {
        assertEquals(2, s.kthToLast(LinkedListNode.of(1, 2, 3), 1).val);
    }


}