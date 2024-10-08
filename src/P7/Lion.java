package P7;

public class Lion  extends Animal{
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    public  void makeSound() {
        System.out.println(name + " Рычит");
    }

    public void eat() {
        System.out.println(name + " Ест мясо");
    }

    @Override
    public void move() {
        System.out.println("Бежит");
    }
}
