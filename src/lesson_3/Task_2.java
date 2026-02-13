import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    int n = scanner.nextInt();
    int kvadrat = n * n;
    int kub = n * n * n;
    System.out.println("Число: " + n);
    System.out.println("Квадрат: " + kvadrat);
    System.out.println("Куб: " + kub);
}
