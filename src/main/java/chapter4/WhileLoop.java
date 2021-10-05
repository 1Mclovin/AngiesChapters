package chapter4;

import java.util.Scanner;

public class WhileLoop {

    /*
    Each store employee makes 15 bones an hour
    we need to write a program that allows employees to enter number of hours worked for the week
    we cannot allow overtime
     */

    public static void main(String[] args) {
        // initialize what we know

        int rate =15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        // validate input
        while(hoursWorked>maxHours){
            System.out.println("Invalid entry you cannot work more than 40 hours enter different amount");
            hoursWorked = scanner.nextInt();
        }
scanner.close();
        // calculate the statement

        int gross = rate*hoursWorked;
        System.out.println("Gross pay: $"+ gross);

    }


}
