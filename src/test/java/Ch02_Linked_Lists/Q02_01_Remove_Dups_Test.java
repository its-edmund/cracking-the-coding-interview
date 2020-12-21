package Ch02_Linked_Lists;

import org.junit.Assert;
import org.junit.Test;

public class Q02_01_Remove_Dups_Test {

    private Q02_01_Remove_Dups s = new Q02_01_Remove_Dups();

    @Test
    public void withEmptyList() {
        Assert.assertEquals(LinkedListNode.empty(), s.removeDups(LinkedListNode.empty()));
    }

    @Test
    public void withUniqueList() {
        Assert.assertEquals(LinkedListNode.of(1, 2, 3, 4), s.removeDups(LinkedListNode.of(1, 2, 3, 4)));
    }

    @Test
    public void withDuplications() {
        Assert.assertEquals(LinkedListNode.of(1, 2, 3, 4), s.removeDups(LinkedListNode.of(1, 2, 2, 3, 2, 4)));
    }

}