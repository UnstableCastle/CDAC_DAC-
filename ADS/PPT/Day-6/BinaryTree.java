package InfowayFeb26;
import java.util.LinkedList;
import java.util.Queue;


class BTNode {
    private int data;
    private BTNode left, right;

   public BTNode() { data = 0; left = null ; right = null; }
   public BTNode(int d) { data  = d; left = null ; right = null ;}
   public void setData(int d) { data = d; return; }
   public void setLeft(BTNode d) { left = d; return; }
   public void setRight(BTNode d) { right = d; return; }
   public int getData() { return data; }
   public BTNode getLeft() { return left; }
   public BTNode getRight() { return right; }
} // end of class


 class myBinaryTree {
	  private BTNode root;

	     public myBinaryTree() { root = null; }
	     public void setRoot(BTNode r) { root = r; }
	     public BTNode getRoot() {  return root; }

	     public BTNode createNode(int d)
	     {
	          BTNode new_node = new BTNode(d);
	          return new_node;
	     }



	    private void visitPreOrder(BTNode r)
	    {
	         if( r== null ) return;

	        System.out.print(r.getData() + "  ");
	        visitPreOrder(r.getLeft());
	        
	        visitPreOrder(r.getRight());
	    }

	   public void preOrder()                          // wrapper function
	   {
	         visitPreOrder(root);
	    }
	   
	   public void display_levelwise()
	   {
		   if(root == null)
		   {
			   System.out.println("Empty");
			   return;
		   }
		   BTNode iter;
		   Queue<BTNode> q = new LinkedList<BTNode>();
		   q.add(root);
		   while(!q.isEmpty())
		   {
			   iter = q.remove();
			   System.out.print(iter.getData() +" ");
			   if(iter.getLeft()!=null)
				   q.add(iter.getLeft());
			   if(iter.getRight()!=null)
				   q.add(iter.getRight());
		   }
	   }
	   
	   public void display_leafNodes()
	   {
		   if(root == null)
		   {
			   System.out.println("Empty");
			   return;
		   }
		   BTNode iter;
		   Queue<BTNode> q = new LinkedList<BTNode>();
		   q.add(root);
		   while(!q.isEmpty())
		   {
			   iter = q.remove();
			   if(iter.getLeft()==null && iter.getRight()==null)
			      System.out.print(iter.getData() +" ");
			   if(iter.getLeft()!=null)
				   q.add(iter.getLeft());
			   if(iter.getRight()!=null)
				   q.add(iter.getRight());
		   }
	   }
	   
	   public int sum_nonLeafNodes()
	   {
		   int sum = 0;
		   if(root == null)
		   {
			   System.out.println("Empty");
			   return 0;
		   }
		   BTNode iter;
		   Queue<BTNode> q = new LinkedList<BTNode>();
		   q.add(root);
		   while(!q.isEmpty())
		   {
			   iter = q.remove();
			   if(iter.getLeft()!=null || iter.getRight()!=null)
			      sum = sum + iter.getData();
			   if(iter.getLeft()!=null)
				   q.add(iter.getLeft());
			   if(iter.getRight()!=null)
				   q.add(iter.getRight());
		   }
		   return sum;
	   }
	   
	   
	   
	   public void insert_levelwise(int d)
	   {
		   BTNode new_node = new BTNode(d);
		   if(root == null)
		   {
			   root = new_node;
			   return;
		   }
		   BTNode iter;
		   Queue<BTNode> q = new LinkedList<BTNode>();
		   q.add(root);
		   while(!q.isEmpty())
		   {
			   iter=q.remove();
			   if(iter.getLeft() == null)
			   {
				   iter.setLeft(new_node);
				   return;
			   }
			   else
				   q.add(iter.getLeft());
			   if(iter.getRight() == null)
			   {
				   iter.setRight(new_node);
				   return;
			   }
			   else
				   q.add(iter.getRight());
		   } 
	   }// end of function
	   
	   public boolean TreeCompare(myBinaryTree t1)
	   {
		   BTNode iter1, iter2;
	        if(root == null   ||  t1.getRoot() == null) return false;

	        Queue<BTNode> q1 = new LinkedList<BTNode>();
	        Queue<BTNode> q2 = new LinkedList<BTNode>();

	      iter1 = root;
	      iter2 = t1.getRoot();

	     q1.add(iter1);
	     q2.add(iter2);
	   
	      while( (!q1.isEmpty()) && (!q2.isEmpty()))
	      {
	           iter1 = q1.remove();
	           iter2 = q2.remove();

	           if(iter1.getData() != iter2.getData()) return false;

	           if(iter1.getLeft() != null) q1.add(iter1.getLeft());
	           if(iter1.getRight() != null) q1.add(iter1.getRight());


	           if(iter2.getLeft() !=null )  q2.add(iter2.getLeft());
	           if(iter2.getRight() !=null )  q2.add(iter2.getRight());
	     }

	    if( (q1.isEmpty()) && (q2.isEmpty()))
	           return true;
	    else
	           return false;

	   }
	   
}//end of class
 
 public class BinaryTree {
	 public static void main(String []a)
	 {
		 myBinaryTree bt1 = new myBinaryTree();
		 myBinaryTree bt2 = new myBinaryTree();
		 
	     for(int i = 1 ;i<=7 ;i++)
	     {
	    	 bt1.insert_levelwise(i+10);
	     }
		 bt1.insert_levelwise(77);
	     
	     for(int i = 1 ;i<=7 ;i++)
	     {
	    	 bt2.insert_levelwise(i+10);
	     }
	     
	     System.out.println(bt1.TreeCompare(bt2));
		 /*
		 bt.preOrder();
		 
		 System.out.println(" ");
		 bt.display_levelwise();
		 
		 System.out.println(" ");
		 bt.display_leafNodes();
		 System.out.println(" ");
		 System.out.println(bt.sum_nonLeafNodes());
		 */
	 }
 }
