package lesson_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner vorid = new Scanner(System.in);
        int ball = 0;
        int raqamiSavol = 1;
        int javob;
        while (raqamiSavol <= 10) {

            if (raqamiSavol == 1) {
                System.out.println("Вопрос 1: Какой тип данных используется для целых чисел в Java?");
                System.out.println("1) String");
                System.out.println("2) int");
                System.out.println("3) double");
                System.out.println("4) boolean");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball+= 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 2) int\n");
                }
            }

            if (raqamiSavol == 2) {
                System.out.println("Вопрос 2: Что выведет System.out.println(2 + 3)?");
                System.out.println("1) 23");
                System.out.println("2) 2 + 3");
                System.out.println("3) 5");
                System.out.println("4) Ошибка");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 3) 5\n");
                }
            }

            if (raqamiSavol == 3) {
                System.out.println("Вопрос 3: Какой оператор используется для сравнения в Java?");
                System.out.println("1) =");
                System.out.println("2) ==");
                System.out.println("3) !=");
                System.out.println("4) ===");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 2) ==\n");
                }
            }

            if (raqamiSavol == 4) {
                System.out.println("Вопрос 4: Как объявить переменную типа String?");
                System.out.println("1) int name = \"Java\";");
                System.out.println("2) String name = \"Java\";");
                System.out.println("3) string name = \"Java\";");
                System.out.println("4) var name = Java;");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 2) String name = \"Java\";\n");
                }
            }

            if (raqamiSavol == 5) {
                System.out.println("Вопрос 5: Что делает оператор %?");
                System.out.println("1) Деление");
                System.out.println("2) Умножение");
                System.out.println("3) Остаток от деления");
                System.out.println("4) Процент от числа");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 3) Остаток от деления\n");
                }
            }

            if (raqamiSavol == 6) {
                System.out.println("Вопрос 6: Какой цикл выполняется пока условие true?");
                System.out.println("1) for");
                System.out.println("2) if");
                System.out.println("3) while");
                System.out.println("4) switch");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 3) while\n");
                }
            }

            if (raqamiSavol == 7) {
                System.out.println("Вопрос 7: Что означает boolean в Java?");
                System.out.println("1) Целое число");
                System.out.println("2) Дробное число");
                System.out.println("3) Строка");
                System.out.println("4) true или false");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 4) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball += 5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 4) true или false\n");
                }
            }

            if (raqamiSavol == 8) {
                System.out.println("Вопрос 8: Как создать объект Scanner для ввода?");
                System.out.println("1) Scanner sc = new Scanner();");
                System.out.println("2) Scanner sc = new Scanner(System.in);");
                System.out.println("3) Scanner sc = Scanner(System.in);");
                System.out.println("4) new Scanner sc(System.in);");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball +=5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 2) Scanner sc = new Scanner(System.in);\n");
                }
            }

            if (raqamiSavol == 9) {
                System.out.println("Вопрос 9: Что выведет: System.out.println(10 / 3)?");
                System.out.println("1) 3.33");
                System.out.println("2) 3");
                System.out.println("3) 4");
                System.out.println("4) 3.0");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 2) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball  +=5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 2) 3\n");
                }
            }

            if (raqamiSavol == 10) {
                System.out.println("Вопрос 10: Какое ключевое слово используется для создания класса?");
                System.out.println("1) new");
                System.out.println("2) void");
                System.out.println("3) class");
                System.out.println("4) public");
                System.out.print("Ваш ответ: ");
                javob = vorid.nextInt();
                if (javob == 3) {
                    System.out.println("Правильно! +5 баллов\n");
                    ball +=5;
                } else {
                    System.out.println("Неправильно! Правильный ответ: 3) class\n");
                }
            }

            raqamiSavol = raqamiSavol + 1;
        }

        System.out.println("Ваш резултат: " + ball + " из 50 баллов");
        vorid.close();
    }
}
