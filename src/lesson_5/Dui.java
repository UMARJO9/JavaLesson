package lesson_5;

import java.util.Scanner;

public class Dui {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.print("N : ");
        int n = sc.nextInt();
        String s = "";
        int n1 = n;
        while (n1 > 0){
            s += n1 % 2 ;
            n1 /= 2;
        }

        IO.println(n + " -> " + s);
    }
}
