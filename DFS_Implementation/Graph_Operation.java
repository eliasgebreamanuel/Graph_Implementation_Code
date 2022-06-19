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
import java.util.Scanner;
public class Graph_Operation {
     int MAX_NODE = 50;
Node adj[]  =new Node [MAX_NODE];
int totNodes;
int top=-1;
int stack[]=new int [MAX_NODE];
public void push(int item)
{
top=top+1;
stack[top]=item;
}
public int pop()
{
int deldata=stack[top];
top=top-1;
return(deldata);
}
public int is_stk_empty()
{
if(top==-1)
return(1);
else
return(0);
}
//stack Node
public void createGraph()
{
Node newl,last;
int neighbours,neighbour_value;
System.out.println("Graph Creation");
System.out.println("Ente the total nodes int the graph");
Scanner input = new Scanner(System.in);
 totNodes = input.nextInt();
 
 
 Queue q = new Queue(totNodes);

 
for(int i=1; i<=totNodes; i++)
{
last=null;
System.out.println("Enter no. of nodes in the adjacency list of node");
neighbours = input.nextInt();
for(int j=1; j<=neighbours; j++)
{
    System.out.println("Enter neighbour"+j);
    neighbour_value = input.nextInt();
    newl=new Node();
    newl.vertex = neighbour_value;
    newl.next = null;
    if(adj[i]==null)
adj[i]=last=newl;
else
        {
last.next = newl;
last = newl;
}
}
}}
public void DFS_travers(){
    Scanner input = new Scanner(System.in);
Node tmp;
int N, v, start_node;
int status [] = new int [MAX_NODE];
final int ready=1, wait=2, processed=3; 
System.out.println("Enter starting node : ");
start_node = input.nextInt();
for(int i=1; i <= totNodes; i++)
status[i] = ready;
push(start_node);
status[start_node]=wait; 
while(is_stk_empty()!=1){

N = pop();
status[N]=processed; 
System.out.println(" "+N);

tmp = adj[N]; 
while(tmp!=null)
    {
v = tmp.vertex;
if(status[v]==ready)
    {
push(v); 
status[v]=wait; 
}
tmp=tmp.next;
}}
}

}