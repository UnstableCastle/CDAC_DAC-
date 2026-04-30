package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;


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
        System.out.print("\nPre-order: ");
        visitPreOrder(root);
    }

    private void visitInOrder(BTNode r) {
        if (r == null)
            return;

        visitInOrder(r.getLeft());
        System.out.print(r.getData() + " ");
        visitInOrder(r.getRight());
    }

    public void inorder() {
        System.out.print("\nIn-order: ");
        visitInOrder(root);
    }

    private void visitPostOrder(BTNode r) {
        if (r == null)
            return;

        visitPostOrder(r.getLeft());
        visitPostOrder(r.getRight());
        System.out.print(r.getData() + " ");
    }

    public void postorder() {
        System.out.print("\nPost-order: ");
        visitPostOrder(root);
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

    public void display_by_level_leaf() {
        if (root == null) {
            System.out.println("\nTree is empty!");
            return;
        }

        Queue<BTNode> q = new LinkedList<>();
        BTNode iter;

        q.add(root);
        System.out.print("\nLeaf Nodes: ");

        while (!q.isEmpty()) {
            iter = q.remove();

            if (iter.getLeft() == null && iter.getRight() == null) {
                System.out.print(iter.getData() + " ");
            }

            if (iter.getLeft() != null)
                q.add(iter.getLeft());

            if (iter.getRight() != null)
                q.add(iter.getRight());
        }
    }

    public void display_by_level_Non_leaf() {
        if (root == null) {
            System.out.println("\nTree is empty!");
            return;
        }

        Queue<BTNode> q = new LinkedList<>();
        BTNode iter;

        q.add(root);
        System.out.print("\nNon-Leaf Nodes: ");

        while (!q.isEmpty()) {
            iter = q.remove();

            if (iter.getLeft() != null && iter.getRight() != null) {
                System.out.print(iter.getData() + " ");
            }

            if (iter.getLeft() != null)
                q.add(iter.getLeft());

            if (iter.getRight() != null)
                q.add(iter.getRight());
        }
    }

    public void sum_Non_leaf() {
        int sum = 0;

        if (root == null) {
            System.out.println("\nTree is empty!");
            return;
        }

        Queue<BTNode> q = new LinkedList<>();
        BTNode iter;

        q.add(root);

        while (!q.isEmpty()) {
            iter = q.remove();

            if (iter.getLeft() != null && iter.getRight() != null) {
                sum += iter.getData();
            }

            if (iter.getLeft() != null)
                q.add(iter.getLeft());

            if (iter.getRight() != null)
                q.add(iter.getRight());
        }

        System.out.println("\nSum of Non-Leaf Nodes: " + sum);
    }

    public void sum_leaf() {
        int sum = 0;

        if (root == null) {
            System.out.println("\nTree is empty!");
            return;
        }

        Queue<BTNode> q = new LinkedList<>();
        BTNode iter;

        q.add(root);

        while (!q.isEmpty()) {
            iter = q.remove();

            if (iter.getLeft() == null && iter.getRight() == null) {
                sum += iter.getData();
            }

            if (iter.getLeft() != null)
                q.add(iter.getLeft());

            if (iter.getRight() != null)
                q.add(iter.getRight());
        }

        System.out.println("Sum of Leaf Nodes: " + sum);
    }
}

public class MyBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.setRoot(bt.createNode(50));
        bt.getRoot().setLeft(bt.createNode(17));
        bt.getRoot().setRight(bt.createNode(72));

        bt.getRoot().getLeft().setLeft(bt.createNode(12));
        bt.getRoot().getLeft().setRight(bt.createNode(23));

        bt.getRoot().getRight().setLeft(bt.createNode(54));
        bt.getRoot().getRight().setRight(bt.createNode(76));

        bt.getRoot().getLeft().getLeft().setLeft(bt.createNode(9));
        bt.getRoot().getLeft().getLeft().setRight(bt.createNode(14));

        bt.getRoot().getLeft().getRight().setLeft(bt.createNode(19));
        bt.getRoot().getRight().getLeft().setRight(bt.createNode(67));

        bt.preorder();
        System.out.println();
        bt.inorder();
        System.out.println();
        bt.postorder();
        System.out.println();
        bt.display_by_level();
        System.out.println();
        bt.display_by_level_leaf();
        System.out.println();
        bt.display_by_level_Non_leaf();
        System.out.println();
        bt.sum_Non_leaf();
        System.out.println();
        bt.sum_leaf();
    }
}
