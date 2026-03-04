package lesson_5;

import java.util.Scanner;

public class Calculiator {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            IO.print("Знак (+, -, *, /) или 0 для выхода:");
            String znak = sc.next();

            if (znak.equals("0")) break;

            IO.print("A : ");
            double a = sc.nextDouble();
            IO.print("B : ");
            double b = sc.nextDouble();

            double result = 0;
            switch (znak){
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if (b == 0){
                        IO.println("Нельзя делить на 0!");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    IO.println("Неизвестный знак!");
                    continue;
            }

            IO.println("Результат:" + result);
        }
    }
}
