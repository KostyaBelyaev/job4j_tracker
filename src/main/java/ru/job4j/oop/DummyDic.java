package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String unknow = "Неизвестное слово " + eng;
        return unknow;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String words = word.engToRus("smile");
        System.out.println(words);
    }
}
