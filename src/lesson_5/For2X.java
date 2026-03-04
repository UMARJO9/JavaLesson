package lesson_5;

import java.util.Scanner;

public class For2X {
    public static void main(String[] args){
        java.util.Scanner scanner = new Scanner(System.in);
        IO.print("A : ");
        int a = scanner.nextInt();
        IO.print("B : ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            for (int j = 1; j <= i; j++){
                IO.print(i + " ");
            }
            IO.println("");
        }
    }
}
