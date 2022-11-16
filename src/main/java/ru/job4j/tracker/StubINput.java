package ru.job4j.tracker;

public class StubINput implements Input {
    private String[] answer;
    private int position = 0;

    public StubINput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String askStr(String question) {
        return answer[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}

