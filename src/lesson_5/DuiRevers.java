package lesson_5;

import java.util.Scanner;

public class DuiRevers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.print("Binary : ");
        int n = sc.nextInt();

        int suma = 0;
        int x = 1;
        while (n > 0){
            suma += (n % 10) * x;
            n /= 10;
            x *= 2;
        }

        IO.println("" + suma);
    }
}
