package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static double dollarToRuble(double value) {
        return value * 60;
    }

    public static double euroToRuble(double value) {
        return value * 70;
    }

    public static void main(String[] args) {
        double euro = rubleToEuro(140);
        double dollar = rubleToDollar(140);
        double rublFromDollar = dollarToRuble(140);
        double rublFromEuro = euroToRuble(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 dollars are " + rublFromDollar + " rubles.");
        System.out.println("140 euro are " + rublFromEuro + " rubles.");
    }
}
