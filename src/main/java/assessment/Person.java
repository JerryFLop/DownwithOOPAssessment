package assessment;

public abstract class Person {
    private String name;


    public Person( String name) {
        this.name = name;

    }



        public String getName() {
            return name;
        }
    public void setName(String Name) {
        this.name = Name;
    }

    public static void printpay(Payable[] persons){
        for (Payable m: persons){
            m.CalculatePay();
        }


    }
    public abstract void ClothTypes ();
    public static void PrintClothTypes(Person[] cloths ) {
        for (Person c: cloths){
            c.ClothTypes();

        }
    }


}


