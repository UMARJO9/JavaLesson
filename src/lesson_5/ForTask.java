package lesson_5;

public class ForTask {
    public static void main(String[] args) {
        for (int i = 1; i <=10;i++){
            if (i == 5) break;
            if ( i == 9) continue;
            IO.println(i);
        }
    }
}