package lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Massiv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[25];
        for (int i = 0; i < 25; i++) {
            IO.print("Age People " + i + " : ");
            age[i] = sc.nextInt();
        }
        int[] sorted = Arrays.stream(age).sorted().toArray();
        IO.println("Са: " + sorted[24]);
        IO.println("Vtoroy samiy zreliy: " + sorted[23]);
    }
}
