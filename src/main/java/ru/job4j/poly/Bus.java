package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toGo() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int numberOfPassenfers) {
        System.out.println("Пассажиров в автобусе: " + numberOfPassenfers );
    }

    @Override
    public double refuel(double litersOfFuel) {
        final double costOfOneLiter = 50;
        return costOfOneLiter * litersOfFuel;
    }
}

