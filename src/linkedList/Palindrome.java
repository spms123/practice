package linkedList;

import java.awt.List;
import java.awt.print.Printable;

import linkedList.ReverseLinkedList.ListNode;

public class Palindrome {

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
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(2);
		// head.next.next.next.next.next.next.next = new ListNode(8);

		System.out.println("Is the given list a palindrome? " + isPalindrome(head));
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	private static Boolean isPalindrome(ListNode head) {
		// TODO Auto-generated method stub
		ListNode node = head;

		// getting the mid
		ListNode slow_ptr = head;
		ListNode fast_ptr = head;
		ListNode prev_slow_ptr = head;
		ListNode midNode = null;
		while (fast_ptr.next != null && fast_ptr.next.next != null) {
			prev_slow_ptr = slow_ptr;
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}

		if (fast_ptr.next == null) {
			midNode = slow_ptr;
			slow_ptr = prev_slow_ptr;
		} else if (fast_ptr.next.next == null) {
			fast_ptr = fast_ptr.next;
		}

		// reversing the 2nd half
		ListNode rev_head = null;
		ListNode cur = midNode == null ? slow_ptr.next : midNode.next;
		ListNode next = null;
		ListNode prev = null;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		rev_head = prev;

		// printList(rev_head);

		while (node.next != slow_ptr & rev_head != null) {
			if (node.val != rev_head.val) {
				return false;
			}
			node = node.next;
			rev_head = rev_head.next;
		}
		return true;
	}

}
