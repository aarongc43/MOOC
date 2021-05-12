public class Program {
    
    public static void main(String[] args) {
       Counter c = new Counter(10);

       c.increase(10);
       System.out.println(c.getValue());
       //Have to getValue damnit. We need instance variable not dang reference dummy
    }
}
