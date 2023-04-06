package assessment;

public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void ClothTypes() {
        System.out.println("blue and white shirt and black pants");
    }

    @Override
    public void printBadge() {

    }
}
