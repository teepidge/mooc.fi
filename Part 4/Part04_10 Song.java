
public class Song {

    private int length;
    private String name;
    
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }
    
    public String name() { 
        return this.name;
    }
    
    public int length() {
        return this.length;
    }
}
