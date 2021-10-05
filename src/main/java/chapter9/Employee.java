package chapter9;
/*
 A super class constructor is run before the subclass constructor.

 use super to call specific constructors
 Explicit calls can be made to superclass's
 constructors from one of the subclass's
 constructors by using super

 Super calls must be first
 Explicit calls to the superclass's constructor
 must be the first statement in the subclass's constructor

 Some constructor must be executed
 if the superclass does not have a default constructor, the subclass must explicitly call
 one of its other constructors.

 */

public class Employee extends Person{

    private String employeeId;
    private String employeeTitle;

    // default constructor
    public Employee(){
        super("Raul");
        System.out.println("In employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
}
