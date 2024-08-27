package P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        while (true) {
            int weapon = Integer.parseInt(scanner.nextLine());
            if (weapon == -1) {
                break;
            }
            player.shotWithWeapon(weapon);
        }
        // запрашивать номер с клавиатуры

        // с помощью scanner.nextInt(),
        // пока не будет введено -1


        System.out.println("Game over!");
    }
}