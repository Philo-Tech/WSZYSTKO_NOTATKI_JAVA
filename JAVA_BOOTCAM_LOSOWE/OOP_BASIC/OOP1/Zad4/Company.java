package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad4;

import java.util.Arrays;

public class Company {

    private String name;
    private String residence;
    //private int workerCount;  -> potrzebujemy jej tylko raz przy tworzeniu firmy (do podania wielkosci tablicy zawierającej pracowników), żeby podać liczbe pracownikow w konstruktorze klasy
    private Worker[] workers;

    public Company(String name, String residence, int workerCount) {
        this.name = name;
        this.residence = residence;
        workers = new Worker[workerCount];
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public boolean addWorker(Worker worker) { // boolean poinformuje nas, czy pracownik został dodany
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = worker;
                return true;
            }
        }
        return false;
    }

    public double getMonthlyPaymantForWrokers() {
        double sum = 0;
        for (Worker worker : workers) {
            if (worker != null)
                sum += worker.getSalary();
        }
        return sum;
    }

    public Worker getBiggestSalary(Worker[] workers) {
        Worker worker2 = new Worker();
        double temp = 0;
        for (Worker worker1 : workers) {

            if (worker1 != null) {
                temp = worker1.getSalary();
                if (temp > worker1.getSalary())
                    temp = worker1.getSalary();
                worker2 = worker1;
            }
        }
        return worker2;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", residence='" + residence + '\'' +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
