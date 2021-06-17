package ex37;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 37 - Password Generator

Coming up with a password that meets specific requirements is something your computer can do.
And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters, and the number of numbers.
Then generate a password for the user using those inputs.

Example Output

What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints

Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A","B","C","D","E",
                "F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
        ArrayList<String> specialChar = new ArrayList<>(Arrays.asList("!","@","#","$","%","^",
                "&","*"));
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        System.out.print("How many special characters? ");
        int special = in.nextInt();
        System.out.print("How many numbers? ");
        int num = in.nextInt();
        ArrayList<String> password = new ArrayList<>();
        for(int i = 0;i < length + 1;i++){
            int random = (int) (Math.random() * 3);
            if (random == 1){
                password.add(letters.get((int) (Math.random() * 26)));
            }
            else if (random == 2){
                password.add(specialChar.get((int) (Math.random() * 8)));
            }
            else
                password.add(numbers.get((int) (Math.random() * 10)));
        }
        System.out.print("Your password is " );
        for(int i = 0; i < password.size();i++){
            System.out.print(password.get(i));
        }
    }
}
