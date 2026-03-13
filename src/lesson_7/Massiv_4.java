package lesson_7;

import java.util.Scanner;

public class Massiv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int max = number[0];
        int s = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            if (number[i] >= max) {
                max = number[i];
                s = i;
            }
        }
        IO.println("Max index = " + s + " number :" + max);
    }
}
