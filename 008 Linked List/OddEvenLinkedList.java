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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
	        return head;
	    }

	    ListNode oddNode = head;
	    ListNode evenNode = head.next;
	    ListNode evenHead = evenNode; // Save head of even list to connect later

	    while (evenNode != null && evenNode.next != null) {
	        oddNode.next = evenNode.next; // connect current oddNode to next oddNode present after evenNode [1->3]
	        oddNode = oddNode.next; // mark the newly connected oddNode as current oddNode [3]

	        evenNode.next = oddNode.next; // connect current evenNode to next evenNode present after oddNode [0->2]
	        evenNode = evenNode.next; // mark the newly connected evenNode as current evenNode [2]
	    }

	    // Connect the last odd node to the head of even list
	    oddNode.next = evenHead;

	    return head;
    }
}
