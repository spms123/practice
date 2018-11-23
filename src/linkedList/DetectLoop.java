package linkedList;

import linkedList.Palindrome.ListNode;

public class DetectLoop {

	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;

		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(2);
//		 head.next.next.next.next.next.next.next = head;

		System.out.println("Do you detect a loop? " + isItLooped(head));
	}

	private static String isItLooped(ListNode head2) {
		// TODO Auto-generated method stub
		ListNode slow = head2;
		ListNode fast = head2;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return "true";

		}
		return "false";
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
