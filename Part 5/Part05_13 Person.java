
public class Person {

    private String name;
    private int height;
    private int weight;
    private SimpleDate birthday;

// Accessors *****************
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
// Accessors *****************

    // Mutators  *****************
    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    // Mutators *****************  

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        // compare memory references
        if (this == compared) {
            return true;
        }
        // compare classtypes
        if (!(this instanceof Person)) {
            System.out.println("instance of");
            return false;
        }

        // cast object type to person type in order to compare parameters
        Person objectCompared = (Person) compared;
        
        if (this.name.equals(objectCompared.name)
                && this.birthday.equals(objectCompared.birthday)
                && this.height == objectCompared.height
                && this.weight == objectCompared.weight) {
            return true;
        }
        System.out.println("other");
        return false;
    }
}
