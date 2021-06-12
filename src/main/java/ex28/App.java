package ex28;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int [5];
        for (int i = 0;i < 5;i++){
            System.out.println("Enter a number:");
            array[i] = in.nextInt();
        }
        int sum = 0;
        for (int j = 0;j < 5;j++){
            sum += array[j];
        }
        System.out.println("The total is "+ sum+ ".");
    }
}
