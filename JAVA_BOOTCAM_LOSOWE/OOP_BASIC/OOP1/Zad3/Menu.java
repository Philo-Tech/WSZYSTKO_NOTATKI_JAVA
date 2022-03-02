package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.OOP1.Zad3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {

    private Scanner scanner;
    private Mem mem;

    public Menu(){
        scanner = new Scanner(System.in);
    }

    public void printMenu(){
        System.out.println("Witaj w memowni! ");

        String answer;
        do {
            System.out.println("Wybierz: ");
            answer = scanner.nextLine();
            validateAnswer(answer);
        }while (!answer.equals("exit"));

    }

    private void validateAnswer(String answer) {

        switch (answer){
            case "1":{
                addMem();
                break;
            }
            case "2":{
                printMem();
                break;
            }
            default:{
                System.out.println("nie znam takiej komendy!");
            }
        }
    }


    private void printMem(){
        if (mem!=null){
            System.out.println(mem.toString());
        }else
            System.out.println("Najpierw zapisz mema...");
    }

    private void addMem() {
        System.out.println("Podaj dane mema");
        Mem mem = new Mem();
        System.out.println("podaj nazwe");
        mem.setName(scanner.nextLine());

        System.out.println("podaj opis");
        mem.setDescription(scanner.nextLine());

        System.out.println("czy ulubiony?");
        mem.setFavorite(scanner.nextLine().equalsIgnoreCase("tak"));

        System.out.println("podaj url");
        String url= scanner.nextLine();

        if (!Pattern.matches("https?://.+", url)){
            System.out.println("niepoprawny adres URL");
            return;
        }
        mem.setUrl(url);
        this.mem=mem;
    }


}
