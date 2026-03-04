package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int maxPop = 3;
        String snova;
        do {
            System.out.println("========================================");
            System.out.println("||       ИГРА УГАДАЙ ЧИСЛО            ||");
            System.out.println("========================================");
            System.out.println("|| Я загадаю число от 1 до 100        ||");
            System.out.printf("|| У тебя %d попытки!                  ||\n", maxPop);
            System.out.println("----------------------------------------");

            int chislo = rnd.nextInt(100) + 1;
            int popytka = 0;

            do {
                System.out.printf("Введите число: ", popytka + 1, maxPop);
                int otvet = sc.nextInt();
                popytka++;

                if (otvet == chislo) {
                    System.out.println("----------------------------------------");
                    System.out.println("========================================");
                    System.out.printf("||  Поздравляем! Вы угадали за %d попытка  ||\n", popytka);
                    System.out.println("========================================");
                    break;
                } else if (otvet > chislo) {
                    System.out.println("----  Много! ----------");
                } else {
                    System.out.println("----  Меньше! ----------");
                }

                if (popytka >= maxPop) {
                    System.out.println("----------------------------------------");
                    System.out.println("========================================");
                    System.out.printf("||  Попытки кончились! Число было: %d  ||\n", chislo);
                    System.out.println("========================================");
                    break;
                }

            } while (true);

            System.out.println("----------------------------------------");
            System.out.print(">> Хочешь сыграть снова? (y/no): ");
            snova = sc.next();

        } while (snova.equals("y"));

        System.out.println("========================================");
        System.out.println("||         СПАСИБО ЗА ИГРУ!           ||");
        System.out.println("========================================");
    }
}
