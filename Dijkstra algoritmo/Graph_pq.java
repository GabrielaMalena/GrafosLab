package Dijkstra;

import java.util.*; 
class Graph_pq { 
    int dist[]; 
    Set<Integer> visited; 
    PriorityQueue<Node> pqueue;  
    List<List<Node> > adj_list;
	private int V; 
    
    public Graph_pq(int V) { 
        this.V = V; 
        dist = new int[V]; 
        visited = new HashSet<Integer>(); 
        pqueue = new PriorityQueue<Node>(V, new Node()); 
    } 
   
   
    public void algo_dijkstra(List<List<Node> > adj_list, int src_vertex) 
    { 
        this.adj_list = adj_list; 
   
        for (int i = 0; i < V; i++) 
            dist[i] = Integer.MAX_VALUE; 
        pqueue.add(new Node(src_vertex, 0)); 
        dist[src_vertex] = 0; 
        while (visited.size() != V) { 
 
            int u = pqueue.remove().node; 
            visited.add(u); 
            graph_adjacentNodes(u); 
        } 
    } 

    
    private void graph_adjacentNodes(int u)   { 
        int edgeDistance = -1; 
        int newDistance = -1; 
   
      
        for (int i = 0; i < adj_list.get(u).size(); i++) { 
            Node v = adj_list.get(u).get(i); 
   
            
            if (!visited.contains(v.node)) { 
                edgeDistance = v.cost; 
                newDistance = dist[u] + edgeDistance; 
   
                
                if (newDistance < dist[v.node]) 
                    dist[v.node] = newDistance; 
   
               
                pqueue.add(new Node(v.node, dist[v.node])); 
            } 
        } 
    } 
}