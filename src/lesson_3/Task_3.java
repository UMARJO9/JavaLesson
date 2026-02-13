import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите сторону a: ");
    double a = scanner.nextDouble();
    System.out.print("Введите сторону b: ");
    double b = scanner.nextDouble();
    double perimetr = 2 * (a + b);
    double ploshad = a * b;
    System.out.println("Периметр: " + perimetr);
    System.out.println("Площадь: " + ploshad);
}
