package InfowayFeb26;

import java.util.Scanner;

class DblyNode {
	  private  int data;
	  private  DblyNode prev, next;

	  public DblyNode()
	  {
	      data = 0;
	      prev = next = null;
	  }

	 public DblyNode(int d)
	  {
	      data = d;
	      prev = next = null;
	  }

	  public void setData(int d) { data = d; }
	  public void setPrev(DblyNode d) { prev = d; }
	  public void setNext(DblyNode d) { next = d; }

	  public int getData() { return data; }
	  public DblyNode getPrev() { return prev; }
	  public DblyNode getNext() { return next; }

	} // end of class DblyNode


class DoublyLL {

	   private DblyNode head;

	   public DoublyLL () { head = null; }

	   public void insertFirst(int d)
	   {
	        DblyNode new_node = new DblyNode(d);

	        if(head == null)
	        {
	               head = new_node;
	               return;
	        }
	        new_node.setNext(head);
	        head.setPrev(new_node);
	        head = new_node;
	        return;
	 }

	  public void insertLast(int d)
	  {
	       DblyNode new_node = new DblyNode(d);

	       if(head == null)
	       {
	              head = new_node;
	              return;
	       }

	      DblyNode iter = head;

	      while(iter.getNext() != null)
	             iter = iter.getNext();

	      new_node.setPrev(iter);
	      iter.setNext(new_node);
	      return;
	 }

	 public void insertByPos(int d, int pos)
	 {
	     DblyNode new_node  = new DblyNode(d);

	    if(head == null)
	    {
	         head = new_node;
	         return;
	    }
	     if(pos == 1)
	     {
	          insertFirst(d);
	          return;
	     }
	     
	     DblyNode iter = head;
	     for(int i = 1 ;i <pos-1 && iter.getNext()!= null ; i++)
	              iter = iter.getNext();


	    new_node.setNext(iter.getNext());
	    new_node.setPrev(iter);
	    if(iter.getNext()!=null)
	            iter.getNext().setPrev(new_node);
	    iter.setNext(new_node);
	    return;
	}

	public int deleteFirst()
	{
	      DblyNode deletable;
	      int d = -999;
	      if(head == null)  return d;

	     deletable = head;
	     d = deletable.getData();
	     head = head.getNext();
	     deletable.setNext(null);
	     deletable = null;
	      return d;
	 }

	 public int deleteLast()
	 {
	     if(head == null)
	     {
	            return -999;
	     }
	     int d;
	     DblyNode deletable, iter = head;

	     while(iter.getNext().getNext()!=null)
	     {
	            iter = iter.getNext();
	     }
	     
	    deletable = iter.getNext();
	    iter.setNext(null);
	    d = deletable.getData();
	    deletable.setPrev(null);
	    deletable = null;
	    return d;
	 }

	 public int deleteByPos(int pos)
	 {
	     if(head == null)
	         return -999;

	    if(pos == 1)
	    {
	           return deleteFirst();
	    }
	    int i,d = -999;
	    DblyNode deletable, iter = head;
	    for(i=1 ;i<pos - 1 && iter.getNext()!=null ;i++)
	    {
	    	iter = iter.getNext();
	    }
	    deletable = iter.getNext();
	    if(deletable == null)
	    {
	    	System.out.println("Invalid position ");
	    	return d;
	    }
	    iter.setNext(deletable.getNext());
	    if(deletable.getNext()!=null)
	        deletable.getNext().setPrev(iter);
        deletable.setPrev(null);
        deletable.setNext(null);
        d = deletable.getData();
        deletable = null;
        return d;
	 }
	 public String toString()
	 {
	   String str=new String();
	   DblyNode iter = head;
	   if(iter==null)
	      return "List is Empty\n";

	   str="\n List : forward direction : ";
	   while(iter.getNext()!=null)
	   {
	      str=str+"  "+iter.getData();
	      iter = iter.getNext();
	   } 
       str = str + "  "+iter.getData();
	   str=str+"\n";
	   
	   str=str + "\n List : backward direction : ";
	   while(iter!=null)
	   {
	      str=str+"  "+iter.getData();
	      iter = iter.getPrev();
	   } 
       //str = str + "  "+iter.getData();
	   str=str+"\n";
	   
	   return str;
	 }
}

public class DblyLikedListUser {
	public static void main(String []a)
	{
		DoublyLL ll = new DoublyLL();
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
	        	  System.out.print("Enter data to insert : ");
	        	  data=sc.nextInt();
	        	  System.out.print("Enter position : ");
	        	  pos=sc.nextInt();
	        	  ll.insertByPos(data, pos);
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
	        	  System.out.print("Enter pos to delete : ");
	        	  pos=sc.nextInt();
	        	  data = ll.deleteByPos(pos);
	        	  System.out.println("Deleted data is : " + data +"\n");
                  break;
	          case 7:  
	        	   System.out.println(ll);
                  break;
	          case 8:  
	        	  break;
	              
	          default: System.out.print("Invalid choice..\n");
	       }//end of switch
	    }while(choice!=8);
	     sc.close();
  }
}
