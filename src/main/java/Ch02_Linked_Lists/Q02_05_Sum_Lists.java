package Ch02_Linked_Lists;

public class Q02_05_Sum_Lists {
    public static Node sumLists(Node num1, Node num2) {
        boolean carry = false;
        Node newNum = null;
        while (num1 != null && num2 != null) {
            int digit = num1.data + num2.data;
            if (carry) {
                digit++;
            }
            carry = digit > 9;
            digit = digit % 10;
            if (newNum == null) {
                newNum = new Node(digit, null);
            } else {
                newNum.appendToTail(digit);
            }
            num1 = num1.next;
            num2 = num2.next;
        }
        while (num1 != null) {
            if (carry) {
                newNum.appendToTail(num1.data + 1);
                carry = false;
            } else {
                newNum.appendToTail(num1.data);
            }
            num1 = num1.next;
        }
        while (num2 != null) {
            if (carry) {
                newNum.appendToTail(num2.data + 1);
                carry = false;
            } else {
                newNum.appendToTail(num2.data);
            }
            num2 = num2.next;
        }
        return newNum;
    }
    
    public static void main(String[] args) {
        Node num1 = new Node(1, null);
        num1.appendToTail(6);
        num1.appendToTail(5);
        Node num2 = new Node(4, null);
        num2.appendToTail(4);
        num2.appendToTail(2);
        num2.appendToTail(8);
        Node ans = sumLists(num1, num2);
        while(ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
