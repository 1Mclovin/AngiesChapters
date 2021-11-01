package pluralsight;

public class Singleton {

    /*
    a singlton guarantees only one instance is created
    lazily loaded
    guarantees control of a resource

    A singlton guarantees one instance
    its easy to implement
    solves a well defined problem
    do not abuse it because making everything a singleton will slow down your application


     */

    public static void main(String[] args) {


    }
    // lets create a singleton

    private static Singleton instance = new Singleton();

    //making it private so people cant create thier own
    private Singleton(){}

    // setting the getter so people can only see it and not set it
    // it is just good practice to do this

    public static Singleton getInstance(){
        return instance;
    }

}
