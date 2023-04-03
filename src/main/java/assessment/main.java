package assessment;

public class main {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee(0,"mike");
        employee1.printBadge();

        Employee employee2 = new SalariedEmployee(0,"Jerry");
        employee2.printBadge();


    }
}
