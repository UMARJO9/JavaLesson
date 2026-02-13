import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите возраст в годах: ");
    int vozrast = scanner.nextInt();

    int dni = vozrast * 365;

    System.out.println("Возраст в днях: " + dni);
}
