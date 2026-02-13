import static java.lang.IO.println;

void main() {
    Scanner readLine = new Scanner(System.in).useLocale(Locale.US);
    println("Длина первого катета:");
    double a = readLine.nextDouble();
    println("Длина второго катета:");
    double b = readLine.nextDouble();
    double c = Math.sqrt(a * a + b * b);
    double S = (a * b) / 2;
    double P = a + b + c;
    println("Площадь треугольника:"+S);
}