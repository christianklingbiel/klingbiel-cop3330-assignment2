package ex24;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        String first = in.next();
        System.out.println("Enter the second string: ");
        String second = in.next();
        if(isAnagram(first, second)){
            System.out.println("'" + first + "' and '" + second + "' are anagrams.");
        }
        else System.out.println("'" + first + "' and '" + second + "' are not anagrams.");
    }
    public static boolean isAnagram(String x, String y){
        if (x.length() != y.length())
            return false;
        else{
            for(int i=0; i<x.length();i++){
                for(int j=0;j<y.length();j++){
                    if(x.charAt(i)==y.charAt(j)){
                        y = y.substring(0,j)+y.substring(j+1);
                        break;
                    }
                }
            }
            if(y.length()==0){
                return true;
            }
            else return false;
        }
    }
}
