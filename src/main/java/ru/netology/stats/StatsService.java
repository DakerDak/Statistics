package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long calcMidlSum(long[] sales) {
        long midlsum = calcSum(sales);
        return midlsum / sales.length;
    }

    public long calcBelowMidlSum(long[] sales) {
        long Month = 0;
        for (long sale : sales) {
            if (sale < calcMidlSum(sales)) {
                Month = Month + 1;
            }
        }
        return Month;
    }


    public long calcMoreMidlSum(long[] sales) {
        long CountMonth = 0;
        for (long sale : sales) {
            if (sale > calcMidlSum(sales)) {
                CountMonth++;
            }
        }
        return CountMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

}



