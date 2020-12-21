package Ch03_Stacks_and_Queues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q03_01_Three_In_One_Test {

    @Test
    public void withStackSize1() {
        Q03_01_Three_in_One s = new Q03_01_Three_in_One(1);
        s.push(0, 0);
        s.push(1, 1);
        s.push(2, 2);
        assertEquals(0, s.pop(0));
        assertEquals(1, s.pop(1));
        assertEquals(2, s.pop(2));
    }


    @Test
    public void withStackSize2() {
        Q03_01_Three_in_One s = new Q03_01_Three_in_One(2);
        s.push(0, 6);
        s.push(1, 1);
        s.push(1, 2);
        s.push(2, 3);
        s.push(2, 4);
        s.push(2, 5);
        assertEquals(6, s.pop(0));
        assertEquals(2, s.pop(1));
        assertEquals(1, s.pop(1));
        assertEquals(5, s.pop(2));
        assertEquals(4, s.pop(2));
        assertEquals(3, s.pop(2));
    }

    @Test(expected = RuntimeException.class)
    public void withArrayLength3_Exceeded() {
        Q03_01_Three_in_One s = new Q03_01_Three_in_One(1);
        s.push(0, 1);
        s.push(0, 1);
        s.push(0, 1);
        s.push(0, 1);
    }

    @Test(expected = RuntimeException.class)
    public void withArrayLength3_StackNotExists() {
        Q03_01_Three_in_One s = new Q03_01_Three_in_One(3);
        s.push(3, 1);
    }
}
