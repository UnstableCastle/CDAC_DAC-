package for_DSA;

import java.util.Scanner;

class listNodeInt {
	  private int data;
	  private listNodeInt next;

	  public listNodeInt()
	  {
	    data=0;
	    next=null;
	  }  

	  public listNodeInt(int d)
	  {
	    data=d;
	    next=null;
	  }

	  public void setData(int d)
	  {
	      data=d;
	  }

	  public void setNext(listNodeInt n)
	  {
	      next=n;
	  }

	  public int getData()
	  {
	      return data;
	  }

	  public listNodeInt getNext()
	  {
	       return next;
	  }
	}


class linkedlist_int{
	 protected listNodeInt head;

	 public linkedlist_int()
	 {
	    head=null;
	 }

	 public listNodeInt getHead()
	 {
	    return head;
	 }

	 public void setHead(listNodeInt h)
	 {
	    head=h; 
	 }
	 
	 public void insert_last(int d)
	 {
	   listNodeInt new_node=new listNodeInt(d); 

	   if(head==null)
	   {
	       head=new_node;
	       return;
	   }

	   listNodeInt iter=head;
	   while(iter.getNext()!=null)
	       iter=iter.getNext();

	   iter.setNext(new_node);

	   return;
	 }

	 public void insert_first(int d)
	 {
	   listNodeInt new_node=new listNodeInt(d);

	   new_node.setNext(head);
	   head=new_node;
	   return;
	 }

	 public void insert_at_pos(int d, int pos)
	 {
	   listNodeInt new_node=new listNodeInt(d);

	   if(head==null)
	   {
	      head=new_node;
	      return;
	   }

	   if(pos==1)
	   {
	     new_node.setNext(head);
	     head=new_node;
	     return;
	   }

	   listNodeInt iter=head;

	   for(int i=1;i<pos-1 && iter.getNext()!=null;i++)
	       iter=iter.getNext();

	   
	   new_node.setNext(iter.getNext());
	   iter.setNext(new_node);
	   return;
	  }
	 

	  public int delete_first()
	  {
	     int d=-999;
	     listNodeInt deletable;
	     if(head==null)
	     {
	       System.out.print("invalid..");
	       return d;
	     }
	     if(head.getNext()==null)
	     {
	         d=head.getData();
	         head=null;
	         return d;
	     }   
	     deletable=head;  
	     head=head.getNext();
	     d=deletable.getData(); 
	     deletable=null;
	     return d;
	   }


	  public int delete_last()
	  {
	     listNodeInt deletable;
	     int d=-999;
	     if(head==null)
	     {
	       System.out.print("invalid..");
	       return d;
	     }
	     if(head.getNext()==null)
	     {
	         d=head.getData();
	         head=null;
	         return d;
	     }   
	     listNodeInt iter=head;

	     while(iter.getNext().getNext()!=null)   
	         iter=iter.getNext();   

	     deletable = iter.getNext();
	     iter.setNext(null);
	     d=deletable.getData();
	     deletable=null;
	     return d;
	   }

	   public int delete_by_pos(int pos)
	   {
	      int d=-999;
	      if(head==null)
	      {
	       System.out.print("invalid..");
	       return d;
	      }
	      if(pos==1)
	      {                         // use deletable 
	         d=head.getData();
	         head=head.getNext();
	         return d;
	      }
	      listNodeInt deletable,iter=head;
	      for(int i=1;i<pos-1 && iter.getNext()!=null;i++)
	           iter=iter.getNext();

	      if(iter.getNext()!=null)
	      {
	        deletable=iter.getNext();
	        d=deletable.getData();
	        iter.setNext(iter.getNext().getNext());
	        
	      }
	      else
	        System.out.print("\n Invalid position.. cannot delete...\n");

	      return d;
	  }

	  public int count_nodes()
	  {
	    int cnt=0;
	    listNodeInt iter=head;
	    while(iter!=null)
	    {
	      cnt=cnt+1;
	      iter=iter.getNext();
	    }
	    return cnt;
	  }//end of function
	    

	  public void insert_sorted(int d)
	  {
	    listNodeInt new_node= new listNodeInt(d);
	    
	    if((head==null) || (d < head.getData()))  
	    {
	       new_node.setNext(head);
	       head=new_node;
	       return;
	    }
	    listNodeInt iter=head;
	    while(iter.getNext()!=null && iter.getNext().getData() < d)
	          iter=iter.getNext();

	    new_node.setNext(iter.getNext());
	    iter.setNext(new_node);
	    
	    return;
	  }

