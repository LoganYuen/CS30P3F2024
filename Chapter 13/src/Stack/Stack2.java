package Stack;
/*
Program: Stack2.java          Date: November 18, 2024


Purpose: Create a Stack2 class that implements a stack data structure for Objects.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Stack2 
{
	//create data array and top variable
	private Object[] data;
	private int top;
	
	
	//Constructor
	public Stack2(int maxItems)
	{
		data = new Object[maxItems];
		top = -1;
	}
	
	
	
	//return data from the top
	public Object top()
	{
		return (data[top]);
	}
	
	
	//remove and return the data from the top
	public Object pop()
	{
		top -= 1;
		return (data[top + 1]);
	}
	
	
	//add new data to the top 
	public void push(Object item)
	{
		if (top < data.length - 1)
		{
			top += 1;
			data[top] = item;
		}
	}
	
	
	//Check if the stack is empty
	public boolean isEmpty()
	{
		if (top == -1)
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
		top = -1;
	}
	
	
	//Check the size of the stack
	public int size()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return (top + 1);
		}
	}
	
}