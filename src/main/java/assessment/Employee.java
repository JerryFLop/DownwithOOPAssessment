package assessment;



public abstract class Employee extends Person {

    public Employee( String name) {
        super(name);

        id = ++counter;
    }
public static int counter = 0;
    private int id;

    public int getId() {
        return id;
    }
   public int printID(){
       return id;
   }
    public abstract void printBadge();
}
