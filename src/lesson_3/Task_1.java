import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ваше имя: ");
    String name = scanner.nextLine();
    System.out.println("Здравствуйте, " + name + "!");
}
