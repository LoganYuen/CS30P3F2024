package skillbuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class StatsP2 {
	public static void main(String[] args) {
		
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		String StuName, Score, fileName;
		int numStu;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		
		//Write data to file
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name for storing names and grades: ");
		fileName = input.next();
		
		System.out.println("How many Students? ");
		numStu = input.nextInt();
		
		
		try 
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < numStu; i++)
			{
				System.out.println("Enter student name: ");
				StuName = input.next();
				
				System.out.println("Enter test score: ");
				Score = input.next();
				
				
				writeFile.write(StuName);
				writeFile.newLine();
				writeFile.write(Score);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		}
		
		
		catch (IOException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
		
		
		//Read data from file and process
		try
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((StuName = readFile.readLine()) != null)
			{
				Score = readFile.readLine();
				System.out.println(StuName + " " + Score);
				numScores += 1;
				scoreValue = Double.parseDouble(Score);
				totalScores += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
				
			}
			avgScore = totalScores / numScores;
			System.out.println("Low Score = " + percent.format(lowScore/100));
			System.out.println("High Score = " + percent.format(highScore/100));
			System.out.println("Average = " + percent.format(avgScore/100));
			
			in.close();
		}
		catch (FileNotFoundException e) 
        {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

        } 
		catch (IOException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
	}
}
