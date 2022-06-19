/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adjmatrixgraph;

/**
 *
 * @author HP
 */
public class AdjacencyMatrix {
   private int V; 
	private int E; 
	private int[][] adjMatrix;
	
	public AdjacencyMatrix(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; 
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	} 
}
