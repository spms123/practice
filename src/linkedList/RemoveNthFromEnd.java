package linkedList;

import linkedList.Palindrome.ListNode;

public class RemoveNthFromEnd {
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

		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		// head.next.next.next.next.next.next.next = new ListNode(8);

		int n = 1;
		
		System.out.println("Before removing the " + n + "th node : ");
		printList(head);
		System.out.println();
		System.out.println("After removing " + n + "th node : ");
		head = removeNode(head, n);
		printList(head);
	}

	private static ListNode removeNode(ListNode head2, int n) {
		// TODO Auto-generated method stub
		ListNode node = head2;
		int total = 0;
		while (node != null) {
			node = node.next;
			total++;
		}

		node = head2;
		int count = 1;
		while (count < total - n) {
			node = node.next;
			count++;
		}
		if (n == 1)
			node.next = null;
		else if (n >= 2) {
			ListNode temp = node.next;
			node.next = temp.next;
		}

		return head2;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
