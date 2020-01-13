package ru.job4j.stragery;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +" + '\r' + '\n');
        pic.append(" +   +" + '\r' + '\n');
        pic.append("+     +" + '\r' + '\n');
        pic.append(" +++++" + '\r' + '\n');
        return pic.toString();
    }
}
