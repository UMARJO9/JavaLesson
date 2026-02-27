package lesson_4;

import java.util.Scanner;

public class ForOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = 0;
        for (int i = 1; i<=12; i++){
            s+=500;
        }
        System.out.printf("Price in 12 month: %d\n",s);

        int pin = 1234;
        while(true){
            System.out.print("input Pincode 4numbers: ");
            int kod = sc.nextInt();
            if (kod == pin)
                break;
        }

        int sm=0;

        do{
            System.out.print("Input price product: ");
            int p = sc.nextInt();
            if (p==0){
                System.out.printf("Summa: %d\n",sm);
                break;
            }
            sm+=p;
        }

        while(sm>0);

    }
}
