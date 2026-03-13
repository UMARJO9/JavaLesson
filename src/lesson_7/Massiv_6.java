package lesson_7;

import java.util.Random;

public class Massiv_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] books = new int[35];
        int summa = 0;
        for (int i = 0; i < books.length; i++) {
            books[i] = random.nextInt(1000, 10000);
            summa += books[i];
            IO.println(" " + books[i]);
        }
        if (summa >= 100000 && summa <= 999999) IO.println(true); else IO.println(false);
    }
}
