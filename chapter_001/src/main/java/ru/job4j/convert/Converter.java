package ru.job4j.convert;

/**
 * Класс Converter. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Converter {
    public static double toEuro(int value) {
        return value / 70;
    }
    public static double toDollar(double value) {
        return value / 60;
    }

    /**
     * Метод Main. Вывод результатов в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        int in = 140;
        int euro1 = 2;
        double dollar1 = 2.3333333333333335;
        double toEuro = toEuro(in);
        double toDollar = toDollar(in);
        boolean passEuro = euro1 == toEuro;
        boolean passDollar = dollar1 == toDollar;
        double euro = toEuro(140);
        double dollar = toDollar(140);
        System.out.println("140 rubles are " + euro + " euro. + Test result : " + passEuro);
        System.out.println("140 rubles are " + dollar + " euro. + Test result : " + passDollar);
    }
}
