package com.coding.interview.linkedlist;

public class LinkedList {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		Node n = new Node(5);

		linkedList.appendToTail(n, 10);
		linkedList.appendToTail(n, 25);
		linkedList.appendToTail(n, 30);

		printList(n);

		n = linkedList.deleteNode(n, 25);

		printList(n);
	}

	private void appendToTail(Node n, int d) {
		Node end = new Node(d);

		// Go to the last node
		while (n.next != null) {
			n = n.next;
		}

		n.next = end;
	}

	private Node deleteNode(Node head, int data) {
		Node n = head;

		if (n.data == data) {
			return head.next; /* moved head */
		}

		while (n.next != null) {
			if (n.next.data == data) {
				n.next = n.next.next;
				return head; /* head didn't change */
			}
			n = n.next;
		}
		return head;
	}

	private static void printList(Node n) {
		System.out.println("Data: " + n.data);

		while (n.next != null) {
			n = n.next;
			System.out.println("Data: " + n.data);
		}
	}
}
