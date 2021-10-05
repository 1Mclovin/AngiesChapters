package chapter3;

import java.util.Scanner;

public class NestedIfStatements {
    public static void main(String[] args) {
        // what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // get what we dont know
        System.out.println("Enter Salary amount");
        Scanner scanner= new Scanner(System.in);
        int salary =scanner.nextInt();

        System.out.println("How many years were you employed?");
        int yearsWorked = scanner.nextInt();
        scanner.close();


        // lets make a decision
        if(salary>=requiredSalary){
            if (yearsWorked>=requiredYearsEmployed){
                System.out.println("Congrats you qualify for a loan");
            }else{
                System.out.println("Sorry you must have worked at current job for at least "+requiredYearsEmployed+" years.");
            }
        }else{
            System.out.println("Sorry you must earn atleast $"+ requiredSalary+ " to qualify for the loan");
        }




    }
}
