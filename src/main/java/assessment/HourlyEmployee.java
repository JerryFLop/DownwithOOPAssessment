package assessment;

public class HourlyEmployee extends Employee  {


    public HourlyEmployee(int id,String name) {
        super(id, name);
    }

@Override
    public void printBadge() {
        System.out.println("HourlyEmployee : " + getName() + '\n'+ "EmployeeID :  " + counter );
    }
}

