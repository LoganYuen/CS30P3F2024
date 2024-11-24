package LinkedList;
/*
Program: LinkedList.java          Date: November 25, 2024


Purpose: Modify the LinkedList class to include functions size(), addAtEnd() and makeEmpty().


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
	public void addAtFront(String str) 
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	
	//Adds a node to the end of the linked list.
	public void addAtEnd(String str)
	{
		Node current = head;
		Node newNode = new Node(str);
		
		while (current.getNext() != null) 
		{
			current = current.getNext();
		}
		current.setNext(newNode);
	}
	
	

	//Deletes a node in the linked list.
	public void remove(String str) 
	{
		Node current = head;
		Node previous = head;
	
	
		if (current.getData().equals(str)) 
		{
			head = current.getNext();
		} 
		
		else 
		{
			while (current.getNext() != null) 
			{
				previous = current;
				current = current.getNext();
				
				
				if (current.getData().equals(str)) 
				{
					previous.setNext(current.getNext());
				}
			}
		}
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
}
