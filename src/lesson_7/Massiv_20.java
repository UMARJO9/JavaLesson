package lesson_7;

import java.util.Random;

public class Massiv_20 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        int[] chte = new int[10];
        int[] nechte = new int[10];

        int indexchte = 0;
        int oi = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100, 1000);
            if (i % 2 == 0) {
                chte[indexchte] = array[i];
                indexchte++;
            } else {
                nechte[oi] = array[i];
                oi++;
            }
        }

        System.out.print("Основной массив: ");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");

        System.out.print("\nЧётные индексы:  ");
        for (int i = 0; i < chte.length; i++) System.out.print(chte[i] + " ");

        System.out.print("\nНечётные индексы: ");
        for (int i = 0; i < nechte.length; i++) System.out.print(nechte[i] + " ");
    }
}
