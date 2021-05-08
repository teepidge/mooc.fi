public class Book {
    private int yearPublished;
    private String title;
    private int pageCount;
    
    public Book(String title, int yearPublished, int pageCount) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
}
    public String getName() {
        return this.title;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pageCount + " pages, " + this.yearPublished;
    }
    
}
