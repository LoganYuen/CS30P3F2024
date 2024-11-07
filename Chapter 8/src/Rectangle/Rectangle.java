package Rectangle;


public class Rectangle implements Comparable, ComparableArea
{
	//Declaration area
	private double length, width;
	
	
	
	//Overloaded constructor
	public Rectangle()
	{
		length = 4;
		width = 2;
	}
	
	//Overloaded constructor
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	
	
	
	//Modifier methods
	public void setLength(double l)
	{
		length = l;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	
	//Accessor methods
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	
	
	
	//Calculate and return area
	public double area()
	{
		double area = length * width;
		
		return area;
	}
	
	//Calculate and return perimeter
	public double perimeter()
	{
		double perimeter = (2 * length) + (2 * width);
		
		return perimeter;
	}
	
	
	
	
	//Print area formula
	public void displayAreaFormula()
	{
		System.out.println("The formula for the area of a rectangle is: length * width.");
	}
	
	
	
	
	//compare two rectangles
	public boolean equals(Object obj)
	{
		Rectangle testObj = (Rectangle)obj;
		
		if(testObj.getLength() == length && testObj.getWidth() == width)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	
	
	//Return object as string
	public String toString()
	{
		String rec = "The length of this rectangle is " + length + " the width of this rectangle is " + width;
		
		return rec;
	}
	
	
	
	
	//compare two rectangles' length and width
	public int compareTo(Object r)
	{
		Rectangle testRectangle = (Rectangle) r;
		
		if (length == testRectangle.getLength() && width == testRectangle.getWidth())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	
	//compare two rectangles area
	public int compareToArea(Object r)
	{
		Rectangle testRectangle = (Rectangle) r;
		
		if (area() == testRectangle.area())
		{
			return 0;
		}
		else if (area() < testRectangle.area())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
