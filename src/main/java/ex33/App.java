package ex33;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program.
If you combine that with a random number generator, you can pick a random entry from this list,
which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either
"Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your question? ");
        String question = in.next();
        List<String> list = new ArrayList<String>();
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");
        System.out.println(list.get((int) (Math.random() * 4)));
    }
}
