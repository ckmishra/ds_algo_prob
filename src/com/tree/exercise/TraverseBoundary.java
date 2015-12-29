package com.tree.exercise;

public class TraverseBoundary {

	public void main(String args[]) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(50);
		tree.insert(5);
		tree.insert(2);
		tree.insert(16);
		printBoundary(tree);
	}

	private void printBoundary(Tree tree) {
		printLeftBoundary(tree.root);
		printLeaves(tree.root);
		printRightBoundary(tree.root);
	}

	private void printLeftBoundary(Node root) {
		if (root == null) {
			return;
		}

	}

	private void printRightBoundary(Node root) {

	}

	private void printLeaves(Node root) {

	}

}
