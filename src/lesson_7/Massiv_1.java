package lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Massiv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tovar = new double[20];
        double summaArray = 0.0;
        int countAvg = 0;
        for (int i = 0; i < 20; i++) {
            IO.print(" ");
            tovar[i] = sc.nextDouble();
            summaArray += tovar[i];
        }
        summaArray /= 20;
        for (int j = 0; j < 20; j++) {
            if (tovar[j] < summaArray) {
                countAvg++;
            }
        }
        IO.println("Summa "+summaArray);
        IO.println("Count "+countAvg);
    }
}
