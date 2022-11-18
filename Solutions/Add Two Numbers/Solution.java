/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int sum;
        int carry = 0;
        while (l1 != null && l2 != null) {
            sum = 0;
            sum = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        while (l1 != null) {
            sum = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            l1 = l1.next;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        while (l2 != null) {
            sum = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if (carry == 1) {
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return result.next;
    }
}