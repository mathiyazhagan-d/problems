/*
You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.



        Example 1:


        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]

*/


public class Solution {

    public static class ListNode {
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

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummyHead = new ListNode(); // Dummy node to simplify the code
            ListNode current = dummyHead;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            // If one of the lists is not fully traversed, connect the remaining nodes
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            return dummyHead.next;
        }




    public static void main(String[] args) {
        // Create nodes for list1: 1 -> 2 -> 4
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node4;

        ListNode list1 = node1;

        // Create nodes for list2: 1 -> 3 -> 4
        ListNode node1_2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4_2 = new ListNode(4);

        node1_2.next = node3;
        node3.next = node4_2;

        ListNode list2 = node1_2;

        // Merge the two lists
        Solution sol = new Solution();
        ListNode mergedList = sol.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

}
