package Binary_Tree;

class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}

	public BTNode getRoot() {
		return root;
	}

	public BTNode createNode(int data) {
		return new BTNode(data);
	}

	public void setRoot(BTNode node) {
		this.root = node;
	}

	private void visitPreOrder(BTNode r) {
		if (r == null)
			return;
		System.out.print(r.getData() + " ");
		visitPreOrder(r.getLeft());
		visitPreOrder(r.getRight());
	}

	public void preorder() {
		System.out.print("Pre-order:  ");
		visitPreOrder(root);
		System.out.println();
	}

	private void visitInOrder(BTNode r) {
		if (r == null)
			return;
		visitInOrder(r.getLeft());
		System.out.print(r.getData() + " ");
		visitInOrder(r.getRight());
	}

	public void inorder() {
		System.out.print("In-order:   ");
		visitInOrder(root);
		System.out.println(" (Notice this is sorted!)");
	}

	private void visitPostOrder(BTNode r) {
		if (r == null)
			return;
		visitPostOrder(r.getLeft());
		visitPostOrder(r.getRight());
		System.out.print(r.getData() + " ");
	}

	public void postorder() {
		System.out.print("Post-order: ");
		visitPostOrder(root);
		System.out.println();
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}
	
	public void display_by_level() {
		if(root==null) {
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

public class MyBinaryTree {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
//
//		bt.setRoot(bt.createNode(50));
//		bt.getRoot().setLeft(bt.createNode(17));
//		bt.getRoot().setRight(bt.createNode(72));
//
//		bt.getRoot().getLeft().setLeft(bt.createNode(12));
//		bt.getRoot().getLeft().setRight(bt.createNode(23));
//
//		bt.getRoot().getRight().setLeft(bt.createNode(54));
//		bt.getRoot().getRight().setRight(bt.createNode(76));
//
//		bt.getRoot().getLeft().getLeft().setLeft(bt.createNode(9));
//		bt.getRoot().getLeft().getLeft().setRight(bt.createNode(14));
//
//		bt.getRoot().getLeft().getRight().setLeft(bt.createNode(19));
//		bt.getRoot().getRight().getLeft().setRight(bt.createNode(67));
//
//		System.out.println("");
//		bt.preorder();
//		bt.inorder();
//		bt.postorder();
	}
}