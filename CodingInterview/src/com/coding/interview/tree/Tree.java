package com.coding.interview.tree;

public class Tree {

	public TreeNode root;

	public void insert(int data) {
		TreeNode tempNode = new TreeNode();
		tempNode.data = data;

		// if tree is empty
		if (root == null) {
			root = tempNode;
		} else {
			TreeNode current = root;
			TreeNode parent = null;

			while (true) {
				parent = current;
				// go to left of the tree
				if (data < parent.data) {
					current = current.left;
					// insert to the left
					if (current == null) {
						parent.left = tempNode;
						return;
					}
				} // go to right of the tree
				else {
					current = current.right;
					// insert to the right
					if (current == null) {
						parent.right = tempNode;
						return;
					}
				}
			}
		}
	}

	public void traverse(int traversalType) {

		switch (traversalType) {
		case 1:
			System.out.println("\nPreorder traversal: ");
			preOrderTraversal(root);
			break;
		case 2:
			System.out.println("\nInorder traversal: ");
			inOrderTraversal(root);
			break;
		case 3:
			System.out.println("\nPostorder traversal: ");
			postOrderTraversal(root);
			break;
		}
	}

	public TreeNode search(int data) {
		System.out.println("\n*** Search ***");
		TreeNode current = root;
		System.out.println("Visiting elements: ");
		while (current.data != data) {
			if (current != null)
				System.out.println(current.data + " ");
			// go to left tree
			if (current.data > data) {
				current = current.left;
			} // else go to right tree
			else {
				current = current.right;
			}
			// not found
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}

	void preOrderTraversal(TreeNode node) {
		if (node != null) {
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	void postOrderTraversal(TreeNode node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			visit(node);
		}
	}

	private void visit(TreeNode node) {
		System.out.println("Data: " + node.data);
	}
}
