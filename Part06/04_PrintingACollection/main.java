public class main {
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);

        s.removeAllElements();
        System.out.println(s);
    }
}
