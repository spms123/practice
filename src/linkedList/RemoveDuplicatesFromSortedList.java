package linkedList;

import linkedList.Palindrome.ListNode;

public class RemoveDuplicatesFromSortedList {
	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;
		// head = new ListNode(1);
		// head.next = new ListNode(2);
		// head.next.next = new ListNode(3);
		// head.next.next.next = new ListNode(4);
		// head.next.next.next.next = new ListNode(4);
		// head.next.next.next.next.next = new ListNode(1);
		// head.next.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next.next = new ListNode(1);

		head = new ListNode(11);
		head.next = new ListNode(11);
		head.next.next = new ListNode(11);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next.next = new ListNode(8);
		removeDuplicates(head);
		System.out.println("After removing duplicates ");
		printList(head);
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	static class ListNode {
		public int data;
		public ListNode next;

		ListNode(int x) {
			data = x;
			next = null;
		}
	}

	private static ListNode removeDuplicates(ListNode head) {
		// TODO Auto-generated method stub
		ListNode cur = head;
		ListNode next = null;
		while (cur.next != null) {
			next = cur.next;
			if (cur.data == next.data) {
				cur.next = next.next;
				next = null;
			} else {
				cur = cur.next;
			}
		}
		return head;

	}

}
