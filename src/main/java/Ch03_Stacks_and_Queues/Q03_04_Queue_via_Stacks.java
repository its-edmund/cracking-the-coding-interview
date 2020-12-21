package Ch03_Stacks_and_Queues;

import java.util.Stack;

public class Q03_04_Queue_via_Stacks {
    Stack<Integer> addStack = new Stack<>();
    Stack<Integer> removeStack = new Stack<>();

    public void enqueue(int i) {
        addStack.push(i);
    }

    public int dequeue() {
        while(!addStack.empty()) {
            removeStack.push(addStack.pop());
        }
        int ans = removeStack.pop();
        while(!removeStack.empty()) {
            addStack.push(removeStack.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(!addStack.empty()) {
            removeStack.push(addStack.pop());
        }
        int ans = removeStack.peek();
        while(!removeStack.empty()) {
            addStack.push(removeStack.pop());
        }
        return ans;
    }

    public int size() {
        return addStack.size();
    }
}
