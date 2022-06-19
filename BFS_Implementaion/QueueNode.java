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
public class QueueNode {
    Node vertex;
    QueueNode next;
    public QueueNode(Node vertex,QueueNode next){
    this.vertex = vertex;
    this.next = next;
    }
    public QueueNode(Node vertex){
    this(vertex,null);
    }
}
