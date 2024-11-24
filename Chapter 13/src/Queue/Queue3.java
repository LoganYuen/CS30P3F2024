package Queue;
/*
Program: Queue3.java          Date: November 22, 2024


Purpose: Create a Queue3 class that implements a queue data structure for Objects using an ArrayList.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

import java.util.ArrayList;


public class Queue3 
{
	//Create array
	ArrayList<Object> data;
	
	
	//Constructor
	public Queue3()
	{
		data = new ArrayList<Object>();
	}
	
	
	
	//Remove item from the front
	public Object dequeue()
	{
		Object oldFront = data.getFirst();
		data.removeFirst();
		return oldFront;
	}
	
	
	//Add item to the rear
	public void enqueue(Object item)
	{
		data.addLast(item);
	}
	
	
	//Retrieve item from the front
	public Object front()
	{
		return(data.getFirst());
	}
	
	
	//Check if the queue is empty
	public boolean isEmpty()
	{
		return data.isEmpty();
	}
	
	
	//Check the size of the queue
	public int size()
	{
		return (data.size());
	}
	
	
	//Empty the queue
	public void makeEmpty()
	{
		data.clear();
	}
	
}