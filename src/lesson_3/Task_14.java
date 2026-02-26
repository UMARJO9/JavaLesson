import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите трёхзначное число: ");
    int chislo = scanner.nextInt();

    int ed1 = chislo % 10;
    int ed2 = (chislo / 10) % 10;
    int ed3 = chislo / 100;

    int obratno = ed1 * 100 + ed2 * 10 + ed3;

    System.out.println("Число наоборот: " + obratno);
}