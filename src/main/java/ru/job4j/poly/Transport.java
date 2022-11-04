package ru.job4j.poly;

public interface Transport {
    void toGo();
    void passengers(int numberOfPassenfers);
    double refuel(double litersOfFuel);
}
