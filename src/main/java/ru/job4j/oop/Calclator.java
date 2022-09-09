package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int sum(int a) {
        return a + x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public static int dif(int a) {
        return  a - x;
    }

    public int devide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + dif(a) + devide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = dif(10);
        System.out.println(rsl);
        rsl = calculator.sum(7);
        System.out.println(rsl);
        rsl = calculator.multiply(4);
        System.out.println(rsl);
        rsl = calculator.devide(20);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(5);
        System.out.println(rsl);
    }
}
