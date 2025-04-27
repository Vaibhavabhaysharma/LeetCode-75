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
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
		
		ListNode tail = head;
		ListNode forwardNode = head.next;
		boolean flag = true;
		while(forwardNode!=null){
			head = forwardNode;
			forwardNode = forwardNode.next;
			head.next = tail;
			if(flag){
				// Only First time so that end of linkedList points to null
				tail.next = null;
				flag = false;
			}
			tail = head;
		}
	    return head;
    }
}
