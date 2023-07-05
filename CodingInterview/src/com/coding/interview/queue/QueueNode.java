package com.coding.interview.queue;

public class QueueNode<T> {
	T data;
	QueueNode<T> next;

	public QueueNode(T data) {
		this.data = data;
	}
}
