package linkedList;

public class MergeSortedList {
	static ListNode head;
	static ListNode head1;

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
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		head.next.next.next.next = new ListNode(50);
		head.next.next.next.next.next = new ListNode(60);
		head.next.next.next.next.next.next = new ListNode(70);

		head1 = new ListNode(1);
		head1.next = new ListNode(5);
		head1.next.next = new ListNode(12);
		head1.next.next.next = new ListNode(25);
		head1.next.next.next.next = new ListNode(50);
		// head.next.next.next.next.next.next.next = new ListNode(8);
		head = mergeList(head, head1);
		System.out.println("After merging");
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

	private static ListNode mergeList(ListNode h1, ListNode h2) {
		// TODO Auto-generated method stub
		if (h1 == null && h2 == null)
			return null;

		if (h1 == null)
			return h2;
		else if (h2 == null)
			return h1;

		ListNode n1 = h1;
		ListNode n2 = h2;

		ListNode dummy = new ListNode(0);
		ListNode h3 = dummy;

		while (n1 != null && n2 != null) {
			if (n1.data <= n2.data) {
				h3.next = n1;
				n1 = n1.next;
			} else {
				h3.next = n2;
				n2 = n2.next;
			}
			h3 = h3.next;
		}
		printList(h3);
		if(n1 != null)
			h3.next = n1;
		
		if(n2 != null)
			h3.next = n2;

		return dummy.next;
	}

}
