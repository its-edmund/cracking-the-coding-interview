package Ch02_Linked_Lists;

import java.util.Stack;

public class Q02_06_Palindrome {
    public boolean isPalindrome(LinkedListNode head) {
        int length = 0;
        LinkedListNode temp = head;
        while(temp != null) {
            length ++;
            temp = temp.next;
        }
        Stack<Integer> palin = new Stack<>();
        temp = head;
        for(int i = 0; i < length / 2; i++) {
            palin.push(temp.val);
            temp = temp.next;
        }
        if(length % 2 == 1) {
            temp = temp.next;
        }
        while(temp != null) {
            if(palin.pop() != temp.val) {
                return false;
            } else {
                temp = temp.next;
            }
        }
        return true;
    }
}
