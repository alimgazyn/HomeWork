package P7;

public class Snake extends Animal{
    public Snake(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Шипит");
    }

    @Override
    public void eat() {
        System.out.println(name + " Кушает курицу");;
    }

    @Override
    public void move() {
        System.out.println("Ползет");
    }
}
