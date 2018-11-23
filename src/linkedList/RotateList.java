package linkedList;

import linkedList.Palindrome.ListNode;

public class RotateList {

	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;

		head = new ListNode(68);
		head.next = new ListNode(86);
		head.next.next = new ListNode(36);
		head.next.next.next = new ListNode(16);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(75);
		// head.next.next.next.next.next.next = new ListNode(7);
		// head.next.next.next.next.next.next.next = new ListNode(8);

		head = rotateList(head, 90);
		System.out.println("After rotating List ");
		printList(head);
	}

	private static ListNode rotateList(ListNode head2, int n) {
		// TODO Auto-generated method stub
		ListNode node = head2;
		ListNode prev = head2;

		int total = 0;
		while (node != null) {
			node = node.next;
			total++;
		}
		node = head2;

		int temp = n % total;

		if ((n == 1 && total == 1) || temp == 0)
			return head2;

		int count = 1;

		while (count < total - temp + 1) {
			count++;
			prev = node;
			node = node.next;
		}

		ListNode tempHead;
		tempHead = node;

		while (node.next != null) {
			node = node.next;
		}
		node.next = head2;
		prev.next = null;

		return tempHead;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
