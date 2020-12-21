package Ch02_Linked_Lists;

public class Q02_05_Sum_Lists {
    public LinkedListNode sum(LinkedListNode num1, LinkedListNode num2) {
        boolean carry = false;
        LinkedListNode newNum = null;
        while (num1 != null && num2 != null) {
            int digit = num1.val + num2.val;
            if (carry) {
                digit++;
            }
            carry = digit > 9;
            digit = digit % 10;
            if (newNum == null) {
                newNum = new LinkedListNode(digit);
            } else {
                newNum.appendToTail(digit);
            }
            num1 = num1.next;
            num2 = num2.next;
        }
        while (num1 != null) {
            if (carry) {
                newNum.appendToTail(num1.val + 1);
                carry = false;
            } else {
                newNum.appendToTail(num1.val);
            }
            num1 = num1.next;
        }
        while (num2 != null) {
            if (carry) {
                newNum.appendToTail(num2.val + 1);
                carry = false;
            } else {
                newNum.appendToTail(num2.val);
            }
            num2 = num2.next;
        }
        return newNum;
    }
}
