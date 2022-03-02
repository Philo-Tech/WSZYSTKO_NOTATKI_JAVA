package com.company.ZadanieKlasy1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        int wiek = person.getWiek();
        boolean czy = person.getCzyKobieta();

        person.setImie("Lukasz");
        String a = person.getImie();

        System.out.println(a + " "+ wiek+ " "+ czy);

        //#########################################

        FabrykaPojazdow fabrykaPojazdow = new FabrykaPojazdow();
        System.out.println(fabrykaPojazdow.getKolorPojazdu());

        System.out.println(fabrykaPojazdow.dajKolorPojazdu());
        fabrykaPojazdow.setKolorPojazdu("niebieski");

        System.out.println(fabrykaPojazdow.dajKolorPojazdu());
        //------------------------------------------------------

        if (fabrykaPojazdow.dajKolorPojazdu() == null){
            System.out.println("zmieniamy na inny...");
            fabrykaPojazdow.setKolorPojazdu("Pomarańczowy");
            System.out.println(fabrykaPojazdow.getKolorPojazdu());
        } else {
            System.out.println(fabrykaPojazdow.dajKolorPojazdu());
        }

        System.out.println(person); // mogę tak wyświetlić, ponieważ mam nadpisaną metodę "toString" w klasie Person


    }

}
