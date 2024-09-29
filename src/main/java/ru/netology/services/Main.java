package ru.netology.services;


public class Main {

    public static void main(String[] args) {
        FreelancerService FreelancerService;
        FreelancerService = new FreelancerService();
        int income = 100000 ;
        int expenses = 60000 ;
        int threshold = 150000;
        int months = FreelancerService.calculate ( income, expenses, threshold);
        System.out.println(months);
    }
}

