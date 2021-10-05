package chapter6;

public class Rectangle {
    // encapsulation says to make fields private and make methods that you want
    //to use outside of this class public


   private double length;
    private double width;

    // constructor

    public Rectangle(){
        length = 0;
        width = 0;
    }
    // another constructor

    public Rectangle(double length, double width){
        setLength(length);
        this.width=width;
    }

   public double calculateArea(){
        return  length*width;
    }
   public double calculatePerimeter(){
        return (2* length)+(2*width);
    }

   public double getLength(){
        return length;
    }
   public void setLength(double length){
        this.length = length;
    }

   public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

//    public void setWidth() {
//    }
}
