package QueueList;
/*
Program: QueueList.java          Date: December 3, 2024


Purpose: Create a QueueList application that implements a linked list that can store Object data.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class QueueList 
{
	//Create array and variables for size, rear and front
	LinkedList data;
	
	
	//Constructor
	public QueueList()
	{
		data = new LinkedList();
	}
	
	
	
	//Remove item from the front
	public Object dequeue()
	{
		return (data.remove());
	}
	
	
	//Add item to the rear
	public void enqueue(Object item)
	{
		data.addAtEnd(item);
	}
	
	
	//Retrieve item from the front
	public Object front()
	{
		return(data.front());
	}
	
	
	//Check if the queue is empty
	public boolean isEmpty()
	{
		if (data.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//Check the size of the queue
	public int size()
	{
		return (data.size());
	}
	
	
	//Empty the queue
	public void makeEmpty()
	{
		data.makeEmpty();
	}
}
