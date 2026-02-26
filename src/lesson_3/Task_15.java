import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество часов: ");
    int chasi = scanner.nextInt();

    System.out.print("Введите оплату за час: ");
    double oplata = scanner.nextDouble();

    System.out.print("Введите налог (%): ");
    double nalog_procent = scanner.nextDouble();

    double nachisleno = chasi * oplata;
    double summa_naloga = nachisleno * nalog_procent / 100;
    double k_viplate = nachisleno - summa_naloga;

    System.out.println("Начисленная зарплата: " + nachisleno);
    System.out.println("Сумма налога: " + summa_naloga);
    System.out.println("К выплате: " + k_viplate);
}
