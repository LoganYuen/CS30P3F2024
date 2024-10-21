package Masteries;

/*
Program: MySavings.java          Date: October 17, 2024




Purpose: Modify the MySavings application from Chapter 7 to store and load the PiggyBank object from a file.




Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.util.Scanner;


public class MySavings {
    public static void main(String[] args) {
        //Declaration area
        File dataFile;
        FileOutputStream fileOut;
        ObjectOutputStream objectOut;
        FileInputStream fileIn;
        ObjectInputStream objectIn;
        int optionChoice, addedAmount, takenAmount;
        String loadChoice, saveChoice;
        boolean quit = false;


       
        PiggyBank userBank = new PiggyBank();
       
       
        Scanner input = new Scanner(System.in);
           


        //Ask user if they want to load the last piggy bank
        System.out.println("Would you like to load the last saved piggy bank? [Y]es or [N]o: ");
        loadChoice = input.nextLine();








        //Load the saved piggy bank
        if(loadChoice.toLowerCase().equals("y"))
        {
            try
            {
            dataFile = new File("C:\\Users\\logan\\Downloads\\savedBank.txt");
            fileIn = new FileInputStream(dataFile);
            objectIn = new ObjectInputStream(fileIn);




            userBank = (PiggyBank) objectIn.readObject();


            System.out.println(userBank);
            System.out.println("Saved bank has loaded.\n");


            objectIn.close();
            fileIn.close();
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
            catch (ClassNotFoundException e)
            {
                System.out.println("Class does not exist or could not be found.");
                System.err.println("ClassNotFoundException: " + e.getMessage());
            }
        }






        //Start the main program
        while(quit == false)
        {
            //Menu
            System.out.println
            (
            "Please enter a number that corresponds to one of the possible choices.\n" +
            "1. Show total money in the bank.\n" +
            "2. Add money to the bank.\n" +
            "3. Take out money from the bank.\n" +
            "4. End the program."
            );
            optionChoice = input.nextInt();






            //Check for user's choice
            switch(optionChoice)
            {
                //Display total money
                case 1:
                    System.out.println(userBank);
                break;




                //Add a coin
                case 2:
                    System.out.println
                    (
                    "What would you like to add?\n" +
                    "1. Penny.\n" +
                    "2. Nickle.\n" +
                    "3. Dime.\n" +
                    "4. Quarter."
                    );
                    addedAmount = input.nextInt();


                    switch(addedAmount)
                    {
                        case 1:
                            userBank.addPenny();
                        break;
                        case 2:
                            userBank.addNickle();
                        break;
                        case 3:
                            userBank.addDime();
                        break;
                        case 4:
                            userBank.addQuarter();
                        break;
                        default:
                            System.out.println("Invalid option. Please try again.\n");
                        break;
                    }
                break;




                //Remove a coin
                case 3:
                    System.out.println
                    (
                    "\nWhat would you like to take out?\n" +
                    "1. Penny.\n" +
                    "2. Nickle.\n" +
                    "3. Dime.\n" +
                    "4. Quarter."
                    );
                    takenAmount = input.nextInt();


                    switch(takenAmount)
                    {
                        case 1:
                            userBank.removePenny();
                        break;
                        case 2:
                            userBank.removeNickle();
                        break;
                        case 3:
                            userBank.removeDime();
                        break;
                        case 4:
                            userBank.removeQuarter();
                        break;
                        default:
                            System.out.println("Invalid option. Please try again.\n");
                        break;
                    }
                break;




                //End program
                case 4:
                    quit = true;
                break;




                default:
                    System.out.println("Invalid option. Please try again.\n");
                break;
            }
        }




        System.out.println("Thank you for using this program. Would you like to save this bank? [Y]es or [N]o: ");
        input.nextLine();
        saveChoice = input.nextLine();


        //Check if the user wants to save
        if(saveChoice.toLowerCase().equals("y"))
        {
            try
            {
                dataFile = new File("C:\\Users\\logan\\Downloads\\savedBank.txt");
                fileOut = new FileOutputStream(dataFile);
                objectOut = new ObjectOutputStream(fileOut);


                objectOut.writeObject(userBank);


                System.out.print("\nBank saved.");


                objectOut.close();
                fileOut.close();
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




        else
        {
            System.out.print("\nBank not saved.");
        }
    }
}
/* Screen Dump
Test Case 1:




Test Case 2:


*/
