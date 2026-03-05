package lesson_5;

import java.util.Scanner;

public class SodaAdadN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int adad = sc.nextInt();
        int  nAdad = 0;
        boolean sodda = true;
        for (int i = 2; i < adad; i++) {
            if (adad % i == 0) {
                sodda = false;
            }
        }

        System.out.println(sodda);

        System.out.println("2 до " + adad);
        for (int n = 2; n <= adad; n++) {
            boolean soddaN = true;

            for (int i = 2; i < n /2 ; i++) {
                if (n % i == 0) {
                    soddaN = false;
                }
            }

            if (soddaN == true) {
                System.out.print(n + " ");
                nAdad+=1;
            }
        }
        System.out.println();
        System.out.println("Колов простых чисел :"+nAdad);
    }
}
