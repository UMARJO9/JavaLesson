package lesson_9;

import java.util.Scanner;

class Question {
    String text;
    String[] options;
    int correctAnswer; // номер правильного ответа (1-4)

    Question(String text, String[] options, int correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void show(int number) {
        System.out.println("\nВопрос " + number + ": " + text);
        for (int i = 0; i < options.length; i++) {
            System.out.println("  " + (i + 1) + ") " + options[i]);
        }
    }

    boolean check(int answer) {
        return answer == correctAnswer;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("Какой тип данных используется для целых чисел в Java?",
                new String[]{"String", "int", "double", "boolean"}, 2),

            new Question("Что выведет: System.out.println(10 / 3)?",
                new String[]{"3.33", "3", "3.0", "Ошибка"}, 2),

            new Question("Какое ключевое слово создаёт объект?",
                new String[]{"class", "void", "new", "static"}, 3),

            new Question("Какой метод запускает программу в Java?",
                new String[]{"start()", "run()", "main()", "init()"}, 3),

            new Question("Что означает ООП?",
                new String[]{
                    "Объектно-ориентированное программирование",
                    "Общее описание программы",
                    "Операционная обработка потоков",
                    "Основы обработки памяти"
                }, 1),

            new Question("Какой оператор сравнивает два значения?",
                new String[]{"=", "==", "!=", ":"}, 2),

            new Question("Что такое массив?",
                new String[]{
                    "Переменная",
                    "Метод",
                    "Набор элементов одного типа",
                    "Класс"
                }, 3),

            new Question("Какой цикл выполняется хотя бы один раз?",
                new String[]{"for", "while", "do-while", "foreach"}, 3),

            new Question("Как объявить строку в Java?",
                new String[]{
                    "string s = \"hi\";",
                    "String s = \"hi\";",
                    "str s = \"hi\";",
                    "Text s = \"hi\";"
                }, 2),

            new Question("Что делает ключевое слово return?",
                new String[]{
                    "Создаёт объект",
                    "Завершает программу",
                    "Возвращает значение из метода",
                    "Объявляет переменную"
                }, 3)
        };

        System.out.println("=== ТЕСТ ПО JAVA ===");
        System.out.println("Всего вопросов: " + questions.length);
        System.out.println("Выберите вариант ответа (1-4)");

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            questions[i].show(i + 1);
            System.out.print("Ваш ответ: ");

            int answer = 0;
            while (answer < 1 || answer > 4) {
                if (scanner.hasNextInt()) {
                    answer = scanner.nextInt();
                    if (answer < 1 || answer > 4) {
                        System.out.print("Введите число от 1 до 4: ");
                    }
                } else {
                    scanner.next();
                    System.out.print("Введите число от 1 до 4: ");
                }
            }

            if (questions[i].check(answer)) {
                System.out.println("✓ Правильно!");
                score++;
            } else {
                System.out.println("✗ Неправильно. Правильный ответ: " + questions[i].correctAnswer);
            }
        }

        System.out.println("\n=== РЕЗУЛЬТАТ ===");
        System.out.println("Правильных ответов: " + score + " из " + questions.length);

        int percent = score * 100 / questions.length;
        if (percent >= 90) {
            System.out.println("Отлично!");
        } else if (percent >= 70) {
            System.out.println("Хорошо!");
        } else if (percent >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Нужно подучить материал");
        }

        scanner.close();
    }
}
