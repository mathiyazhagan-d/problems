

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.



        Example 1:


        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
*/
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating linked lists
        Solution.ListNode l1 = sol.new ListNode(2, sol.new ListNode(4, sol.new ListNode(3)));
        Solution.ListNode l2 = sol.new ListNode(5, sol.new ListNode(6, sol.new ListNode(4)));

        // Calling addTwoNumbers method
        Solution.ListNode ans = sol.addTwoNumbers(l1, l2);

        // Printing the result
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }

    }
}

class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int currentSum = l1Val + l2Val + carry;
            carry = currentSum / 10;
            int lastDigit = currentSum % 10;

            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }

        return dummyHead.next;
    }
}
