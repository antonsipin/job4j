package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double amountGiven = 0.0; // Сумма, которую отдали
        while (amountGiven < amount) {
            // Вычисляем сумму процентов на текущий год
            double yearPercent = ((amount - amountGiven) * percent) / 100;
            // Заплатили сумму вместе с процентами за год
            amountGiven += salary - yearPercent;
            year++;
            if (year > 100) {
                break;
            }
        }
        return year;
    }
}
