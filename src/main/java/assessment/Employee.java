package assessment;



public abstract class Employee extends Person {

    public Employee( int id, String name) {
        super(id,name);

        id = ++counter;
    }
public static int counter = 0;


    public void printBadge() {

    }
}
