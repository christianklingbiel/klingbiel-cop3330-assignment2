package ex32;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 32 - Guess the Number Game
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n

Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int diff = in.nextInt();
        int rand = 0, count = 0;
        if (diff == 1){
            rand = (int) (Math.random() * 10);
        }
        else if (diff == 2){
            rand = (int) (Math.random() * 100);
        }
        else if (diff == 3){
            rand = (int) (Math.random() * 1000);
        }
        System.out.println("I have my number. What's your guess? ");
        int guess = in.nextInt();
        guess(guess, rand, count);
    }
    public static void guess(int guess, int rand, int count){
        Scanner in = new Scanner(System.in);
        if(guess > rand){
            System.out.println("Too high guess again. Guess again: ");
            guess = in.nextInt();
            count++;
            guess(guess, rand, count);
        }
        else if (guess < rand){
            System.out.println("Too low guess again. Guess again: ");
            guess = in.nextInt();
            count++;
            guess(guess, rand, count);
        }
        else if (guess == rand){
            System.out.println("You got it in " + (count + 1) + " guess(es).");
            System.out.println();
            System.out.println("Do you wish to play again (Y/N)?");
            String playAgain = in.next();
            if (playAgain.equalsIgnoreCase("y")){
                guess(guess, rand, count = 0);
            }
        }
    }
}
