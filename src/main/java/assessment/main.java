package assessment;

public class main {
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("mike");
        employee1.printBadge();
        employee1.setHourlyrate(15);
        employee1.setHoursworked(40);



        SalariedEmployee employee2 = new SalariedEmployee("Jerry");
        employee2.printBadge();
         employee2.setSalary(2000);


        Entrepreneur entrepreneur = new Entrepreneur("Elon");
         entrepreneur.setRevenue(2000);
         entrepreneur.setExpenses(500);
        System.out.println(entrepreneur.toString());

        Payable [] personarray = {employee1,employee2,entrepreneur};
           Person.printpay(personarray);
           Person [] clothsarray


          Cloth cloth = new Cloth(200,"Casual wear") ;



    }
}
