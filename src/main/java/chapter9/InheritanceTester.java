package chapter9;

public class InheritanceTester {


    public static void main(String[] args) {

        Employee employee = new Employee();


        Rectangle2 rectangle = new Rectangle2();
        rectangle.print();

        Square square = new Square();
        square.print("square big dog");


        Mother mom = new Mother();
        mom.setName("Alicia");

        System.out.println(mom.getName()+ " is a "+ mom.getGender());

    }


}
