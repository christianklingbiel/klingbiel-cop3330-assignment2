package ex36;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities. For example,
the standard deviation helps you determine which values are outliers and which values are
within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time,
and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and
return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        double k; String s;
        for(int i = 0; ;i++){
            System.out.println("Enter a number: ");
                k = in.nextDouble();
                s = in.nextLine();
                list.add(k);
            if(s.equalsIgnoreCase("done")){
                for(int j = 0;j < list.size();j++){
                    System.out.printf("Numbers ");
                    System.out.printf(list.get(j) + ", ");
                }
                System.out.println("The average is " + average(list));
                System.out.println("The minimum is " + min(list));
                System.out.println("The maximum is " + max(list));
                System.out.println("The standard deviation is " + std(list));
                break;
            }
        }
    }
    public static double average(List<Double> list){
        double avg = 0;
        for (int i = 0;i < list.size();i++){
            avg += list.get(i);
        }
        return (avg/list.size());
    }
    public static double max(List<Double> list){
        double max = list.get(0);
        for (int i = 0;i < list.size();i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static double min(List<Double> list){
        double min = list.get(0);
        for (int i = 0;i < list.size();i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public static double std(List<Double> list){
        return list.get(0);
    }
}
