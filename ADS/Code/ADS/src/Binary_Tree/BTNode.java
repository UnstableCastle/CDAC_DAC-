package Binary_Tree;

public class BTNode {

	private int data;
	private BTNode left;
	private BTNode right;
	
	
	
	public BTNode() {
		data = 0;
		left = null;
		right = null;
		
	}
	
	public BTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setData(int data) {
		
		this.data = data;
				
	}
		
	public void setLeft(BTNode left) {
		this.left = left;
		}
	
	public void setRight(BTNode right) {
		this.right = right;
		
	}

	public int getData() {
		return data;
	}

	public BTNode getRight() {
		return right;
	}
	
	public BTNode getLeft() {
		return left;
	}

	@Override
	public String toString() {
		return "BTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	

}
