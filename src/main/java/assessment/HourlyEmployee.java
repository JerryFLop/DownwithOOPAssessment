package assessment;

public class HourlyEmployee extends Employee implements Payable {


    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public void ClothTypes() {
        System.out.println("Blue shirt and black jeans ");
    }


    private double hoursworked;
    private double hourlyrate;



    public double getHourlyrate() {
        return hourlyrate;}


    public void setHoursworked(double hoursworked){
        this. hoursworked = hoursworked;
    }

    public double getHoursworked() {
        return hoursworked;}


    public void setHourlyrate(double hourlyrate){
        this.hourlyrate = hourlyrate;
    }


@Override
    public void printBadge() {
        System.out.println("HourlyEmployee : " + getName() + '\n'+ "EmployeeID :  " + printID() );
    }

    @Override
    public void CalculatePay() {
        System.out.println( "Hourly Employee's Pay is : " + hourlyrate * hoursworked);



    }

}

