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
    public int pairSum(ListNode head) {
        if(head.next.next == null){
            return head.val + head.next.val;
        }
        ListNode prevNode = null;
		ListNode slowNode = head;
		ListNode fastNode = head;

		int length=0;
		while(fastNode !=null && fastNode.next !=null){
			length++;
			prevNode = slowNode; // move prevNode just behind slowNode 
			slowNode = slowNode.next; // Move slowNode by one
			fastNode = fastNode.next.next; // Move fastNode by two
			// so that fastNode reaches end of the LinkedList when slowNode reaches middle
			// with half the speed of fastNode
		}

		ListNode tail = slowNode;
		ListNode forwardNode = slowNode.next;
		boolean flag = true;
		int Maxcount = 0;

		while(forwardNode!=null){
			slowNode = forwardNode;
			forwardNode = forwardNode.next;
			slowNode.next = tail;
			if(flag){
				// Only First time so that end of linkedList points to null
				tail.next = null;
				flag = false;
			}
			tail = slowNode;
		}

		prevNode.next = slowNode;

		for(int i = 0; i<length; i++){
			Maxcount = Math.max(Maxcount, (slowNode.val+head.val));
			slowNode = slowNode.next;
			head = head.next;
		}		

	    return Maxcount;
    }
}
