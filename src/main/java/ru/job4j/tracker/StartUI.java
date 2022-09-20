package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        item.setId(100);
        item.setName("USER");
        System.out.println(item);
    }
}
