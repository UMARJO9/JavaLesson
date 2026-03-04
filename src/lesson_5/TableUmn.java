package lesson_5;

import java.util.Scanner;

public class TableUmn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          ТАБЛИЦА ПИФАГОРА              ");
        System.out.println("========================================");
        System.out.print("До какого числа: ");
        int n = sc.nextInt();
        System.out.println("========================================");

        System.out.printf("%5s|", "x");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println("-");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println("========================================");
    }
}
