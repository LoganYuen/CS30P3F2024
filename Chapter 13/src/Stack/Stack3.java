package Stack;
/*
Program: Stack2.java          Date: November 18, 2024


Purpose: Create a Stack2 class that implements a stack data structure for Objects using an ArrayList.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


import java.util.ArrayList;

public class Stack3 
{
	//create data array and top variable
	private ArrayList<Object> data;
	private int top;
	
	
	//constructor
	public Stack3()
	{
		data = new ArrayList<Object>();
		top = -1;
	}
	
	
	
	//return data from the top
	public Object top()
	{
		return (data.get(top));
	}
	
	
	//remove and return the data from the top
	public Object pop()
	{
		Object topObj = data.get(top);
		
		data.remove(top);
		top -= 1;
		
		return (topObj);
	}
	
	
	//add new data to the top 
	public void push(Object item)
	{
		top += 1;
		data.add(top, item);	
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