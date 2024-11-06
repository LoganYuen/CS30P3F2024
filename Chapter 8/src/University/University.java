package University;

import java.text.NumberFormat;

/*
Program: University.java          Date: November 4, 2024
Purpose: To test the UEmployee, Staff, and Faculty classes.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

import java.util.Scanner;


public class University 
{
	
	public static void main(String[] args) 
	{
		//Declaration/Initialization area
		Staff staffMem = new Staff("Bob", "Kid", 60000, "secretary");
		Faculty facultyMem = new Faculty("Jack", "brown", 100000, "Professer");
		int choice;
		int empNum;
		UEmployee emp;
		
		
		
		//Get an employee number from the user to access/edit
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the employee's number: ");
		empNum = input.nextInt();
		
		
		//Check employee number and display their name
		switch(empNum)
		{
		case 1: 
			emp = staffMem;
		break;
		case 2: 
			emp = facultyMem;
		break;
		default:
			System.out.println("Defaulting to employee 1.\n");
			emp = staffMem;
		}
		System.out.println("You are now accessing " + emp.getFName() + " " + emp.getLName() + "'s data.\n"); 
		
		
		//Loop menu and actions associated with the menu
		do
		{
			//Menu
			System.out.println("What would you like to do?\n"
					+ "1. View employee's salary.\n"
					+ "2. View employee's job/department.\n"
					+ "3. Edit employee's name.\n"
					+ "4. Edit employee's salary.\n"
					+ "5. Edit employee's job/department.\n"
					+ "6. See general overview.\n"
					+ "7. Quit.");
			
			choice = input.nextInt();
			
			
			
			
			//Process user's choice
			
			switch(choice)
			{
				//Display salary
				case 1: 
					System.out.println("Their salary is: " + emp.getSalary() + "\n");
					break;
					
					
					
					
					
				//Display job title/department
				case 2: 
					if (empNum == 1)
					{
						System.out.println("The job they have is: " + staffMem.getJobTitle() + ".\n");
					}
					else
					{
						System.out.println("The department they're in is: " + facultyMem.getDepartment() + ".\n");
					}
					break;
					
					
					
					
					
				//Edit name
				case 3: 
					System.out.println("Would you like to change the first name(1) or last name(2)?");
					int nameType = input.nextInt();
					
					System.out.println("What is the new name?");
					input.nextLine();
					String name = input.nextLine();
					
					
					
					if (nameType == 1 && empNum == 1)
					{
						staffMem.setFName(name);
					}
					else if (nameType == 2 && empNum == 1)
					{
						staffMem.setLName(name);
					}
					else if (nameType == 1 && empNum == 2)
					{
						facultyMem.setFName(name);
					}
					else
					{
						facultyMem.setLName(name);
					}
					break;
					
					
					
					
					
				//Edit salary
				case 4: 
					System.out.println("What is the new salary?");
					double salary = input.nextDouble();
					
					
					if (empNum == 1)
					{
						staffMem.setSalary(salary);
						emp = staffMem;
					}
					else
					{
						facultyMem.setSalary(salary);
						emp = facultyMem;
					}
					break;
					
				
					
					
					
				//Edit job/department
				case 5: 
					System.out.println("What is the new job/department?");
					input.nextLine();
					String JobOrDepartment = input.nextLine();
					
					
					
					if (empNum == 1)
					{
						staffMem.setJobTitle(JobOrDepartment);
						emp = staffMem;
					}
					else
					{
						facultyMem.setDepartment(JobOrDepartment);
						emp = facultyMem;
					}
					break;
					
					
					
					
					
				//Display general info
				case 6: 
					System.out.println(emp + ".\n");
					break;
					
					
					
					
					
				//End message
				case 7: 
					System.out.println("This program will now terminate.");
					break;
					
					
					
					
				default: 
					System.out.println("This is not a valid option.\n");
			}
			
			
		} while(choice != 7);
	}
}
/* Screen Dump
Test Case 1:
Please enter the employee's number: 
1
You are now accessing Bob Kid's data.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
1
Their salary is: $60,000.00

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
2
The job they have is: secretary.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
3
Would you like to change the first name(1) or last name(2)?
1
What is the new name?
john
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
4
What is the new salary?
70000
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
5
What is the new job/department?
janitor
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
3
Would you like to change the first name(1) or last name(2)?
2
What is the new name?
Doe
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
6
Employee john Doe's salary is: $70,000.00 and the job they have is: janitor.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
7
This program will now terminate.







Test Case 2:
Please enter the employee's number: 
2
You are now accessing Jack brown's data.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
1
Their salary is: $100,000.00

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
2
The department they're in is: Professer.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
4
What is the new salary?
120000
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
5
What is the new job/department?
Pro+
What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
6
Employee Jack brown's salary is: $120,000.00 and the department they're in is: Pro+.

What would you like to do?
1. View employee's salary.
2. View employee's job/department.
3. Edit employee's name.
4. Edit employee's salary.
5. Edit employee's job/department.
6. See general overview.
7. Quit.
7
This program will now terminate.

*/

