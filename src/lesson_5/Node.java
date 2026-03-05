package lesson_5;

import java.util.Scanner;

public class Node {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        IO.print("N: ");
        int n1 = sc.nextInt();
        IO.print("N2 : ");
        int n2 = sc.nextInt();
        while ( n2 != 0){
            int x = n1 % n2;
            n1 = n2;
            n2 = x;
        }
        IO.print("НОД = "+n1);
    }
}
