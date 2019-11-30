package ru.job4j.converter;

/**
 * Класс Converter. Арифметические операции. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class Converter {

    public static double toEuro(double value) {
        return value / 70;
    }
    public static double toDollar(double value) {
        return value / 60;
    }
    public static double dollarToRuble(double value) {
        return value * 60;
    }
    public static double euroToRuble(double value) {
        return value * 70;
    }

    /**
     * Метод Main. Вывод результатов в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        double euro = toEuro(140);
        double dollar = toDollar(140);
        double fromDollar = dollarToRuble(140);
        double fromEuro = euroToRuble(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 dollars are " + fromDollar + " rubles.");
        System.out.println("140 euro are " + fromEuro + " rubles.");
    }
}
