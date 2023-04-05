package assessment;

public class main {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("mike");
        employee1.printBadge();

        Employee employee2 = new SalariedEmployee("Jerry");
        employee2.printBadge();


        Entrepreneur entrepreneur = new Entrepreneur("Elon");
         entrepreneur.setRevenue(2000);
         entrepreneur.setExpenses(500);
        System.out.println(entrepreneur.toString());

    }
}
