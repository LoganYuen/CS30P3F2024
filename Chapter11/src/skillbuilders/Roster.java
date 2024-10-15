package skillbuilders;

import java.io.*;
import java.util.Scanner;

public class Roster {
	public static void main(String[] args) {
		//Declaration area
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		String fileName, fName, lName;
		int studentNum;
		
		
		
		Scanner input = new Scanner(System.in);
		
		//Ask user for the name of the file and the number of students
		System.out.println("Please enter the file name for storing student names: ");
		fileName = input.nextLine();
		
		System.out.println("Please enter the number of students in the class: ");
		studentNum = input.nextInt();
	
		
		
		dataFile = new File(fileName);
		try
		{
			//Write
			FileOutputStream out = new FileOutputStream(dataFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			for (int i = 1; i < studentNum + 1; i++)
			{
				//Ask user for first and last name of students
				System.out.println("Please enter student number " + i + "'s first name: ");
				fName = input.next();
				
				System.out.println("Please enter student number " + i + "'s last name: ");
				lName = input.next();
				
				writeStu.writeObject(new StuName(fName, lName));
			}
			writeStu.close();
			System.out.println("Data written to file.");
	
			 
			
			//Read
			FileInputStream in = new FileInputStream(dataFile);
			ObjectInputStream readStu = new ObjectInputStream(in);
			for (int i = 1; i < studentNum + 1; i++)
			{
				System.out.println("Student " + i + ": " + (StuName)readStu.readObject());
			}
			readStu.close();
		}
		
		
		
		//Catches:
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
		{
			System.out.println("Problem with input/output");
			System.err.println("IOException: " + e.getMessage());
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class does not exist or could not be found.");
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		
	}
}
