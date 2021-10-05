package chapter9;

public class Square extends Rectangle2{

// always remember to use the override annotation

    @Override
    public double calculatePerimeter(){
        return sides*length;
    }


    public void print(String what){
        System.out.println("I am a "+ what);
    }


}
