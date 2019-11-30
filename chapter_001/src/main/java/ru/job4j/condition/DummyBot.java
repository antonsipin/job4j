package ru.job4j.condition;

/**
 * Класс DummyBot. Операции сравнения. Вывод результатов в консоль.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            System.out.println(rsl);
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
            System.out.println(rsl);
        }
        return rsl;
    }
    /**
     * Метод Main. Вывод в консоль.
     *
     * @author Anton Sipin (anton.sipin@gmail.com)
     */
    public static void main(String[] args) {
        answer("Привет, Бот.");
    }
}