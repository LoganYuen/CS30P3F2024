package Rectangle;
/*
Program: testRectangle.java          Date: November 4, 2024
Purpose: Test the rectangle class using a testRectangle class.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/
public class TestRectangle
{
	public static void main(String[] args)
	{
		//test overloaded constructors
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3, 4);
		
		
		//Test toString
		System.out.println("Rectangle 1: "+ rect1);
		System.out.println("Rectangle 2: " + rect2 + "\n");
		
		
		//Test modifier methods
		rect1.setLength(6);
		rect2.setWidth(5);
		
		
		//Test accessor methods
		System.out.println("New length of rectangle 1 is: " + rect1.getLength());
		System.out.println("New width of rectangle 2 is: " + rect1.getWidth() + "\n");
		
		
		//Test area formula method
		rect1.displayAreaFormula();
		
		//Test area and perimeter methods
		System.out.println("\nThe area of rectangle 1 is: " + rect1.area() + " and the perimeter is: " + rect1.perimeter());
		System.out.println("The area of rectangle 2 is: " + rect2.area() + " and the perimeter is: " + rect2.perimeter() + "\n");
		
		
		
		
		//Test equals and compareTo methods
		System.out.println("It is " + rect1.equals(rect2) + " that rectangle 1 and 2 are equal.");
		if(rect1.compareTo(rect2) == 0)
		{
			System.out.println("Both rectangles are the same.");
		}
		else
		{
			System.out.println("Both rectangles have different lengths and/or widths.");
		}
		
		
		
		//Test compareToArea method
		if(rect1.compareToArea(rect2) == 0)
		{
			System.out.println("Both rectangles have the same area." + "\n");
		}
		else if(rect1.compareToArea(rect2) == -1)
		{
			System.out.println("Rectangle 1 has a smaller area than rectangle 2." + "\n");
		}
		else
		{
			System.out.println("Rectangle 1 has a larger area than rectangle 2." + "\n");
		}
	
	
		
		
		
		//Make rectangle 1 equal to rectangle 2
		rect1.setLength(3);
		rect1.setWidth(5);
		
		//Test equals and compareTo methods again
		System.out.println("It is " + rect1.equals(rect2) + " that rectangle 1 and 2 are equal.");
		if(rect1.compareTo(rect2) == 0)
		{
			System.out.println("Both rectangles are the same.");
		}
		else
		{
			System.out.println("Both rectangles have different lengths and/or widths.");
		}
		
		
		
		//Test compareToArea method again
		if(rect1.compareToArea(rect2) == 0)
		{
			System.out.println("Both rectangles have the same area.");
		}
		else if(rect1.compareToArea(rect2) == -1)
		{
			System.out.println("Rectangle 1 has a smaller area than rectangle 2.");
		}
		else
		{
			System.out.println("Rectangle 1 has a larger area than rectangle 2.");
		}
	}
}
/* Screen Dump
Test Case:
Rectangle 1: The length of this rectangle is 4.0 the width of this rectangle is 2.0
Rectangle 2: The length of this rectangle is 3.0 the width of this rectangle is 4.0
New length of rectangle 1 is: 6.0
New width of rectangle 2 is: 2.0
The formula for the area of a rectangle is: length * width.
The area of rectangle 1 is: 12.0 and the perimeter is: 16.0
The area of rectangle 2 is: 15.0 and the perimeter is: 16.0
It is false that rectangle 1 and 2 are equal.
Both rectangles have different lengths and/or widths.
Rectangle 1 has a smaller area than rectangle 2.
It is true that rectangle 1 and 2 are equal.
Both rectangles are the same.
Both rectangles have the same area.
*/
