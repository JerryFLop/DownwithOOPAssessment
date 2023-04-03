package assessment;

public abstract class Employee extends Person {

    public Employee(int id, String name) {
        super(id, name);
         id = ++counter;
    }
private static int counter = 0;

    public void printBadge() {
        System.out.println( getName() + '\n' + "EmployeeID:" + counter);
    }
}
