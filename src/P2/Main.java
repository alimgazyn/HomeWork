package P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO:
        //  создайте абстрактный класс Media (название, продолжительность)
        //  создайте класс Фильм, который наследуется от Media и добавляет рейтинг
        //  создайте класс Сериал, который наследуется от Фильма и добавляет колВоСерий
        Scanner scanner = new Scanner(System.in);
        ArrayList<Media> media = new ArrayList<>();
        while (true) {
            printMenu();
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                // запрашиваем название фильма
                System.out.println("Введите название фильма:");
                String nameF = scanner.nextLine();
                // запрашиваем продолжительность
                System.out.println("Введите длительность фильма в минутах:");
                int timeF = Integer.parseInt(scanner.nextLine());
                // запрашиваем рейтинг
                System.out.println("Поставьте оценку");
                double ocenkaF = Double.parseDouble(scanner.nextLine());
                // добавляем созданный фильм в список media
                Film film = new Film(nameF, timeF, ocenkaF);
                media.add(film);
            } else if (command == 2) {
                // запрашиваем название фильма
                System.out.println("Введите название фильма:");
                String nameS = scanner.nextLine();
                // запрашиваем продолжительность
                System.out.println("Введите длительность фильма в минутах:");
                int timeS = Integer.parseInt(scanner.nextLine());
                // запрашиваем колВоСерий
                System.out.println("Введите количество серий:");
                int kolS = Integer.parseInt(scanner.nextLine());
                // запрашиваем рейтинг
                System.out.println("Поставьте оценку");
                double ocenkaS = Double.parseDouble(scanner.nextLine());
                // добавляем созданный сериал в список media
                Serial serial = new Serial(nameS, timeS, kolS, ocenkaS);
                media.add(serial);
            } else if (command == 0) {
                double totalDays = Calculator.calculator(media);
                System.out.println(totalDays);
                break;


                // Общее кол-во потраченных дней: ___
            }
        }
    }

    static void printMenu() {
        System.out.println("""
                1. Добавить фильм
                2. Добавить сериал
                0. Завершить и вывести общее кол-во потраченной времени""");
    }
}

