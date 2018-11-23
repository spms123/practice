package linkedList;

public class OnlyDistinctNodes {
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
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next.next = new ListNode(8);
		head = removeDuplicates(head);
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
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode cur = head;
				
		while(cur != null) {
			while(cur.next != null && prev.next.data == cur.next.data)
				cur = cur.next;
			
			if(prev.next == cur)
				prev = prev.next;
			else
				prev.next = cur.next;
			
			cur = cur.next;
			
		}
		head = dummy.next;
		
		return head;

	}

}
