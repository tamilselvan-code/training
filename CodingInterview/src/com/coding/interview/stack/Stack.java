package com.coding.interview.stack;

import java.util.EmptyStackException;

public class Stack<T> {

	private StackNode<T> top;

	public T pop() {
		if (top == null)
			throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}

	public T peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

	public void printStack(Stack<T> stack) {
		StackNode<T> n = stack.top;
		System.out.println("Data: " + n.data);

		while (n.next != null) {
			n = n.next;
			System.out.println("Data: " + n.data);
		}
	}
}