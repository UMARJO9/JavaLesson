import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество секунд: ");
    int vsego = scanner.nextInt();

    int chasi = vsego / 3600;
    int minuti = (vsego % 3600) / 60;
    int sekundi = vsego % 60;

    System.out.println("Часы: " + chasi);
    System.out.println("Минуты: " + minuti);
    System.out.println("Секунды: " + sekundi);
}
