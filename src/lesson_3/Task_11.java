import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число: ");
    double chislo = scanner.nextDouble();

    System.out.print("Введите процент: ");
    double procent = scanner.nextDouble();

    double rezultat = chislo * procent / 100;

    System.out.println("Результат: " + rezultat);
}
