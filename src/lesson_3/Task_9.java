import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int a = sc.nextInt();

    System.out.print("Введите второе число: ");
    int b = sc.nextInt();

    System.out.println("До обмена: a = " + a + ", b = " + b);

    int temp = a;
    a = b;
    b = temp;

    System.out.println("После обмена (способ 1): a = " + a + ", b = " + b);

    temp = a;
    a = b;
    b = temp;

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("После обмена (способ 2): a = " + a + ", b = " + b);
}
