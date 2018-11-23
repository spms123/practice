package linkedList;

import linkedList.Palindrome.ListNode;

public class ReorderList {

	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		 head.next.next.next.next.next.next = new ListNode(7);

		System.out.println("reordered list is ");
		reorderedList(head);
		
	}

	private static void reorderedList(ListNode head2) {
		// TODO Auto-generated method stub
		ListNode node = head2;
		ListNode slow = head2;
		ListNode fast = head2;
		
		//use a fast and slow pointer to break the link to two parts.
		while (fast != null && fast.next != null && fast.next.next!= null) {
			
			
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		ListNode slowHead = slow.next;
		slow.next = null;
		ListNode prev = null;
		ListNode cur = slowHead;
		ListNode next = null;
		
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		slowHead = prev;
		
		
		while(slowHead != null) {
			ListNode temp1 = node.next;
			ListNode temp2 = slowHead.next;			
			
			node.next = slowHead;
			slowHead.next = temp1;
			
			node = temp1;
			slowHead = temp2;
		}
		printList(head);
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

}
