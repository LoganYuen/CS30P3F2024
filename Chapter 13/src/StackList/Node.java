package StackList;
/*
Program: Node.java          Date: November 28, 2024


Purpose: Used for implementation in a linked list.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


class Node 
{
	//Store Object data and the next node in the list.
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