package Masteries;

import java.io.Serializable;
import java.text.DecimalFormat;




public class PiggyBank implements Serializable {
    private double totalMoney;


    //Constructor
    public PiggyBank()
    {
        totalMoney = 0;
    }




    DecimalFormat format = new DecimalFormat("0.00");


    //Adding methods
    public void addPenny()
    {
        totalMoney += 0.01;
        System.out.println("A penny was added.\n");
    }


    public void addNickel()
    {
        totalMoney += 0.05;
        System.out.println("A Nickel was added.\n");
    }


    public void addDime()
    {
        totalMoney += 0.1;
        System.out.println("A dime was added.\n");
    }


    public void addQuarter()
    {
        totalMoney += 0.25;
        System.out.println("A quarter was added.\n");
    }








    //Taking out methods
    public void removePenny()
    {
        if(totalMoney >= 0.01)
        {
            totalMoney -= 0.01;
            System.out.println("A penny was removed.\n");
        }
        else
        {
            System.out.println("There is not enough money to remove a penny.\n");
        }
    }


    public void removeNickel()
    {
        if(totalMoney >= 0.05)
        {
            totalMoney -= 0.05;
            System.out.println("A Nickel was removed.\n");
        }
        else
        {
            System.out.println("There is not enough money to remove a Nickel.\n");
        }
    }


    public void removeDime()
    {
        if(totalMoney >= 0.1)
        {
            totalMoney -= 0.1;
            System.out.println("A dime was removed.\n");
        }
        else
        {
            System.out.println("There is not enough money to remove a dime.\n");
        }
    }


    public void removeQuarter()
    {
        if(totalMoney >= 0.25)
        {
            totalMoney -= 0.25;
            System.out.println("A quarter was removed.\n");
        }
        else
        {
            System.out.println("There is not enough money to remove a quarter.\n");
        }
    }










    //Retrive money
    public double getTotalMoney()
    {
        return totalMoney;
    }


    //Return as string
    public String toString()
    {
        String piggy = "The total balance of this piggy bank is: $" + format.format(totalMoney) + "\n";
       
        return (piggy);
    }
}
