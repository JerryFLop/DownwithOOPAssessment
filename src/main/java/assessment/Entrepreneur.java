package assessment;

public class Entrepreneur extends Person implements Payable{

    public Entrepreneur( String name) {
        super (name);
     }
    private double revenue;
    private double expenses;



//    public double getExpenses() {
//        return expenses;}


    public void setExpenses(double expenses){
        this.expenses = expenses;
    }

//    public double getRevenue() {
//        return revenue;}


        public void setRevenue(double revenue){
            this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "Name is " + getName() + ", revenue is " + revenue +
                ", expenses are " + expenses +
                '}';
    }

    @Override
    public void ClothTypes() {
        System.out.println("A blue suit and tie ");
    }

    @Override
    public void CalculatePay() {
        System.out.println("Entrepreneur's Pay is : "  + (revenue - expenses));





    }
}


