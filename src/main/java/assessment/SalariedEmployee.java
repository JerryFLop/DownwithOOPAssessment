package assessment;

public class SalariedEmployee extends Employee implements Payable{

    public SalariedEmployee(String name) {
        super( name);
    }

    @Override
    public void ClothTypes() {
        System.out.println("A suit and tie");
    }

    private double Salary;
    public double getSalary() {
        return Salary;}

public void setSalary(double salary){
    this.Salary = salary;


}

    @Override
    public void printBadge() {
        System.out.println("SalariedEmployee : "  + getName() + '\n'+ "EmployeeID : "  + printID() );
    }

    @Override
    public void CalculatePay() {
        System.out.println( "Salaried  Employee's Pay is : " + Salary );

    }
}
