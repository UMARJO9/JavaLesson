import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите температуру в Цельсиях: ");

    double celsius = scanner.nextDouble();
    double fahrenheit = celsius * 9 / 5 + 32;

    System.out.println("Температура в Фаренгейтах: " + fahrenheit);
}
