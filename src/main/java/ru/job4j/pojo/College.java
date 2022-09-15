package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Беляев");
        student.setName("Константин");
        student.setPatronymic("Сергеевич");
        student.setGroup(13262);
        student.setCreated(new Date());
        String lc = System.lineSeparator();
        System.out.println("Фамилия: " + student.getSurname() + lc
                            + "Имя: " + student.getName() + lc
                            + "Отчество: " + student.getPatronymic() + lc
                            + "Группа: " + student.getGroup() + lc
                            + "Дата поступления: " + student.getCreated());
    }
}
