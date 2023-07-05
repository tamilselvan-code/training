package com.coding.interview.stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("Test one");
		stack.push("Test two");
		stack.push("Test three");

		stack.printStack(stack);

		System.out.println("Peek : " + stack.peek());

		System.out.println("Pop : " + stack.pop());

		System.out.println("Pop : " + stack.pop());
		
		System.out.println("Pop : " + stack.pop());
		
		System.out.println("Pop : " + stack.pop());
	}

}
