package ru.job4j.oop;

public class Airplane implements Vechicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }
}
