package ru.job4j.oop;

public class Train implements Vechicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }
}
