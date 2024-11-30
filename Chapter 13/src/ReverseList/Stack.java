package ReverseList;
/*
Program: Stack.java          Date: December 2, 2024


Purpose: Create a stack that will be implemented in ReverseList.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Stack 
{
	//create data array and top variable
	private int[] data;
	private int top;
	
	
	//Constructor
	public Stack(int maxItems)
	{
		data = new int[maxItems];
		top = -1;
	}
	
	
	
	//return data from the top
	public int top()
	{
		return (data[top]);
	}
	
	
	//remove and return the data from the top
	public int pop()
	{
		top -= 1;
		return (data[top + 1]);
	}
	
	
	//add new data to the top 
	public void push(int num)
	{
		if (top < data.length - 1)
		{
			top += 1;
			data[top] = num;
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
