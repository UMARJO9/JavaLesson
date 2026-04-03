package lesson_9;

class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println("  -> " + num);
        }
    }

    String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+7-999-111-11-11", "iPhone 15", 171.0);
        Phone phone2 = new Phone("+7-999-222-22-22", "Samsung S24");

        Phone phone3 = new Phone();
        phone3.number = "+7-999-333-33-33";
        phone3.model = "Xiaomi 14";
        phone3.weight = 193.0;

        System.out.println("=== Телефон 1 ===");
        System.out.println("Модель: " + phone1.model);
        System.out.println("Номер: " + phone1.number);
        System.out.println("Вес: " + phone1.weight + " г");

        System.out.println("\n=== Телефон 2 ===");
        System.out.println("Модель: " + phone2.model);
        System.out.println("Номер: " + phone2.number);
        System.out.println("Вес: " + phone2.weight + " г");

        System.out.println("\n=== Телефон 3 ===");
        System.out.println("Модель: " + phone3.model);
        System.out.println("Номер: " + phone3.number);
        System.out.println("Вес: " + phone3.weight + " г");

        System.out.println("\n=== Звонки (имя) ===");
        phone1.receiveCall("Мама");
        phone2.receiveCall("Друг");
        phone3.receiveCall("Босс");

        System.out.println("\n=== Звонки (имя + номер) ===");
        phone1.receiveCall("Мама", "+7-900-000-00-01");
        phone2.receiveCall("Друг", "+7-900-000-00-02");
        phone3.receiveCall("Босс", "+7-900-000-00-03");

        System.out.println("\n=== sendMessage ===");
        phone1.sendMessage("+7-999-222-22-22", "+7-999-333-33-33");
        phone2.sendMessage("+7-999-111-11-11");
        phone3.sendMessage("+7-999-111-11-11", "+7-999-222-22-22", "+7-999-444-44-44");

        System.out.println("\n=== getNumber() ===");
        System.out.println("Номер phone1: " + phone1.getNumber());
        System.out.println("Номер phone2: " + phone2.getNumber());
        System.out.println("Номер phone3: " + phone3.getNumber());
    }
}
