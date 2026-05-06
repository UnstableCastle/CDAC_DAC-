package InfowayFeb26;

import java.util.Scanner;

class CircularLL {
	private listNodeInt last;
	CircularLL() { last = null; }
	 public void insertFirst(int d)
	  {
		 listNodeInt new_node = new listNodeInt(d);
	      if(last == null)
	      {
	            last = new_node;
	            last.setNext(last);
	            return;
	      }
	      new_node.setNext(last.getNext());
	      last.setNext(new_node);
	      return;
	 }

	 public void insertLast(int d)
	  {
		 listNodeInt new_node = new listNodeInt(d);
	      if(last == null)
	      {
	            last = new_node;
	            last.setNext(last);
	            return;
	      }
	      new_node.setNext(last.getNext());
	      last.setNext(new_node);
	      last = new_node;
	      return;
	 }

	 public void display()
	 {
		 listNodeInt iter = last.getNext();
	      if(iter == null) { System.out.println("Empty.."); return; }

	      do {
	    	  System.out.println(iter.getData() + "  ");
	          iter = iter.getNext();
	     } while(iter != last.getNext());
	}
	 
	public int deleteFirst()
	{
	    if(last == null ) return -999;                             

	    listNodeInt deletable = last.getNext();

	    int d = deletable.getData();
	    if(last == deletable)   
	    {
	            deletable.setNext(null);
	            deletable = null;
	            last = null;
	             return d;
	     }
	    last.setNext(deletable.getNext());
	    deletable.setNext(null);
	    deletable = null;
	    return d;
	}
	
	public int deleteLast()
	{
	    if(last == null ) return -999;   
	    
	    if(last == last.getNext())   // only one node in CLL   
	    {
	            last.setNext(null);
	            int d = last.getData();
	            last = null;
	            return d;
	     }

	    listNodeInt iter = last.getNext();
	    while(iter.getNext() != last)
	    	iter = iter.getNext();

	    
	    listNodeInt deletable = last;
	    int d = deletable.getData();
	    iter.setNext(deletable.getNext());
	    last = iter;
	    deletable.setNext(null);
	    deletable = null;
	    return d;
	}
	
	
	
}
public class CicularLLMain {

		public static void main(String []a)
		{
			CircularLL ll = new CircularLL();
			Scanner sc=new Scanner(System.in);
			int choice, data, pos, cnt;
			do {
		       System.out.print("1. Insert First\n");
		       System.out.print("2. Insert Last \n");
		       System.out.print("3. Insert by position \n");
		       System.out.print("4. Delete First \n");
		       System.out.print("5. Delete Last \n");
		       System.out.print("6. Delete by position \n");
		       System.out.print("7. Print LL \n");
		       System.out.print("8. Exit \n");
		       
		       choice = sc.nextInt();
		       switch(choice)
		       {
		          case 1:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();  //20
		        	  ll.insertFirst(data);
		        	  break;
		          case 2:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  ll.insertLast(data);
		             break;
		          case 3:
		        	  System.out.println("Complete the function as discussed in class ");
		        	/*  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  System.out.print("Enter position : ");
		        	  pos=sc.nextInt();
		        	  ll.insertByPos(data, pos);*/
		        	  break;
		          case 4:
		        	  data=ll.deleteFirst();
		        	  System.out.println("Deleted data is : " + data);
		             break;
		          case 5:
		        	  data=ll.deleteLast();
		        	  System.out.println("Deleted data is : " + data);
		             break;
		          case 6:  
		        	  System.out.println("Complete the function as H.W. ");
		        	/*  System.out.print("Enter pos to delete : ");
		        	  pos=sc.nextInt();
		        	  data = ll.deleteByPos(pos);
		        	  System.out.println("Deleted data is : " + data +"\n");
	                 */ break;
		          case 7:  
		        	   ll.display();
	                  break;
		          case 8:  
		        	  break;
		              
		          default: System.out.print("Invalid choice..\n");
		       }//end of switch
		    }while(choice!=8);
		     sc.close();

	}

}
