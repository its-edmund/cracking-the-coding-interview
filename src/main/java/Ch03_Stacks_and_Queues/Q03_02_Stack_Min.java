package Ch03_Stacks_and_Queues;

import java.util.TreeMap;

public class Q03_02_Stack_Min {
    public static class Stack {
        int minInd;
        TreeMap<Integer, Integer> min = new TreeMap<Integer, Integer>();
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        public void push(int n) {
            stack.push(n);
            min.put(n, min.getOrDefault(n, 0) + 1);
            minInd = min.firstKey();
        }

        public int pop() {
            int popped = stack.pop();
            min.put(popped, min.get(popped) - 1);
            if (min.get(popped) < 1) {
                min.remove(popped);
            }
            if (min.size() != 0) {
                minInd = min.firstKey();
            }
            return popped;
        }

        public int min() {
            return minInd;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);
        stack.pop();
        stack.min();
        stack.pop();
        stack.min();
        stack.pop();
        stack.push(2147483647);
        stack.min();
        stack.push(-2147483648);
        stack.min();
        stack.pop();
        stack.min();
    }
}
