void main() {
    Scanner readLine = new Scanner(System.in).useLocale(Locale.US);
    IO.println("Длина первого катета:");
    double a = readLine.nextDouble();
    IO.println("Длина второго катета:");
    double b = readLine.nextDouble();
    double c = Math.sqrt(a * a + b * b);
    double S = (a * b) / 2;
    double P = a + b + c;
    IO.println("Площадь треугольника:"+S);
    IO.println("Периметр треугольника:"+P);
}