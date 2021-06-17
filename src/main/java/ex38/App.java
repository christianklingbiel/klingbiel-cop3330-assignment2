package ex38;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down.
Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints
Convert the input to an array.
Many languages can easily convert strings to arrays with a built-in function that splits apart a
string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = in.nextLine();
        String [] convert;
        convert = numbers.split(" ");
        int [] converted = new int [convert.length];
        for(int i = 0;i < convert.length;i++){
            converted[i] = Integer.parseInt(convert[i]);
        }
        System.out.print("The even numbers are ");
        for(int i = 0;i < filterEvenNumbers(converted).size();i++){
            System.out.print(filterEvenNumbers(converted).get(i)+ " ");
        }
    }
    public static List<Integer> filterEvenNumbers(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int j = 0;j < arr.length;j ++) {
            if (arr[j]  % 2 == 0)
            list.add(arr[j]);

        }
        return list;
    }
}
