package linkedList;

import linkedList.Palindrome.ListNode;

public class PartitionList {
	static ListNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = null;
		head = new ListNode(192);
		head.next = new ListNode(856);
		head.next.next = new ListNode(647);
		head.next.next.next = new ListNode(251);
		head.next.next.next.next = new ListNode(37);
		head.next.next.next.next.next = new ListNode(666);
		head.next.next.next.next.next.next = new ListNode(9);
		// head.next.next.next.next.next.next.next = new ListNode(8);

		System.out.println("Sorted list is  ");
		head = partitionedList(head, 40);
		printList(head);
	}

	private static ListNode partitionedList(ListNode head2, int i) {
		// TODO Auto-generated method stub
		ListNode node = head2;

		ListNode prev = node;
		ListNode greater = head2;
		ListNode next = null;

		while (node.val < i) {
			prev = node;
			node = node.next;
		}
		greater = node;

		ListNode prevAgain = null;
		
		while (node != null) {
			if (node.val < i) {
				next = node.next;
				prev.next = node;
				node.next = greater;
				prevAgain.next = next;
				prev = node;
			}
			prevAgain = node;
			node = node.next;
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
