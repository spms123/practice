package linkedList;

import linkedList.Palindrome.ListNode;

public class AddListAsNumber {

	static ListNode head1;
	static ListNode head2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head1 = null;

		head1 = new ListNode(9);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);
		head1.next.next.next.next.next = new ListNode(6);
		head1.next.next.next.next.next.next = new ListNode(7);

		head2 = null;

		head2 = new ListNode(2);
		head2.next = new ListNode(3);
		head2.next.next = new ListNode(4);
		head2.next.next.next = new ListNode(5);
		head2.next.next.next.next = new ListNode(6);
		head2.next.next.next.next.next = new ListNode(7);
		head2.next.next.next.next.next.next = new ListNode(8);

		head1 = addedListIs(head1, head2);
		System.out.println("after adding ");
		printList(head1);
	}

	private static ListNode addedListIs(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode node1 = head1;
		ListNode node2 = head2;
		ListNode head3 = null;

		ListNode temp = null;
		ListNode prev = null;

		node1 = reverseList(head1);
		node2 = reverseList(head2);

		int carry = 0;
		int res = 0;
		while (node1 != null || node2 != null) {
			res = (node1 != null ? node1.val : 0) + (node2 != null ? node2.val : 0) + carry;
			if (res > 9) {
				res = res % 10;
				carry = 1;
			} else
				carry = 0;

			temp = new ListNode(res);

			if (head3 == null)
				head3 = temp;
			else
				prev.next = temp;

			prev = temp;

			if (node1 != null)
				node1 = node1.next;
			if (node2 != null)
				node2 = node2.next;
		}
		if (carry > 0)
			temp.next = new ListNode(carry);

		return reverseList(head3);
	}

	private static ListNode reverseList(ListNode node) {
		ListNode cur = node;
		ListNode prev = null;
		ListNode next = null;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		node = prev;
		return node;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}
