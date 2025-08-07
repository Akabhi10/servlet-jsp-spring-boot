package Wiproan;

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    public void eat() {
        System.out.println("Athlete eats a healthy and balanced diet.");
    }

    public void exercise() {
        System.out.println("Athlete exercises every day with intense workouts.");
    }
}

class LazyPerson extends Person {
    public void eat() {
        System.out.println("Lazy person eats junk food and skips meals.");
    }

    public void exercise() {
        System.out.println("Lazy person avoids exercise and prefers lying on the couch.");
    }
}

public class Question21 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazy.eat();
        lazy.exercise();
    }
}
