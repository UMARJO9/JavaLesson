import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    double x = scanner.nextDouble();
    System.out.print("Введите второе число: ");
    double y = scanner.nextDouble();
    System.out.print("Введите третье число: ");
    double z = scanner.nextDouble();

    double srednee = (x + y + z) / 3;
    System.out.println("Среднее арифметическое: " + srednee);
}
