public class Main {

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c); // a new Money object is created and is placed "at end
        // of strand connected to a" 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Money d = new Money(21,0);
        Money e = new Money(100,0);
        Money f = new Money(15,0);

        System.out.println(d.lessThan(e));
        System.out.println(e.lessThan(f));

        Money g = new Money(10,0);
        Money h = new Money(3,50);

        Money i = g.minus(h);

        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

     
        i = i.minus(g);

        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
