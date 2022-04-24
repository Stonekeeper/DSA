import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;

public class GraphLL {
    
    int V;
    int E;
    LinkedList<Integer>[] adj;

    GraphLL(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        for(int v = 0 ; v < V;v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The graph contains "+V + " Vetrices and "+E+ " Edges\n");
        for(int v = 0 ; v < V ;v++){
            sb.append(v + " : ");
            for(int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.offer(s);
        System.out.println("The BFS for the above graph is");
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");

            for(int e : adj[u]){
                if(!visited[e]){
                    visited[e] = true;
                    q.offer(e);
                }
            }
        }

    }

    public void dfs(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        st.push(s);
        System.out.println("The DFS for the above graph is");
        while(!st.isEmpty()){
            int u = st.pop();
            if( !visited[u]){
                visited[u] = true;
                System.out.print(u + " ");

                for(int v : adj[u]){
                    if(!visited[v]){
                        st.push(v);
                    }
                }
            }
        }
    }

    public void rdfs(int s){
        
    }
    public static void main(String[] args) {
        GraphLL g = new GraphLL(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.print(g);
        g.bfs(0);
        g.dfs(0);
    }
}
