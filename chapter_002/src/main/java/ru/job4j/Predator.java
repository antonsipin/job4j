package ru.job4j;

import ru.job4j.Animal;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }
}
