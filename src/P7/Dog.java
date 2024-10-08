package P7;

public class Dog extends Animal{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Гаф - гаф");
    }

    @Override
    public void eat() {
        System.out.println("Кушает");
    }

    @Override
    public void move() {
        System.out.println("Бежит");
    }
}
