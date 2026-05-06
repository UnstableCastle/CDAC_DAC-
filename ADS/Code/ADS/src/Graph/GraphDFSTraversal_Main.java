package Graph;

import java.util.Scanner;

// Helper Stack class for DFS
class intStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public intStack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        if (top < maxSize - 1) {
            stackArray[++top] = j;
        }
    }

    public int pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class myGraphforDFS {
    int adj[][];
    int n;
    int state[];

    public myGraphforDFS(int d) {
        n = d;
        adj = new int[n][n];
        state = new int[n];
        for (int i = 0; i < n; i++)
            state[i] = 0; // 0: Initial, 1: Visited
    }

    public void create_graph() {
        int i, max_edges, origin, destin;
        Scanner sc = new Scanner(System.in);
        max_edges = n * (n - 1);

        for (i = 1; i <= max_edges; i++) {
            System.out.println("Enter edge (origin destin) or -1 -1 to quit: ");
            origin = sc.nextInt();
            destin = sc.nextInt();
            if ((origin == -1) && (destin == -1))
                break;
            if (origin >= n || destin >= n || origin < 0 || destin < 0) {
                System.out.println("Invalid edge!");
                i--;
            } else
                adj[origin][destin] = 1;
        }
    }

    public void insert_edge(int origin, int destin) {
        if (origin < 0 || origin >= n || destin < 0 || destin >= n) {
            System.out.println("Vertex out of bounds");
            return;
        }
        adj[origin][destin] = 1;
    }

    public void display() {
        System.out.print("   ");
        for (int i = 0; i < n; i++) System.out.print(i + "  ");
        System.out.println("\n------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void DF_Traversal(int v) {
        intStack st = new intStack(50);
        st.push(v);

        System.out.print("DFS Traversal: ");
        while (!st.isEmpty()) {
            v = st.pop();

            if (state[v] == 0) {
                System.out.print(v + " ");
                state[v] = 1;
            }

            // Push neighbors in reverse order so the lowest index is popped first
            for (int i = n - 1; i >= 0; i--) {
                if (adj[v][i] == 1 && state[i] == 0) {
                    st.push(i);
                }
            }
        }
        System.out.println();
    }
}

public class GraphDFSTraversal_Main {
    public static void main(String[] args) {
        // Reduced size to 10 for the given edges (highest node is 9)
        myGraphforDFS g = new myGraphforDFS(10);
        
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
        System.out.println("\nAdjacency Matrix:");
        g.display();
    }
}