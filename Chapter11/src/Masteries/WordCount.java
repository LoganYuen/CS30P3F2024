package Masteries;
/*
Program: WordCount.java          Date: October 15, 2024


Purpose:  Create a WordCount application that displays the number of words and the average word length in a text file named source.txt


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/




import java.io.*;
import java.text.DecimalFormat;


public class WordCount {
    public static void main(String[] args) {
        //Declaration area
        File dataFile;
        FileReader in;
        BufferedReader readFile;
        String avgLength;
        int numChar = 0;
        int numWords = 0;
        boolean checkLetter = false;


        DecimalFormat format = new DecimalFormat("0.00");




        try
        {
            //Set up BufferedReader
            dataFile = new File("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter11\\src\\Masteries\\source.txt");
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            
            
            while (readFile.ready())
            {
                int character = readFile.read();


                //Char is a letter
                if(character >= 65 && character <= 90 || character >= 97 && character <= 122)
                {
                    checkLetter = true;
                    numChar++;
                }




                //Char is not a letter
                else
                {
                	//Check if character is the end of a word
                    if (checkLetter)
                    {
                        numWords++;
                    }
                    checkLetter = false;
                }
            }
            readFile.close();
            in.close();

            //adds to word count if file ends on a character
            if (checkLetter)
            {
                numWords++;
            }
             
            //calculate average word length
            avgLength = format.format((double)numChar/numWords);

            //display
            System.out.println("Number of words: " + numWords);
            System.out.println("Average word length: " + avgLength + " letters. ");
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
Number of words: 4
Average word length: 12.50 letters. 






Test Case 2:
Number of words: 8
Average word length: 6.25 letters. 
*/
