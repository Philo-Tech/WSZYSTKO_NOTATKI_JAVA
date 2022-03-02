package com.company.JAVA_STUDIA_NOWE.Zadanie5_gra1;

public class Wojownik extends Postac {


        private double silaUderzenia;
        private double trwaloscPancerza;


        public Wojownik(String nazwa, int hp, String odzew) {
            super(nazwa, hp, odzew);

            this.silaUderzenia = new ParametryGry().getPoczatkowaSilaUderzeniaWojownika();
            this.trwaloscPancerza = new ParametryGry().getPoczatkowaTrwaloscPancerzaWojownika();
        }

        public void atak(){
            this.silaUderzenia -= new ParametryGry().getSpadekSilyUderzeniaWojownika();
            this.trwaloscPancerza = new ParametryGry().getSpadekTrwalosciPancerzaWojownika();
        }
}

