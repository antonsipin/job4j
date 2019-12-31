package ru.job4j.poly;

public class Bus implements Transport {
    double cost = 45.5;

    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void people(int pass) {
        System.out.println("Количество пассажиров: " + pass);
    }

    @Override
    public double fillUp(int liters) {
        double price = liters * cost;
        System.out.println("Цена " + "за " + liters + " литров: " + price);
        return price;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.people(100);
        bus.fillUp(50);
    }
}
