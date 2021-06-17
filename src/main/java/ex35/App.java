package ex35;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded.
You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
You may need to find another data structure, like an ArrayList.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String name;
        for(int i = 0; ;i++){
            System.out.println("Enter a name");
            name = in.nextLine();
            list.add(name);
            if(name.isEmpty()){
                list.remove(list.size() - 1);
                String winner = list.get((int ) (Math.random() * list.size()));
                System.out.println("The winner is......" + winner);
                break;
            }
        }
    }
}
