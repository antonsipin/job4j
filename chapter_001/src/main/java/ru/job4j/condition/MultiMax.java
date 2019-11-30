package ru.job4j.condition;

/**
 * Класс MultiMax. Операции сравнения.
 *
 * @author Anton Sipin (anton.sipin@gmail.com)
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        boolean maxFirstOrSecond = (first > second);
        int resultMaxFirstOrSecond = maxFirstOrSecond ? first : second;
        boolean maxFirstOrSecondOrThird = (resultMaxFirstOrSecond > third);
        int resultMaxFirstOrSecondOrThird = maxFirstOrSecondOrThird ? resultMaxFirstOrSecond : third;
        return resultMaxFirstOrSecondOrThird;
    }
}
