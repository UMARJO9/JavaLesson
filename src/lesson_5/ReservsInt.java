package lesson_5;

import java.util.Scanner;

public class ReservsInt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IO.print("N : ");
        int n = scanner.nextInt();
        int x = 0;
        String len = String.valueOf(n);
        for (int i = 1; i<=len.length();i++){
            x = x * 10 + n % 10;
            n /= 10;
        }
//        while (n != 0){
//            x = x * 10 + n % 10;
//            n /= 10;
//        }

        IO.println("N : " + x);
    }
}
