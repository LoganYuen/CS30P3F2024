package StackList;
/*
Program: LinkedList.java          Date: November 28, 2024


Purpose: Modify the LinkedList class to work for stack implementation.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class LinkedList 
{
	private Node head;
	
	
	//constructor
	public LinkedList() 
	{
		head = null;
	}
	
	
	

	//Adds a node to the linked list.
	public void addAtFront(Object obj) 
	{
		Node newNode = new Node(obj);
		newNode.setNext(head);
		head = newNode;
	}
	
	

	

	//Deletes the first node in the linked list.
	public Object remove() 
	{
		Node current = head;
		head = head.getNext();
		return (current.getData());
	}
	
	
	
	
	//Counts every item in the linked list
	public int size()
	{
		Node current = head;
		int listItems = 0;
		
		if (current != null)
		{
			listItems += 1;
			while (current.getNext() != null) 
			{
				listItems += 1;
				current = current.getNext();
			}
		}
		
		return listItems;
	}
	

	//Creates a string that lists the nodes of the linked list.
	public String toString() 
	{
		Node current = head;
		String listString;
		
		
		if (current != null) 
		{
			listString = current.getData() + "\n";
			
			
			while (current.getNext() != null) 
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		} 
		
		
		else 
		{
			return("There are no items in list.");
		}
	}
	
	
	
	
	//Empty the linked list
	public void makeEmpty()
	{
		head = null;
	}
	
	public Object getHead()
	{
		return (head.getData());
	}
}
