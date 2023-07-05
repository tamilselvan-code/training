package com.coding.interview.queue;

import java.util.NoSuchElementException;

public class Queue<T> {

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {
			first = last;
		}
	}

	public T remove() {
		if (first == null)
			throw new NoSuchElementException();

		T data = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return data;
	}

	public T peek() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void printQueue(Queue<T> queue) {
		QueueNode<T> n = queue.first;
		System.out.println("Data: " + n.data);

		while (n.next != null) {
			n = n.next;
			System.out.println("Data: " + n.data);
		}
	}
}
