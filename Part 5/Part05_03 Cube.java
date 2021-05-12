
public class Cube {
    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
        this.volume = edgeLength * edgeLength * edgeLength;
    }
    
    public int volume() {
        return volume;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The length of the edge is ").append(edgeLength);
        sb.append(" and the volume ").append(volume);
        return sb.toString();
    }
    
}
