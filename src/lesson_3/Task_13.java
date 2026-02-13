import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите целое число: ");
    int chislo = scanner.nextInt();

    int poslednyaya = chislo % 10;

    System.out.println("Последняя цифра: " + poslednyaya);
}
