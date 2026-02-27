package lesson_4;

import java.util.Locale;
import java.util.Scanner;

class Task_1 {
    void main() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

        IO.print("Введите номер месяца (1-12): ");
        int mesyac = scanner.nextInt();

        switch (mesyac) {
            case 12, 1, 2 -> IO.println("Зима");
            case 3, 4, 5 -> IO.println("Весна");
            case 6, 7, 8 -> IO.println("Лето");
            case 9, 10, 11 -> IO.println("Осень");
            default -> IO.println("Некорректный номер месяца!");
        }
    }
}
