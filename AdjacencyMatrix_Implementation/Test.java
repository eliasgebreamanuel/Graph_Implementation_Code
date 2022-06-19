/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adjmatrixgraph;

/**
 *
 * @author HP
 */

public class Test {
	

	public static void main(String[] args) {
		AdjacencyMatrix g = new AdjacencyMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
	}
}