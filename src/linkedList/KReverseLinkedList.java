package linkedList;

import linkedList.Palindrome.ListNode;

public class KReverseLinkedList {
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
		head.next.next.next.next.next.next = new ListNode(7);
		// head.next.next.next.next.next.next.next = new ListNode(8);
		int k = 2;
		System.out.println("After reversing ");
		head = KReversal(head, k);
		printList(head);
	}

	private static ListNode KReversal(ListNode head2, int k) {
		// TODO Auto-generated method stub
		ListNode node = head2;

		ListNode cur = null;
		ListNode prev = null;
		ListNode next = null;

		while (node != null) {
			int count = 1;
			cur = node;
			while (count <= k) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
				count ++;
			}
			node = prev;
		}
		return null;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
