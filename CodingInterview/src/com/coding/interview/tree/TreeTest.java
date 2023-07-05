package com.coding.interview.tree;

public class TreeTest {

	public static void main(String[] args) {
		Tree tree = new Tree();

		// Binary Search Tree Insertion
		// https://www.youtube.com/watch?v=LwpLXm3eb6A

		tree.insert(10);
		tree.insert(25);
		tree.insert(5);
		tree.insert(22);
		tree.insert(17);
		tree.insert(28);

		// Simplest Binary Tree Traversal trick for preorder inorder postorder
		// https://www.youtube.com/watch?v=WLvU5EQVZqY

		// preOrder - print when visiting first time
		tree.traverse(1);
		// inOrder - print when visiting second time
		tree.traverse(2);
		// postOrder - print when visiting third time
		tree.traverse(3);

		TreeNode result = tree.search(17);
		System.out.println("Result: " + result.data);
	}

}
