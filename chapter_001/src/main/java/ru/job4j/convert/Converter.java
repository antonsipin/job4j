package ru.job4j.convert;

public class Converter {


    public static double rubleToEuro(int value) {
        return value / 70;
    }


    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expectedRubleToEuro = 2;
        double expectedRubleToDollar = 2.3333333333333335;
        double outRubleToEuro = rubleToEuro(in);
        double outRubleToDollar = rubleToDollar(in);
        boolean passedExpectedRubleToEuro = expectedRubleToEuro == outRubleToEuro;
        boolean passedExpectedRubleToDollar = expectedRubleToDollar == outRubleToDollar;
        double euro = rubleToEuro(140);
        double dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro. + Test result : " + passedExpectedRubleToEuro);
        System.out.println("140 rubles are " + dollar + " euro. + Test result : " + passedExpectedRubleToDollar);
    }
}
