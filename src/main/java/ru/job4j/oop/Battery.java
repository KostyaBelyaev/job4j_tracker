package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery noname = new Battery(60);
        Battery dur = new Battery(35);
        noname.exchange(dur);
        System.out.println(dur.load + " " + noname.load);
    }
}



