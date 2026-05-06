package Graph;


import java.util.Scanner;

class myGraph{
	int adj[][]; 
	int n;      
	public myGraph(int i)
	{
		n = i;
		adj = new int[n][n];
	}
	public void create_graph()
	{
		int i,max_edges,origin,destin;

		Scanner sc=new Scanner(System.in);
		max_edges = n*(n-1); /*directed graph*/

		for(i=1; i<=max_edges; i++)
		{
			System.out.println("Enter edge (-1 -1) to quit : ");
			origin = sc.nextInt();
			destin = sc.nextInt();
			if((origin==-1) && (destin==-1))
				break;
			if(origin>=n || destin>=n || origin<0 || destin<0)
			{
				System.out.println("Invalid edge!\n");
				i--;
			}
			else
				adj[origin][destin] = 1;
			   // adj[destin][origin] = 1;    in case undirected graph 
		}/*End of for*/
		//sc.close();
	}/*End of create_graph()*/
	
	public void insert_edge(int origin,int destin)
	{
		if(origin<0 || origin>=n)
		{
			System.out.print("Origin vertex does not exist\n");
			return;
		}
		if(destin<0 || destin>=n)
		{
			System.out.print("Destination vertex does not exist\n");
			return;
		}
		adj[origin][destin] = 1;
	}/*End of insert_edge()*/
	
	public void del_edge(int origin, int destin)
	{
	     if(origin<0 || origin>=n || destin<0 || destin>=n || adj[origin][destin]==0)
	     {
			System.out.print("This edge does not exist\n");
			return;
	     }
	     adj[origin][destin] = 0;
	}/*End of del_edge()*/
	
	
	public void display()
	{
		int i,j;
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
				System.out.print("   "+adj[i][j]);
			System.out.print("\n");
		}
	}/*End of display()*/
	
	
}
public class GraphDemo {

	public static void main(String[] args) {
		int choice,origin,destin;
		myGraph g=new myGraph(5);
		g.create_graph();
		Scanner sc=new Scanner(System.in);
		
		{
			System.out.print("1.Insert an edge\n");
			System.out.print("2.Delete an edge\n");
			System.out.print("3.Display\n");
			System.out.print("4.Exit\n");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch(choice)
			{
			 case 1:
				System.out.print("Enter an edge to be inserted : ");
				origin = sc.nextInt();
				destin = sc.nextInt();
				g.insert_edge(origin,destin);
				break;
			 case 2:
				System.out.print("Enter an edge to be deleted : ");
				origin = sc.nextInt();
				destin = sc.nextInt();
				g.del_edge(origin,destin);
				break;
			 case 3:
				g.display();
				break;
			 case 4:
				break;
			 default:
				System.out.print("Wrong choice\n");
				break;
			 }/*End of switch*/
		}while(choice!=4);/*End of while*/
        sc.close();
	}

}
