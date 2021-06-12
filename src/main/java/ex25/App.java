package ex25;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = in.next();
        if(passwordValidator(password) < 1){
            System.out.println("The password "+ password +" is a very weak password.");
        }
        else if(passwordValidator(password) < 2){
            System.out.println("The password "+password+" is a weak passsword.");
        }
        else if(passwordValidator(password) < 3){
            System.out.println("The password "+password+" is a strong password.");
        }
        else System.out.println("The password "+password+" is a very strong password.");

    }
    public static int passwordValidator(String password){
        int iPasswordScore = 0;
        if( password.length() < 8 )
            return 0;
        else if( password.length() >= 10 )
            iPasswordScore += 2;
        else
            iPasswordScore += 1;
        if( password.matches("(?=.*[0-9]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[a-z]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[A-Z]).*") )
            iPasswordScore += 2;
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") )
            iPasswordScore += 2;

        return iPasswordScore;
    }
}
