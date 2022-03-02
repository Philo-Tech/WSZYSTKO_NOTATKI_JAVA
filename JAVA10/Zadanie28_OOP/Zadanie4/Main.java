package com.company.JAVA10.Zadanie28_OOP.Zadanie4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        User user = new User("Jan", "Kowalski", "938493849");


        Zapytanie zapytanie = new Zapytanie(user,211110);
        Zapytanie zapytanie1 = new Zapytanie(user,211109);
        Zapytanie zapytanie2 = new Zapytanie(user,211107);
        Zapytanie zapytanie3 = new Zapytanie(user,211120);

        int dateNow = 211121;

        List<Zapytanie> list = new ArrayList<>();
        list.add(zapytanie);
        list.add(zapytanie1);
        list.add(zapytanie2);
        list.add(zapytanie3);

        for (Zapytanie z : list){
            if ((dateNow - z.getDate()) <= 14) System.out.println(z +" Pesel: "+getUserPesel(z));
        }

    }
    public static String getUserPesel(Zapytanie zapytanie){
        return zapytanie.getUser().getPesel();
    }
}
