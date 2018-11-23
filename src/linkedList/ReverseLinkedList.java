package linkedList;

import linkedList.Palindrome.ListNode;

public class ReverseLinkedList {

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
		printList(head);
		System.out.println();
		head = reverseList(head);
		printList(head);
	}

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	private static ListNode reverseList(ListNode head) {
		// TODO Auto-generated method stub
		ListNode node = head;

		ListNode cur = node;
		ListNode prev = null;
		ListNode next = null;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		return head;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

}
