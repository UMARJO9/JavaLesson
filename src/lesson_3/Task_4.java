import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите радиус: ");
    double r = scanner.nextDouble();
    double dlina = 2 * Math.PI * r;
    double ploshad = Math.PI * r * r;
    System.out.println("Длина окружности: " + dlina);
    System.out.println("Площадь круга: " + ploshad);
}
