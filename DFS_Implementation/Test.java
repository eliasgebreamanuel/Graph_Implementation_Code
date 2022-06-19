/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs_graph;

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
            Graph_Operation b = new Graph_Operation();
        System.out.println("Depth First Search Traversal");
       b.createGraph();
        System.out.println("DFS traversal as under");
      b.DFS_travers();   
    }
    
}