	  public void insert_before(int d,int before)
	  {
	     listNodeInt new_node= new listNodeInt(d);

	     if((head==null) || (before == head.getData()))  
	     {
	       new_node.setNext(head);
	       head=new_node;
	       return;
	     }
	     listNodeInt iter=head;
	     while(iter.getNext()!=null && iter.getNext().getData()!=before)
	          iter=iter.getNext();

	    new_node.setNext(iter.getNext());
	    iter.setNext(new_node);
	    return;
	  }

	  
	  public linkedlist_int concat(linkedlist_int l)
	  {
		  linkedlist_int res=new linkedlist_int();
	     listNodeInt iter=head;
	     while(iter!=null)
	     {
	         res.insert_last(iter.getData());
	         iter=iter.getNext();
	     }
	     iter=l.head;
	     while(iter!=null)
	     {
	         res.insert_last(iter.getData());
	         iter=iter.getNext();
	     }
	     return res;
	  }
	 public String toString()
	 {
	   String str=new String();
	   listNodeInt iter = head;
	   if(iter==null)
	      return "List is Empty\n";

	   str="\n List : ";
	   while(iter!=null)
	   {
	      str=str+"  "+iter.getData();
	      iter = iter.getNext();
	   } 

	   str=str+"\n";
	   return str;
	 }
	 public int findMiddle()
	 {
		 listNodeInt slow, fast;
	      slow = fast = head;

	      while(fast != null && fast.getNext()!=null)
	      {
	             slow = slow.getNext();
	             fast = fast.getNext().getNext();
	      }
	      return slow.getData();
	 }


	}

  public class LinkedList_Int_Main {

	public static void main(String[] args) {
		linkedlist_int ll = new linkedlist_int();
		Scanner sc=new Scanner(System.in);
		int choice, data, pos, cnt;
		do {
		       System.out.print("1. Insert First\n");
		       System.out.print("2. Insert Last \n");
		       System.out.print("3. Insert by position \n");
		       System.out.print("4. Insert before data \n");
		       System.out.print("5. Delete First \n");
		       System.out.print("6. Delete Last \n");
		       System.out.print("7. Delete by position \n");
		       System.out.print("8. Count number of nodes \n");
		       System.out.print("9. Sorted Insert \n");
		       System.out.print("10. Find middle \n");
		       System.out.print("11. Print LL \n");
		       System.out.print("12. Exit \n");
		       
		       choice = sc.nextInt();
		       switch(choice)
		       {
		          case 1:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();  //20
		        	  ll.insert_first(data);
		        	  break;
		          case 2:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  ll.insert_last(data);
		             break;
		          case 3:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  System.out.print("Enter position : ");
		        	  pos=sc.nextInt();
		        	  ll.insert_at_pos(data, pos);
		             break;
		          case 4:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  System.out.print("Enter data before which to be inserted : ");
		        	  pos=sc.nextInt();
		        	  ll.insert_before(data, pos);
		             break;
		          case 5:  
		        	  data = ll.delete_first();
		        	  System.out.print("Data deleted : " + data +"\n");
	                  break;
		          case 6:  
		        	  data = ll.delete_last();
		        	  System.out.print("Data deleted : " + data +"\n");
	                  break;
		          case 7:  
		        	  System.out.print("Enter position to delete : ");
		        	  pos=sc.nextInt();
		        	  data = ll.delete_by_pos(pos);
		        	  System.out.print("Data deleted : " + data +"\n");
	                  break;
		          case 8:
		        	  cnt = ll.count_nodes();
		        	  System.out.print("\n Number of nodes in LL : " + cnt + "\n");
		        	  break;
		          case 9:
		        	  System.out.print("Enter data to insert : ");
		        	  data=sc.nextInt();
		        	  ll.insert_sorted(data);
		        	  break;
		          case 10:
		        	  System.out.println(ll.findMiddle());
		        	  break;
		          case 11:
		        	  System.out.print(ll);
		        	  break;
		          case 12 : break;    
		          default: System.out.print("Invalid choice..\n");
		       }//end of switch
		    }while(choice!=12);
		     sc.close();
		  }//end of main


	}
