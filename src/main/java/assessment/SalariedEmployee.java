package assessment;

public class SalariedEmployee extends Employee implements Payable{

    public SalariedEmployee(String name) {
        super( name);
    }
    private double Salary;

public void setSalary(double salary){
    this.Salary = salary;
}

    @Override
    public void printBadge() {
        System.out.println("SalariedEmployee : "  + getName() + '\n'+ "EmployeeID : "  + printID() );
    }

    @Override
    public void CalculatePay() {
        System.out.println();

    }
}
