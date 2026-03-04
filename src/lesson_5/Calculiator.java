package lesson_5;

public class Calculiator {
    public static void  main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true){
            IO.print("Znak (+, -, *, /) ili 0 dlya vyhoda: ");
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
                        IO.println("Nelzya delit na 0!");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    IO.println("Neizvestny znak!");
                    continue;
            }

            IO.println("Result : " + result);
        }
    }
}
