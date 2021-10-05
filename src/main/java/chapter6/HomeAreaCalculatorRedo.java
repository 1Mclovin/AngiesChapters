package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

  private  Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
// a default constructor exists withinjava no matter what

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();


        double area = calculator.calculateTotalArea(kitchen,bathRoom);


        System.out.println("the total area is " + area);

        calculator.scanner.close();

    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }



    public Rectangle getRoom(){

        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();


        System.out.println("enter the width of the room");
        double width = scanner.nextDouble();



        // create this rectangle
        return new Rectangle(length, width);

    }


}
