package assessment;

public abstract class Person {
    private String name;
    private int id;


    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public abstract void printBadge();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

}