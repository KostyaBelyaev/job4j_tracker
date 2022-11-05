package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vechicle airpalneOne = new Airplane();
        Vechicle airplaneTwo = new Airplane();
        Vechicle trainOne = new Train();
        Vechicle trainTwo = new Train();
        Vechicle busOne = new Bus();
        Vechicle busTwo = new Bus();

        Vechicle[] vechicles = new Vechicle[]{airpalneOne, airplaneTwo, trainOne, trainTwo, busOne, busTwo};
        for (Vechicle vechicle : vechicles) {
            vechicle.move();
        }
    }
}
