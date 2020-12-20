package Ch03_Stacks_and_Queues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q03_03_Stack_of_Plates_Test {

    @Test
    public void withBigThreshold() {
        Q03_03_Stack_of_Plates stack = new Q03_03_Stack_of_Plates(100);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
    }

    @Test
    public void withSmallThreshold() {
        Q03_03_Stack_of_Plates stack = new Q03_03_Stack_of_Plates(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
    }

    // @Test
    // public void withSmallThreshold_PopAtIndex() {
    //     Q03_03_Stack_of_Plates stack = new Q03_03_Stack_of_Plates(2);
    //     stack.push(3);
    //     stack.push(4);
    //     stack.push(5);
    //     stack.push(6);
    //     stack.push(7);
    //     stack.push(8);

    //     assertEquals(6, stack.popAt(1));
    //     assertEquals(7, stack.popAt(1));
    //     assertEquals(8, stack.pop());
    //     assertEquals(4, stack.popAt(0));
    //     assertEquals(5, stack.pop());
    //     assertEquals(3, stack.pop());

    // }
}