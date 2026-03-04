package lesson_5;

import java.util.Scanner;

public class ResultS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IO.print("X : ");
        double x = scanner.nextDouble();
        IO.print("N : ");
        int n = scanner.nextInt();
        double s = 0;
        double term = x;
        for (int i = 1; i <= n; i++){
            s += term;
            term *= -x * x / ((2 * i) * (2 * i + 1));
        }
        IO.println("S = " + s);
        IO.print("Sin X :"+Math.sin(x));
    }
}
