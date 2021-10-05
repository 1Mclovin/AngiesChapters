package chapter4;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // get number of items to scan
        System.out.println("How many items are you scanning Karen?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
      //  scanner.close();

        double total = 0;

        // create loop to go through all items and accumilate the costs

        for(int i=0; i<quantity; i++){

            System.out.println("enter cost of item:");
            double price = scanner.nextDouble();

            total = total+price;

        }
        scanner.close();

        System.out.println("your total is $"+ total);




        }



    }




