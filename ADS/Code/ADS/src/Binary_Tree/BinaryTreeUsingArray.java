package Binary_Tree;


class BinaryTreeArray{
	  int tree[];
	 
	  BinaryTreeArray(int s)
	  {
		  int i;
	     tree = new int[s];
	     for(i=0 ; i<tree.length ;i++)
	        tree[i] = -999;
	  }

	 

	  public void createRoot(int d)
	  {
	     if(tree[0] == -999)
	     {
	          tree[0] = d;
	     }
	     else
	     {
	         System.out.println("Tree has root node...");
	     }
	     return;
	  }

	  public void insertLeftChild(int d, int par)
	  {
	     if(tree[par] == -999)
	     {
	         System.out.println("Invalid operation..  parent absent..");
	         return;
	     }

	     tree[(par*2) + 1] = d;  
	     return;
	  }

	  public void insertRightChild(int d, int par)
	  {
	     if(tree[par] == -999)
	     {
	         System.out.println("Invalid operation..  parent absent..");
	         return;
	     }

	     tree[(par*2) + 2] = d;  
	     return;
	  }


	  public void traverse()
	  {
	    int  i;
	    for(i=0;i<tree.length;i++)
	        System.out.println(tree[i]);
	  }
	}


public class BinaryTreeUsingArray {

	public static void main(String[] args) {
		BinaryTreeArray t = new BinaryTreeArray(10);
        t.createRoot(10);
        t.insertLeftChild(20, 0);
        t.insertRightChild(30, 0);
       // t.insertLeftChild(40, 1);
        t.insertRightChild(50, 1);
        t.traverse();
	}

}
