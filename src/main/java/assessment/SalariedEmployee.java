package assessment;

public class SalariedEmployee extends Employee{


    public SalariedEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public void printBadge() {
        System.out.println( getName() + '\n' + "EmployeeID:" + counter);
    }
}
