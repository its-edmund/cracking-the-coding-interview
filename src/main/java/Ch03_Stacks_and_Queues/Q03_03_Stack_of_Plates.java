package Ch03_Stacks_and_Queues;

import java.util.EmptyStackException;
import java.util.Stack;

public class Q03_03_Stack_of_Plates {
    int threshold;
    Stack<Stack> stackOfStacks = new Stack<>();

    public Q03_03_Stack_of_Plates(int threshold) {
        this.threshold = threshold;
    }

    public void push(int n) {
        if(stackOfStacks.size() == 0 || stackOfStacks.peek().size() >= threshold) {
            Stack<Integer> stack = new Stack<>();
            stack.push(n);
            stackOfStacks.push(stack);
        } else {
            Stack<Integer> stack = stackOfStacks.pop();
            stack.push(n);
            stackOfStacks.push(stack);
        }
    }

    public int pop() {
        if(stackOfStacks.size() == 0) {
            throw new EmptyStackException();
        } else {
            Stack<Integer> stack = stackOfStacks.pop();
            int ans = stack.pop();
            if(stack.size() > 0) {
                stackOfStacks.push(stack);
            }
            return ans;
        }
    }
}
