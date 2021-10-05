package chapter6;

public class ClassAndObjects {
 private double length;
  private double width;


    //constructor
    public ClassAndObjects(){
        length=0;
        width =0;
    }
    public ClassAndObjects(double length,double width){
        setLength(length);
        setWidth(width);

    }


   public double calculatePerimiter(){
        return(2* length)+(2*width);
    }

   public double calculateArea(){
        return length*width;
    }

   public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

   public double getWidth(){
        return width;
    }

   public void setWidth(double width){
        this.width=width;
        
    }

}
