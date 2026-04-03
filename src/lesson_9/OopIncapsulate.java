package lesson_9;

// === Родительский класс — Животное ===
class Animal {
    private String name;        // private — доступно только внутри этого класса
    private int age;
    protected String sound;     // protected — доступно в этом классе и в подклассах

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    // геттеры — дают доступ к private полям снаружи
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // сеттер с проверкой — нельзя поставить отрицательный возраст
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка: возраст не может быть отрицательным");
        }
    }

    public void speak() {
        System.out.println(name + " говорит: " + sound);
    }

    public void info() {
        System.out.println("Животное: " + name + ", возраст: " + age);
    }
}

// === Подкласс — Собака ===
class Dog extends Animal {
    private String breed; // порода — private, доступ только через геттер

    public Dog(String name, int age, String breed) {
        super(name, age, "Гав-гав!");  // sound — protected, задаём через родителя
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // переопределяем метод родителя
    @Override
    public void info() {
        super.info(); // вызываем info() из Animal
        System.out.println("Порода: " + breed);
    }

    public void fetch() {
        System.out.println(getName() + " приносит палку!");
    }
}

// === Подкласс — Кошка ===
class Cat extends Animal {
    private boolean isHomeCat; // домашняя или уличная

    public Cat(String name, int age, boolean isHomeCat) {
        super(name, age, "Мяу!");
        this.isHomeCat = isHomeCat;
    }

    public boolean isHomeCat() {
        return isHomeCat;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(isHomeCat ? "Домашняя кошка" : "Уличная кошка");
    }

    public void purr() {
        System.out.println(getName() + " мурлыкает...");
    }
}

// === Подкласс собаки — Щенок (наследует Dog) ===
class Puppy extends Dog {
    private boolean isTrained;

    public Puppy(String name, int age, String breed) {
        super(name, age, breed);
        this.isTrained = false;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void train() {
        isTrained = true;
        // sound — protected, поэтому доступен из подкласса
        sound = "ГАВ!";
        System.out.println(getName() + " обучен! Теперь лает громче.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Обучен: " + (isTrained ? "да" : "нет"));
    }
}

// === Главный класс ===
class OopIncapsulate {
    public static void main(String[] args) {

        System.out.println("=== Собака ===");
        Dog dog = new Dog("Рекс", 5, "Овчарка");
        dog.info();
        dog.speak();
        dog.fetch();

        System.out.println("\n=== Кошка ===");
        Cat cat = new Cat("Мурка", 3, true);
        cat.info();
        cat.speak();
        cat.purr();

        System.out.println("\n=== Щенок ===");
        Puppy puppy = new Puppy("Бобик", 1, "Лабрадор");
        puppy.info();
        puppy.speak();
        puppy.train();   // обучаем
        puppy.speak();    // теперь лает громче

        System.out.println("\n=== Инкапсуляция ===");
        dog.setAge(6);          // OK — через сеттер
        dog.setAge(-3);         // Ошибка — сеттер не пропустит
        System.out.println(dog.getName() + " теперь " + dog.getAge() + " лет");

        // dog.name = "Шарик";  // ОШИБКА — name это private, нельзя напрямую
        // dog.age = -100;      // ОШИБКА — age это private, защищён от такого

        System.out.println("\n=== Полиморфизм ===");
        Animal[] animals = { dog, cat, puppy }; // массив родительского типа
        for (Animal a : animals) {
            a.info();
            a.speak();
            System.out.println("---");
        }
    }
}
