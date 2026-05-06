package for_DSA;

import java.util.Scanner;

class myGraphforDFS{
	int adj[][];
	int n; 
	int state[];
	public myGraphforDFS(int d)
	{
        n = d;
		adj = new int[n][n];
		state = new int[n];
		for(int i=0;i<n;i++)
			state[i]=0;
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
		System.out.print(" ");
		for(i=0; i<n; i++)
		   System.out.print("   "+i);
		System.out.println();
		for(i=0; i<n; i++)
		{
			System.out.print(i);
			for(j=0; j<n; j++)
				System.out.print("   "+adj[i][j]);
			System.out.print("\n");
		}
	}/*End of display()*/
	public void DF_Traversal(int v)
	{
		intStack st = new intStack(50);
		int i;
		st.push(v);
		while(!st.isEmpty())
		{
			v = st.pop();
			if(state[v]==0)
			{
				System.out.print("  "+v);
				state[v]=1;
			}
			for(i=n-1; i>=0; i--)
			{
				if(adj[v][i]==1 && state[i]==0)
					st.push(i);
			}
		}
	}
	
}
public class GraphDFSTraversal_Main {

	public static void main(String[] args) {
		myGraphforDFS g=new myGraphforDFS(12);
		//g.create_graph();
		g.insert_edge(0, 1);
		g.insert_edge(0, 3);
		g.insert_edge(1, 2);
		g.insert_edge(1, 5);
		g.insert_edge(1, 4);
		g.insert_edge(2, 3);
		g.insert_edge(2, 5);
		g.insert_edge(3, 6);
		g.insert_edge(4, 7);
		g.insert_edge(5, 7);
		g.insert_edge(5, 6);
		g.insert_edge(5, 8);
		g.insert_edge(6, 9);
		g.insert_edge(8, 9);
		g.insert_edge(7, 8);
		
        g.DF_Traversal(0);
        System.out.println();
        g.display();
	}

}
