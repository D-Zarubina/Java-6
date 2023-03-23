package ru.netology.stats;

public class AnalyticsService {

    public int getTotal(int[]sales){
        int total = 0;

        for (int t: sales) {
            total += t;
        }
        return total;
    }

    public int getAverageTotal(int[] sales){
        int averTotal = getTotal(sales) / sales.length;
        return averTotal;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowSales(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < getAverageTotal(sales)) {
                month++;
            }
        }
        return month;
    }

    public int highSales(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale > getAverageTotal(sales)) {
                month++;
            }
        }
        return month;
    }
}
