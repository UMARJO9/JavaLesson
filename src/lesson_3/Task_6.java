import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int a = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int b = scanner.nextInt();
    int delenie = a / b;
    int ostatok = a % b;
    System.out.println("Результат деления: " + delenie);
    System.out.println("Остаток: " + ostatok);
}
