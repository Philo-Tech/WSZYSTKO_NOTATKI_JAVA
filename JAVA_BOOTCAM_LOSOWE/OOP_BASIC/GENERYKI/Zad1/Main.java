package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.GENERYKI.Zad1;

public class Main {
    public static void main(String[] args) {

        EntryData<Integer> entryData = new EntryData<>(5);
        EntryData<String> entryData1 = new EntryData<>("5");

        System.out.println(entryData.getEntryData());
        System.out.println(entryData1.getEntryData());

    }
}
