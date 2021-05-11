public class Cube {

    private int length;

    public Cube (int length) {
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
    
    public int volume() {
        return this.length * this.length * this.length;
    }

    public String toString() {
        return "Length: " + getLength() + "\n" +  "Volume: " + volume();

    }

}
