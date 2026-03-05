package lesson_5;

import java.util.Scanner;

public class NaborN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;
        int n;
        do {
            IO.print("N : ");
            n = sc.nextInt();
            if (n > 0) summa += n;
        } while (n != 0);
        IO.println("Summa "+ summa);
    }
}
