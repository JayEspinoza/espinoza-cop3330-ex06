/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 6 - Retirement Calculator
 *  Create a program that determines how many years you have left until retirement and the
 *  year you can retire. It should prompt for your current age and the age you want to retire and display
 *  the output as shown in the example that follows.
 *
 *  Constraint:
 *  Again, be sure to convert the input to numerical data before doing any math.
 *  Don’t hard-code the current year into your program. Get it from the system time via your programming language.
 *
 */

package ex06;
import java.util.Scanner;
import java.time.YearMonth;

public class base {
    public static void main(String [] args)
    {
        // Variable Initialization
        Scanner userInput = new Scanner(System.in);
        String ageCurrent,ageRetire;
        int yearsLeft, retireYear;

        // User Input Step
        System.out.printf("What is your current age? ");
        ageCurrent = userInput.nextLine();

        System.out.printf("At what age would you like to retire? ");
        ageRetire = userInput.nextLine();

        // Mathematical Calculations and Output
        yearsLeft = Integer.parseInt(ageRetire) - Integer.parseInt(ageCurrent);
        System.out.println("You have " + yearsLeft + " years left until you can retire");

        // Current year is gotten using YearMonth
        retireYear = YearMonth.now().getYear() +yearsLeft;
        System.out.println("It's " + YearMonth.now().getYear() + ", so you can retire in " + retireYear);
    }
}
