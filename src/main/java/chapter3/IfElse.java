package chapter3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        //   initialize the values we know
        int quota = 10;
        // get the values we know
        System.out.println("how many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //now lets see what we wanna do
        if(sales>=quota){
            System.out.println("Congrats you've met your quota");
        }else{
            int salesShort  = quota-sales;
            System.out.println("you did not meet the sales quota. you were "+salesShort +" sales short");
        }




    }
}
