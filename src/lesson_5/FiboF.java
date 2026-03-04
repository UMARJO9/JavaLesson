package lesson_5;

import java.util.Scanner;
import java.util.Set;

public class FiboF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.print("N : ");
        int n = sc.nextInt();
        int fb1 = 1;
        int fb2 = 1;
        while (fb2 < n){
           int temp = fb1 + fb2;
           fb1 = fb2;
           fb2 = temp;
        }
        IO.println(fb2 == n);
    }
}
