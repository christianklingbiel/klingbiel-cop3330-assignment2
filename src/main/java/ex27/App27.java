package ex27;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
 */

public class App27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname = in.next();
        System.out.println("Enter the last name: ");
        String lname = in.next();
        System.out.println("Enter the ZIP code: ");
        String zip = in.next();
        System.out.println("Enter the employee ID: ");
        String id = in.next();

        validateInput(fname, lname, zip, id);

    }
    public static void validateInput(String f, String l, String z, String ID){
        if (f.length() == 0){
            System.out.println("The first name must be filled in.");
        }
        else if (l.length() == 0){
            System.out.println("The last name must be filled in.");
        }
        else if (f.length() < 2 && l.length() < 2){
            System.out.println("The first and last names must be at least two characters long.");
        }
        else if (ID.substring(3).equals("-") ){
            System.out.println("An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.");
        }
        else if (z.contains("A")){
            System.out.println("The ZIP code must be a number.");
        }
        else if (z.length() != 5){
            System.out.println("The zipcode must be a 5 digit number.");
        }
        else System.out.println("There are no errors.");
    }
}
