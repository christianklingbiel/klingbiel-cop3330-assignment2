package ex34;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 34 - Employee List Removal

Sometimes you have to locate and remove an entry from a list based on some criteria.
You may have a deck of cards and need to discard one so it’s no longer in play,
or you may need to remove values from a list of valid inputs once they’ve been used.
Storing the values in an array makes this process easier. Depending on your language,
you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Jimmy Butler");
        list.add("Bam Adebayo");
        list.add("Tyler Herro");
        list.add("Goran Dragic");
        list.add("Kendrick Nunn");
        System.out.println("There are " + list.size() + " Miami Heat players.");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Enter a Miami Heat player to remove: ");
        String name = in.next();
        for(int i = 0;i < list.size();i++){
            if (name.equalsIgnoreCase(list.get(i))){
                list.remove(i);
                i--;
            }
        }
        System.out.println("There are " + list.size() + " Miami Heat players.");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
