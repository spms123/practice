package linkedList;

import linkedList.Palindrome.ListNode;

public class ReverseListFromM2N {
	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;

		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		// head.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next.next = new ListNode(8);
		int m = 1;
		int n = 5;
		head = reverseList(head, m, n);
		System.out.println("after reversing from " + m + " to " + n);
		printList(head);
	}

	private static ListNode reverseList(ListNode head, int m, int n) {
		// TODO Auto-generated method stub
		ListNode tail = head;
		ListNode tempHead = head;
		ListNode tempprev = null;
		ListNode node = head;

		int count = 1;

		while (count < m) {
			tempprev = node;
			node = node.next;
			count++;
		}

		if (count == 1 && m >1)
			return head;

		tail = node;

		ListNode cur = tail.next;
		ListNode prev = tail;
		ListNode next = null;

		while (count < n) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}

		tempHead = prev;
		tail.next = cur;
		if (tempprev == null)
			head = tempHead;
		else
			tempprev.next = tempHead;

		return head;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
