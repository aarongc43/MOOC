public class Song {

    private String name;
    private int length;

    public Song(String name, int length) {
        name = name;
        length = length;
    }

    public String name() {
        System.out.println(name);
        return name;
    }

    public int length() {
        System.out.println(length);
        return length;
    }
}
