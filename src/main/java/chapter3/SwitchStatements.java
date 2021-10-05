package chapter3;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);

        String message;

        String grade = scanner.next();
        switch(grade){
            case"A":
                message ="Excelent job!";
                break;
            case "B":
                message= "Great job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message="Try harder next time";
                break;
            case "F":
                message ="Bro wtf you doing?";
                break;
            default :
                message = "Error.Invalid grade";
                break;

        }

        System.out.println(message);


    }

}
