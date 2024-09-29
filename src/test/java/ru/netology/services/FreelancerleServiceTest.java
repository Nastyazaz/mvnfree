package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FreelancerleServiceTest {

    @Test
    void testCalculateMonthsOfRest() {
        FreelancerService service = new FreelancerService();

        // Пример 2
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expectedResult = 2;
        int actualResult = FreelancerService.calculate (income, expenses, threshold);
        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    void testCalculateMonthsfRest() {
        FreelancerService service = new FreelancerService();

        // Пример 1
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expectedResult = 3;
        int actualResult = FreelancerService.calculate (income, expenses, threshold);
        Assertions.assertEquals(expectedResult, actualResult);


    }
}
