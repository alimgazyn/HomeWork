package P7;

public class Main {
    public static void main(String[] args) {
        Snake snake = new Snake("Шарик", 2, 0.6);
        Elephant elephant = new Elephant("Рекс", 1, 3.4);
        Lion lion = new Lion("Барсик", 5, 7.4);
        Dog dog = new Dog("dada", 3, 4.3);

        snake.eat();
        snake.makeSound();
        snake.move();

        elephant.eat();
        elephant.makeSound();
        elephant.move();

        lion.eat();
        lion.makeSound();
        lion.move();

        dog.eat();
        dog.makeSound();
        dog.move();
    }
}
