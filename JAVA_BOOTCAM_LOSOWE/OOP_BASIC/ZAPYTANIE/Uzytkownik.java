package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ZAPYTANIE;


public class Uzytkownik {

    private String name;
    private String emailAdress;


    public Uzytkownik(String name, String emailAdress) {
        this.name = name;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
