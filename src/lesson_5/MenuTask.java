package lesson_5;

import java.util.Scanner;

public class MenuTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vibor;

        do {
            System.out.printf("\n");
            System.out.println("========================================");
            System.out.println("             МЕНЮ ВЫЧИСЛЕНИЙ            ");
            System.out.println("========================================");
            System.out.println("1 - Вычислить факториал                 ");
            System.out.println("2 - Возвести число в степень            ");
            System.out.println("0 - Выход                               ");
            System.out.println("----------------------------------------");
            System.out.print("Введите номер операции: ");
            vibor = sc.nextInt();

            if (vibor == 1) {
                System.out.print("\nВведите число: ");
                int n = sc.nextInt();
                long rez = 1;
                for (int i = 1; i <= n; i++) {
                    rez *= i;
                }
                System.out.printf("Результат: "+rez);

            } else if (vibor == 2) {
                System.out.print("\nВведите число: ");
                int osn = sc.nextInt();
                System.out.print("Возвести число в степень: ");
                int st = sc.nextInt();
                long rez = 1;
                for (int i = 1; i <= st; i++) {
                    rez *= osn;
                }
                System.out.printf("Результат: "+rez);

            } else if (vibor != 0) {
                System.out.println("Неверный выбор!");
            }

        } while (vibor != 0);
        System.out.printf("Работа программы завершена");
    }
}
