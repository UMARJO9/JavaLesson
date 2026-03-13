package lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Masiv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[25];
        int raz = 0;
        for (int i = 0; i < 25; i++) {
            IO.print("Age People " + i + " : ");
            age[i] = sc.nextInt();
        }
        int young = age[0];
        int old = age[0];
        for (int j= 0; j<25; j++){
            if (age[j] > young) old = age[j];
        }
        Arrays.stream(age).sorted();
        raz  = old - young;
        IO.println("Raznitsa :"+raz);
    }
}
