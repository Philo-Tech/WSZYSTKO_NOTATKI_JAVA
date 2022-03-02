package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad4;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker(12.500);
        Worker worker2 = new Worker(13.000);
        System.out.println(worker1);

        Company company = new Company("handlowa","wawa",5);
        company.addWorker(worker1);
        company.addWorker(worker2);
        System.out.println(company.getMonthlyPaymantForWrokers() + " " +company);
        System.out.println("biggest salary" +company.getBiggestSalary(company.getWorkers()));
    }
}
