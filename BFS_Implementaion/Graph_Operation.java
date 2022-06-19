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
import java.util.Scanner;
public class Graph_Operation {
     int MAX_NODE = 50;
Node adj[]  =new Node [MAX_NODE];
int totNodes;

int top=-1;

int queue[] = new int[MAX_NODE],f=-1,r=-1;
public void q_insert(int item){

r = r + 1;
queue[r] = item;
if(f==-1)
    f=0;
}
public int q_delete(){
int delitem=queue[f];

if(f==r)

f=r=-1;

else f=f+1;

return delitem;
}
public int is_q_empty()

{

if(f==-1)

return 1;

else

return 0;

}
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

public void BFS_travesal(){
Node tmp;
int N, v, start_node;
int status[]=new int [MAX_NODE];
final int white=1, gray=2, black=3; 
System.out.println("Enter starting node : ");
Scanner input = new Scanner(System.in);
start_node = input.nextInt();

for(int i=1; i <= totNodes; i++)
status[i] = white;
q_insert(start_node); 
status[start_node] = gray; 

while(is_q_empty() != 1)
{

N = q_delete(); 
status[N] = black; 
System.out.println(" "+N);

tmp = adj[N];
while(tmp != null)
{
    v = tmp.vertex;
    if(status[v] == white)
{

q_insert(v); 
status[v] = gray; 
}
    tmp = tmp.next;
}
}
}
}
