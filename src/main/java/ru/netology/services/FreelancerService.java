package ru.netology.services;

public class FreelancerService {
    public static int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдых
                money -= expenses;
                money = money / 3; 
                if (money <= 0) {
                    break;
                }
                counter++;
            } else {
                // работа
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}