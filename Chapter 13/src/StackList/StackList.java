package StackList;
/*
Program: Stack2.java          Date: November 18, 2024


Purpose: Create a StackList class that implements a linked list that stores Objects.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class StackList 
{
	//create linked list and top variable
	private LinkedList data;

	
	
	//Constructor
	public StackList()
	{
		data = new LinkedList();
	}
	
	
	
	//return data from the top
	public Object top()
	{
		return (data.getHead());
	}
	
	
	//remove and return the data from the top
	public Object pop()
	{
		return (data.remove());
	}
	
	
	//add new data to the top 
	public void push(Object item)
	{
		data.addAtFront(item);
	}
	
	
	//Check if the stack is empty
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
	
	
	//Make the stack empty
	public void makeEmpty()
	{
		data.makeEmpty();
	}
	
	
	//Check the size of the stack
	public int size()
	{
		return (data.size());
	}
	
}