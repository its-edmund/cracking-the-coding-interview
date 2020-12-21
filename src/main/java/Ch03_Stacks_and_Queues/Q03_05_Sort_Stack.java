package Ch03_Stacks_and_Queues;

import java.util.Stack;

public class Q03_05_Sort_Stack {
    public Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        int size = stack.size();
        while (size != 0) {
            int counter = size - 1;
            int max = stack.pop();
            while (counter != 0) {
                int popped = stack.pop();
                if (popped > max) {
                    tempStack.push(max);
                    max = popped;
                } else {
                    tempStack.push(popped);
                }
                counter--;
            }
            stack.push(max);
            while (!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
            size--;
        }
        return stack;
    }
}
