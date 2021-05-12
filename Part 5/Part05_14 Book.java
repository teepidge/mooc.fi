
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        // if 
        if (!(this instanceof Book)) {
            return false;
        }

        // create a Book object and cast it to the input object
        Book objectCompared = (Book) compared;
        
        // for this exercise, name and publication year need to be the same in order for the object to be considered equal
        return (objectCompared.name.equals(this.name)
                && objectCompared.publicationYear == this.publicationYear);

    }
}
