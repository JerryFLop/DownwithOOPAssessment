package assessment;

public abstract class Person {
    private String name;
    private int id;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }



        public int getId() {
            return id;
        }
    public void setId(int ID) {
        this.id = ID;
    }

        public String getName() {
            return name;
        }

    public void setName(String Name) {
        this.name = Name;
    }
}


