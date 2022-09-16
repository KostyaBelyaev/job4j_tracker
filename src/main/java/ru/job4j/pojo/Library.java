package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book headFirstJava = new Book("Head First Java", 720);
        Book shildt = new Book("JAVA. Полное руководство", 1488);
        Book cleanCode = new Book("Clean Code", 488);
        Book coreJava = new Book("Java. Библиотека профессионала. Том 1", 864);
        Book[] books = new Book[4];
        books[0] = headFirstJava;
        books[1] = shildt;
        books[2] = cleanCode;
        books[3] = coreJava;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Название книги: " + bk.getName() + "; количество страниц: " + bk.getCountOfPages());
        }
        System.out.println();
        System.out.println("Меняем местами книги 1 и 4");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Название книги: " + bk.getName() + "; количество страниц: " + bk.getCountOfPages());
        }
        System.out.println();
        System.out.println("Выводим книги с названием \"Clean Cdode\"");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName() == "Clean Code") {
                System.out.println("Название книги: " + bk.getName() + "; количество страниц: " + bk.getCountOfPages());
            }
        }
    }

}
