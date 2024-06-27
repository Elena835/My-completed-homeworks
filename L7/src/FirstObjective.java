class Animal {
    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

class Dog extends Animal {
    private static int count = 0;

    public Dog() {
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать такое расстояние");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть такое расстояние");
        }
    }

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
    private static int count = 0;
    private boolean fullness = false;

    public Cat() {
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такое расстояние");
        }
    }

    public void eat(int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Нельзя покушать отрицательное количество еды");
        } else {
            System.out.println("Кот поел");
            fullness = true;
        }
    }

    public boolean isFull() {
        return fullness;
    }

    public static int getCount() {
        return count;
    }
}

public class FirstObjective {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(300);
        dog.swim(5);

        cat.run(150);
        cat.swim(5);

        System.out.println("Количество созданных собак: " + Dog.getCount());
        System.out.println("Количество созданных котов: " + Cat.getCount());

        cat.eat(10);

        System.out.println("Кот сыт: " + cat.isFull());
    }
}
