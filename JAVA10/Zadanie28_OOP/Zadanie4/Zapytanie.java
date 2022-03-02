package com.company.JAVA10.Zadanie28_OOP.Zadanie4;

public class Zapytanie {

    private User user;
    private int date;

    public Zapytanie (User user, int date) {
        this.user = user;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Zapytanie{" +
                "user=" + user +
                ", date=" + date +
                '}';
    }
}
