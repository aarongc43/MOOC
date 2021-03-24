public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person (String name) {
        this.name = name;
        this.age = age = 0;
        this.weight = weight = 0;
        this.height = height = 0;
    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    
    public boolean isEmpty() {
        return this.name == "";
    }
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
