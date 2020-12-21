package Ch03_Stacks_and_Queues;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class Q03_05_Sort_Stack_Test {

    private Q03_05_Sort_Stack s = new Q03_05_Sort_Stack();

    @Test
    public void withAlreadySorted() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        Stack<Integer> result = s.sort(stack);
        assertEquals(1, result.pop().intValue());
        assertEquals(2, result.pop().intValue());
        assertEquals(3, result.pop().intValue());
    }

    @Test
    public void withUnSorted() {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        Stack<Integer> result = s.sort(stack);
        assertEquals(2, result.pop().intValue());
        assertEquals(3, result.pop().intValue());
        assertEquals(4, result.pop().intValue());
        assertEquals(5, result.pop().intValue());
    }
}