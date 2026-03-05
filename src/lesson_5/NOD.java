package lesson_5;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner vorid = new Scanner(System.in);

        System.out.print(" N1 :");
        int a = vorid.nextInt();
        System.out.print("Adadi duyum vorid kuned: ");
        int b = vorid.nextInt();

        int kopiya_a = a;
        int kopiya_b = b;

        while (b != 0) {
            int ostatok = a % b;
            a = b;
            b = ostatok;
        }

        System.out.println("NOD(" + kopiya_a + ", " + kopiya_b + ") = " + a);

        vorid.close();
    }
}
