package Masteries;
/*
Program: FindAndReplace.java          Date: October 16, 2024


Purpose: Create a FindAndReplace application that prompts the user for a file name, a search word or phrase, and a replacement word or phrase.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/




import java.io.*;
import java.util.Scanner;




public class FindAndReplace {
    public static void main(String[] args) {
        //Declaration area
        File dataFile;
        FileReader in;
        BufferedReader readFile;
        FileWriter out;
        BufferedWriter writeFile;
        String fileName, searchPhrase, replacePhrase, curLine;
        String fileContent = "";
        Boolean firstLine = true;




        //Get filename, phrase to find, and what to replace it with
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a file path to find and replace a word/phrase: ");
        fileName = input.nextLine();
               
        System.out.println("What word/phrase would you like to replace?: ");
        searchPhrase = input.nextLine();


        System.out.println("What would you like to replace it with?: ");
        replacePhrase = input.nextLine();







        //Read file
        try
        {
            //Set up BufferedReader
            dataFile = new File(fileName);
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);


            //Get all the text from the file and add it to a String
            while((curLine = readFile.readLine()) != null)
            {
                if(firstLine)
                {
                    fileContent += curLine;
                    firstLine = false;
                }
                else
                {
                    fileContent += "\n" + curLine;
                }
               
            }
            readFile.close();
            in.close();


            //Find and replace user selected phrase/word
            fileContent = fileContent.replaceAll(searchPhrase, replacePhrase);
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











        //Write to file
        try
        {
            //Set up BufferedWriter
            dataFile = new File(fileName);
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);


            //Add text back to file
            writeFile.write(fileContent);
            System.out.println("Data written to file.");
            System.out.println("The new text is: " + "\n" + "\n" + fileContent);

            writeFile.close();
            out.close();
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
Enter a file path to find and replace a word/phrase: 
C:\Users\1100062079\git\CS30P3F2024\Chapter11\src\Masteries\FindAndReplace.txt
What word/phrase would you like to replace?: 
Kang
What would you like to replace it with?: 
Grayson
Data written to file.
The new text is: 

Jack will be here in 2 days.
Grayson want's me to name this
oh
well
that sucks






Test Case 2:
Enter a file path to find and replace a word/phrase: 
C:\Users\1100062079\git\CS30P3F2024\Chapter11\src\Masteries\FindAndReplace.txt
What word/phrase would you like to replace?: 
sucks
What would you like to replace it with?: 
doesn't suck
Data written to file.
The new text is: 

Jack will be here in 2 days.
Grayson want's me to name this
oh
well
that doesn't suck
doesn't suck
doesn't suck
doesn't suck
*/
