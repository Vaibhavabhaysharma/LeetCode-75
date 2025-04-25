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
    public ListNode deleteMiddle(ListNode head) {
        // One pass approach - O(n) & O(1) - Optimal approach

		ListNode prevNode = null;
		ListNode slowNode = head;
		ListNode fastNode = head;

		if(head == null || head.next == null){
			return null;
		}
		while(fastNode !=null && fastNode.next !=null){
			prevNode = slowNode; // move prevNode just behind slowNode 
			slowNode = slowNode.next; // Move slowNode by one
			fastNode = fastNode.next.next; // Move fastNode by two
			// so that fastNode reaches end of the LinkedList when slowNode reaches middle
			// with half the speed of fastNode
		}

		// remove slowNode, it is on the middle(location)
		prevNode.next = slowNode.next;
		return head;
    }
}
