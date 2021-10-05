package chapter4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        write a program that allows a user to enter two numbers,
        and then sums up both of them
        the user should be able to keep repeating this action until they indicate they are done

         */

        Scanner scanner = new Scanner(System.in);

        boolean again;
        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1+num2;

            System.out.println("the sum is "+ sum);

            System.out.println("do you want to start over?");
            again= scanner.nextBoolean();

        } while(again);





    }
}
