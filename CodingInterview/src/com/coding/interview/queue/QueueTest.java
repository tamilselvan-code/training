package com.coding.interview.queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> queue = new Queue<>();

		queue.add("One");
		queue.add("Two");
		queue.add("Three");

		queue.printQueue(queue);

		queue.remove();
		System.out.println("\n*** After remove ***");
		queue.printQueue(queue);

		System.out.println("\nPeek : " + queue.peek());
	}
}
