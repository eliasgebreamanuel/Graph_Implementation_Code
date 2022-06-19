/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs_graph;

/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Graph_Operation a = new Graph_Operation();
        System.out.println("Breadth First Searc Traversal");
        a.createGraph();
        System.out.println("BFS traversal as under");
        a.BFS_travesal();
    }
    
}
