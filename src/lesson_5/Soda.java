package lesson_5;

import java.util.Scanner;

public class Soda {
    public static void main() {

        Scanner vorid = new Scanner(System.in);

        System.out.print("N: ");
        int adad = vorid.nextInt();

        boolean sodda = true;

        if (adad <= 1) {
            sodda = false;
        }

        for (int i = 2; i < adad; i++) {
            if (adad % i == 0) {
                sodda = false;
            }
        }
        if (sodda == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
