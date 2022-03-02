package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.Zadanie2;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("marcin","jakiś", "3434343434");
        osoba.setImie("Marcin");
        System.out.println(osoba.getImie());

        Employer base = new Employer();
        Employer employer = base.createNewEmpouer("jakis","jakis","9878679",10,32);
        base.getSalaryPerYear(employer);
    }
}
