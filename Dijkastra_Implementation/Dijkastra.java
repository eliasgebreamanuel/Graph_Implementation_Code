/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstraexamplee;

/**
 *
 * @author HP
 */
import java.util.*;  
import java.io.*;  
import java.lang.*;  
  
public class Dijkastra {
  
static final int totalVertex = 9;  
int minimumDistance(int distance[], Boolean spSet[])  
{  
int m = Integer.MAX_VALUE, m_index = -1;  
  
for (int vx = 0; vx < totalVertex; vx++)  
{  
if (spSet[vx] == false && distance[vx] <= m)   
{  
m = distance[vx];  
m_index = vx;  
}  
}  
return m_index;  
  
}  
  
void printSolution(int distance[], int n)  
{  
System.out.println("The shortest Distance from source 0th node to all other nodes are: ");  
for (int j = 0; j < n; j++)  
System.out.println("To " + j + " the shortest distance is: " + distance[j]);  
}  
    
void dijkstra(int graph[][], int s)  
{  
int distance[] = new int[totalVertex]; 
  
Boolean spSet[] = new Boolean[totalVertex];  
  

for (int j = 0; j < totalVertex; j++)   
{  
distance[j] = Integer.MAX_VALUE;  
spSet[j] = false;  
}  
  
distance[s] = 0;  
  
for (int cnt = 0; cnt < totalVertex - 1; cnt++)   
{  
  
int ux = minimumDistance(distance, spSet);  
  

spSet[ux] = true;  
  
 
for (int vx = 0; vx < totalVertex; vx++)  
  
 
if (!spSet[vx] && graph[ux][vx] != -1 && distance[ux] != Integer.MAX_VALUE && distance[ux] + graph[ux][vx] < distance[vx])  
{  
distance[vx] = distance[ux] + graph[ux][vx];  
}  
}  
  
printSolution(distance, totalVertex);  
}  
  
}
