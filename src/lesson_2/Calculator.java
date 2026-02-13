import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    double a = scanner.nextDouble();
    System.out.print("Введите второе число: ");
    double b = scanner.nextDouble();
    double sum = a + b;
    double minus = a - b;
    double zarb = a * b;
    double taksim = a / b;
    System.out.println("Сложение: " + sum);
    System.out.println("Вычитание: " + minus);
    System.out.println("Умножение: " + zarb);
    System.out.println("Деление: " + taksim);
}
