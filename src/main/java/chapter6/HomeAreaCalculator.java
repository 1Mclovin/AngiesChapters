package chapter6;

import java.awt.*;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //Rectangle 1
        // Create instance of rectangle class

        Rectangle room1 = new Rectangle();
       room1.setWidth(23);
       room1.setLength(10);

       // now lets calculate area
        double areaOfRoom1 = room1.calculateArea();
       // System.out.println(areaOfRoom1);

        // lets create new object

        Rectangle room2 = new Rectangle(30,10);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea= areaOfRoom1+areaOfRoom2;

        System.out.println("Area of both rooms is: "+ totalArea);


    }

}
