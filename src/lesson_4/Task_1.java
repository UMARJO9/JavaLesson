import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите номер месяца (1-12): ");
    int mesyac = scanner.nextInt();

    switch (mesyac) {
        case 12, 1, 2 -> System.out.println("Зима");
        case 3, 4, 5 -> System.out.println("Весна");
        case 6, 7, 8 -> System.out.println("Лето");
        case 9, 10, 11 -> System.out.println("Осень");
        default -> System.out.println("Некорректный номер месяца!");
    }
}
