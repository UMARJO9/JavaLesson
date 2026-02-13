import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите целое число: ");
    int n = scanner.nextInt();
    int kvadrat = (int) Math.pow(n,2);
    int kub = (int) Math.pow(n,3);
    System.out.println("Число: " + n);
    System.out.println("Квадрат: " + kvadrat);
    System.out.println("Куб: " + kub);
}
