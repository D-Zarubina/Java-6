package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnalyticsServiceTest {

    @Test
    void shouldCalcTotal(){
        AnalyticsService service = new AnalyticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getTotal(sales);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalcAverageTotal(){
        AnalyticsService service = new AnalyticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageTotal(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldFindMonthMaxSales(){
        AnalyticsService service = new AnalyticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMinSales(){
        AnalyticsService service = new AnalyticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthLowSales(){
        AnalyticsService service = new AnalyticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lowSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthHighSales(){
        AnalyticsService service = new AnalyticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lowSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
