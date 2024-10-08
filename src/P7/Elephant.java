package P7;

public class Elephant extends Animal{
    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void makeSound() {
        System.out.println(name + " фыв");
    }

    @Override
    public void eat() {
        System.out.println(name + " Кушает траву");
    }

    @Override
    public void move() {
        System.out.println("Идет");
    }
}
