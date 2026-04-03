package lesson_9;

import lesson_5.Calculiator;

public class Peregruzka {
    public static void main(String[] args) {
        Calculiatore cal = new Calculiatore();
        IO.println(cal.suma(1,4));
        IO.println(cal.suma(1.1,4.3));
        IO.println(cal.suma(1.3,4,5.2));
    }
}

class Calculiatore {
    int suma(int x, int y) {
        return x + y;
    }

    double suma(double x, double y) {
        return x + y;
    }

    double suma(double x, double y, double z) {
        return x + y + z;
    }
}
