import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите цену товара: ");
    double cena = scanner.nextDouble();

    System.out.print("Введите количество: ");
    int kolichestvo = scanner.nextInt();

    double summa = cena * kolichestvo;
    double skidka = summa * 0.1;
    double itog = summa - skidka;

    System.out.println("Общая стоимость: " + summa);
    System.out.println("Скидка 10%: " + skidka);
    System.out.println("К оплате: " + itog);
}
