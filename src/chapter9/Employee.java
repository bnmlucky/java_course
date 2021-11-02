package chapter9;

public class Employee extends Person{
    private String employeeId;
    private String title;

    public Employee() {
        super("Natalia");
      System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
/*
Superclass constructors run first
A superclass's constructor is run before the subclass's constructor.
Use 'super' to call specific constructors
Explicit calls can be made to superclass's constructors from one of the subclass's constructors by using super.
super calls must be first
Explicit calls to the superclass's constructor must be the first statement in the subclass's constructor.
Some constructor must be executed
If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors.
 */