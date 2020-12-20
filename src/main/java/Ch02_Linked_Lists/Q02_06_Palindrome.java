package Ch02_Linked_Lists;

import java.util.Stack;

public class Q02_06_Palindrome {
    public static boolean palindrome(Node head) {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length ++;
            temp = temp.next;
        }
        Stack<Integer> palin = new Stack<>();
        temp = head;
        for(int i = 0; i < length / 2; i++) {
            palin.push(temp.data);
            temp = temp.next;
        }
        if(length % 2 == 1) {
            temp = temp.next;
        }
        while(temp != null) {
            if(palin.pop() != temp.data) {
                return false;
            } else {
                temp = temp.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(1);
        System.out.println(palindrome(head));
    }
}
