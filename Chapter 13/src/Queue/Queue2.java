package Queue;
/*
Program: Queue2.java          Date: November 21, 2024


Purpose: Create a Queue2 class that implements a queue data structure for Objects.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Queue2 
{
	//Create array and variables for size, rear and front
	Object[] data;
	int rear, front, maxSize;
	
	
	//Constructor
	public Queue2(int maxItems)
	{
		data = new Object[maxItems];
		rear = -1;
		front = -1;
		maxSize = maxItems;
	}
	
	
	
	//Remove item from the front
	public Object dequeue()
	{
		Object oldFront = data[front];
		if (front == rear)
		{
			makeEmpty();
		}
		else
		{
			front = (front + 1) % maxSize;
		}
		return (oldFront);
	}
	
	
	//Add item to the rear
	public void enqueue(Object item)
	{
		if (isEmpty())
		{
			rear = 0;
			front = 0;
			data[rear] = item;
		}
		else
		{
			rear = (rear + 1) % maxSize;
			data[rear] = item;
		}
	}
	
	
	//Retrieve item from the front
	public Object front()
	{
		return(data[front]);
	}
	
	
	//Check if the queue is empty
	public boolean isEmpty()
	{
		if (rear == -1 && front == -1)
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
		if (isEmpty())
		{
			return 0;
		}
		else
		{
			if (front > rear)
			{
				return ((maxSize - front + 1) + rear);
			}
			else
			{
				return (rear - front + 1);
			}
			
		}
	}
	
	
	//Empty the queue
	public void makeEmpty()
	{
		rear = -1;
		front = -1;
	}
	
}