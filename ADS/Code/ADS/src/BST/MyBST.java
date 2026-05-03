package BST;

import java.util.LinkedList;
import java.util.Queue;

class BTNode {
	private int data;
	private BTNode left;
	private BTNode right;

	public BTNode() {
		data = 0;
		left = right = null;
	}

	public BTNode(int data) {
		this.data = data;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

class BST {
	private BTNode root;

	public BST() {
		root = null;
	}

	@Override
	public String toString() {
		return "BST [root=" + root + "]";
	}

	public void insert_non_rec(int data) {
		BTNode new_node = new BTNode(data);

		if (root == null) {
			root = new_node;
			return;
		}

		BTNode iter = root;
		BTNode parent = null;
		while (iter != null) {
			parent = iter;
			if (data < iter.getData()) {
				iter = iter.getLeft();
			}
			if (data > iter.getData()) {
				iter = iter.getRight();
			} else {
				System.out.println("Duplicate");
				return;
			}

		}
		if (data < parent.getData()) {
			parent.setLeft(new_node);
		} else if (data > parent.getData()) {
			parent.setRight(new_node);
		} else
			return;
	}

	public void display_by_level() {
		if (root == null) {
			System.out.println("\nTree is empty!");
			return;
		}

		Queue<BTNode> q = new LinkedList<>();
		BTNode iter;

		q.add(root);
		System.out.print("\nLevel Order: ");

		while (!q.isEmpty()) {
			iter = q.remove();
			System.out.print(iter.getData() + " ");

			if (iter.getLeft() != null)
				q.add(iter.getLeft());

			if (iter.getRight() != null)
				q.add(iter.getRight());
		}
	}

	public boolean search(int key) {
		if (root == null) {
			System.out.println("empty");
			return false;

		}
		BTNode iter = root;

		while (iter != null) {

			if (iter.getData() == key) {
				return true;
			}

		 if (iter.getData() > key) {
			iter = iter.getLeft();
			} 
			
			else {
				iter = iter.getRight();
			}

		}
		return false;
	}

}

public class MyBST {
	public static void main(String[] args) {

		BST bt1 = new BST();
		bt1.insert_non_rec(1);
		bt1.insert_non_rec(10);
		bt1.insert_non_rec(100);

		System.out.println(bt1);
		bt1.display_by_level();
		System.out.println(bt1.search(11));
		System.out.println(bt1.search(1));
		System.out.println(bt1.search(10));
		System.out.println(bt1.search(100));
		
	}

}
