package chapter11;

public class Rectangle3 extends Shape{
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle3(double width, double length){

        setLength(length);
        setWidth(width);

    }

    @Override
    double calculateArea() {
        return length*width;

    }
}
