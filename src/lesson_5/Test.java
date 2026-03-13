package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner vorid = new Scanner(System.in);
        Random tasoduf = new Random();
        int ball = 0;
        int shumora = 0;
        int javob;
        int savoliTasoduf;
        boolean pursida1 = false;
        boolean pursida2 = false;
        boolean pursida3 = false;
        boolean pursida4 = false;
        boolean pursida5 = false;
        boolean pursida6 = false;
        boolean pursida7 = false;
        boolean pursida8 = false;
        boolean pursida9 = false;
        boolean pursida10 = false;

        System.out.println("=== Тест для  Програмистов ===");
        System.out.println("10 savol, 4 variant javob");
        System.out.println("Har javob durust = 5 ball");
        System.out.println("===========================\n");

        while (shumora < 10) {
            savoliTasoduf = tasoduf.nextInt(10) + 1;

            if (savoliTasoduf == 1 && pursida1 == true) {
                continue;
            }
            if (savoliTasoduf == 2 && pursida2 == true) {
                continue;
            }
            if (savoliTasoduf == 3 && pursida3 == true) {
                continue;
            }
            if (savoliTasoduf == 4 && pursida4 == true) {
                continue;
            }
            if (savoliTasoduf == 5 && pursida5 == true) {
                continue;
            }
            if (savoliTasoduf == 6 && pursida6 == true) {
                continue;
            }
            if (savoliTasoduf == 7 && pursida7 == true) {
                continue;
            }
            if (savoliTasoduf == 8 && pursida8 == true) {
                continue;
            }
            if (savoliTasoduf == 9 && pursida9 == true) {
                continue;
            }
            if (savoliTasoduf == 10 && pursida10 == true) {
                continue;
            }

            shumora = shumora + 1;
            System.out.println("--- Savoli " + shumora + " ---");

            if (savoliTasoduf == 1) {
                pursida1 = true;
                System.out.println("Кадом навъи маълумот барои ададхои бутун дар Java истифода мешавад?");
                System.out.println("1) String");
                System.out.println("2) int");
                System.out.println("3) double");
                System.out.println("4) boolean");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 2) int\n");
                }
            }

            if (savoliTasoduf == 2) {
                pursida2 = true;
                System.out.println("System.out.println(2 + 3) чи чоп мекунад?");
                System.out.println("1) 23");
                System.out.println("2) 2 + 3");
                System.out.println("3) 5");
                System.out.println("4) Хато");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 3) 5\n");
                }
            }

            if (savoliTasoduf == 3) {
                pursida3 = true;
                System.out.println("Кадом оператор барои муқоиса дар Java истифода мешавад?");
                System.out.println("1) =");
                System.out.println("2) ==");
                System.out.println("3) !=");
                System.out.println("4) ===");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 2) ==\n");
                }
            }

            if (savoliTasoduf == 4) {
                pursida4 = true;
                System.out.println("Чи тавр тагйирёбандаи навъи String эълон мекунанд?");
                System.out.println("1) int name = \"Java\";");
                System.out.println("2) String name = \"Java\";");
                System.out.println("3) string name = \"Java\";");
                System.out.println("4) var name = Java;");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 2) String name = \"Java\";\n");
                }
            }

            if (savoliTasoduf == 5) {
                pursida5 = true;
                System.out.println("Оператори % чи кор мекунад?");
                System.out.println("1) Тақсим");
                System.out.println("2) Зарб");
                System.out.println("3) Бақияи тақсим");
                System.out.println("4) Фоиз аз адад");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 3) Бақияи тақсим\n");
                }
            }

            if (savoliTasoduf == 6) {
                pursida6 = true;
                System.out.println("Кадом давр то вақте ки шарт true аст кор мекунад?");
                System.out.println("1) for");
                System.out.println("2) if");
                System.out.println("3) while");
                System.out.println("4) switch");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 3) while\n");
                }
            }

            if (savoliTasoduf == 7) {
                pursida7 = true;
                System.out.println("boolean дар Java чи маъно дорад?");
                System.out.println("1) Ададхои бутун");
                System.out.println("2) Ададхои касри");
                System.out.println("3) Сатр");
                System.out.println("4) true ё false");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 4) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 4) true ё false\n");
                }
            }

            if (savoliTasoduf == 8) {
                pursida8 = true;
                System.out.println("Чи тавр объекти Scanner барои вуруд сохта мешавад?");
                System.out.println("1) Scanner sc = new Scanner();");
                System.out.println("2) Scanner sc = new Scanner(System.in);");
                System.out.println("3) Scanner sc = Scanner(System.in);");
                System.out.println("4) new Scanner sc(System.in);");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 2) Scanner sc = new Scanner(System.in);\n");
                }
            }

            if (savoliTasoduf == 9) {
                pursida9 = true;
                System.out.println("System.out.println(10 / 3) чи чоп мекунад?");
                System.out.println("1) 3.33");
                System.out.println("2) 3");
                System.out.println("3) 4");
                System.out.println("4) 3.0");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 2) 3\n");
                }
            }

            if (savoliTasoduf == 10) {
                pursida10 = true;
                System.out.println("Кадом калимаи калиди барои сохтани синф истифода мешавад?");
                System.out.println("1) new");
                System.out.println("2) void");
                System.out.println("3) class");
                System.out.println("4) public");
                System.out.print("Javobi shumo: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Durust! +5 ball\n");
                    ball = ball + 5;
                } else {
                    System.out.println("Noadurust! Javobi durust: 3) class\n");
                }
            }
        }

        System.out.println("===========================");
        System.out.println("TEST BA OXIR RASID!");
        System.out.println("Natijai shumo: " + ball + " az 50 ball");
        System.out.println("===========================");

        if (ball == 50) {
            System.out.println("Olijanob! Shumo ba hama savolho durust javob doded!");
        } else if (ball >= 40) {
            System.out.println("Khub! Taqriban mukammal!");
        } else if (ball >= 25) {
            System.out.println("Bad nest, vale bojad bisyor kor kuned.");
        } else {
            System.out.println("Bojad bisyor omuzed!");
        }

        vorid.close();
    }
}
