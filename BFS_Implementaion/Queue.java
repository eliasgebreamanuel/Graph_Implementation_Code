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
public class Queue {
    QueueNode top,bottom;
    private int size;
    private int items = 0;
    
    public Queue(){
    }
    public Queue(int size){
    this.size = size;
        this.top =  this.bottom= null;

    }
    public boolean isEmpty(){
    return this.top ==  null;
    }
    public boolean isFull(){
    return this.items == this.size;
    }
    public int itemsCount(){
    return this.items;
    }
  public boolean enquue(Node item){

      QueueNode node = new QueueNode(item);
      if(this.isEmpty()){
      this.top = this.bottom = node;
      }
      else{
      this.bottom.next = node;
      this.bottom= node;
      }
      this.items++;
      
  return true;
  }
  public boolean dequeue(){
  
  if(!this.isEmpty())
      this.top = this.top.next;
  this.items--;
  return true;
      }
  public int topElement(){
  if(!this.isEmpty())
      return this.top.vertex.vertex;
  return -1;
  }
  
  public void display(){
      if(!this.isEmpty()){
  QueueNode temp = this.top;
  while(temp!=null){
  System.out.println(temp.vertex);
  temp= temp.next;
  }
      }
      else{
      System.out.println("There is no data in the queue");
      }
  }
  }

