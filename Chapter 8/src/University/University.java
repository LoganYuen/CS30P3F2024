package University;

import java.util.Scanner;

import PressMark.Employee;

public class University {
	
	public static void main(String[] args) 
	{
		Staff staffMem = new Staff("Bob", "Kid", 60000, "Sec");
		Faculty facultyMem = new Faculty("Jack", "brown", 100000, "Professer");
		Employee emp;
		String choice;
		int empNum;
		double payArg;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter your employee number: ");
		empNum = input.nextInt();
		
		switch(empNum)
		{
		case 1: emp = staffMem;
		case 2:
		}
		
	}
}
