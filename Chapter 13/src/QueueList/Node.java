package QueueList;
/*
Program: Node.java          Date: December 3, 2024


Purpose: Used for implementation in a linked list.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Node 
{
	private Object data;
	private Node next;

	
	//constructor
	public Node(Object newData) 
	{
		data = newData;
		next = null;
	}
	
	
	//The node pointed to by next is returned
	public Node getNext() 
	{
		return(next);
	}
	
	
	//The node pointed to by next is changed to newNode
	public void setNext(Node newNode) 
	{
		next = newNode;
	}
	
	
	//The node pointed to by next is returned
	public Object getData() 
	{
		return(data);
	}
}
