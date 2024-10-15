package Masteries;
/*
Program: WordCount.java          Date: October 15, 2024

Purpose:  Create a WordCount application that displays the number of words and the average word length in a text file named source.txt

Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


import java.io.*;

public class WordCount {
	public static void main(String[] args) {
		//Declaration area
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		int avgLength, numWords;
	

		
		try
		{
			dataFile = new File("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter11\\src\\Masteries\\source.txt");
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			
			while ((readFile.read()) != null) 
			{ 
			System.out.println((char) readFile.read());
			}
		}
		
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
		
	}
}
/* Screen Dump
Test Case 1:



Test Case 2:
 
*/