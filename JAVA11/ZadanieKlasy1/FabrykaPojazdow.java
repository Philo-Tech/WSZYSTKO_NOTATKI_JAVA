package com.company.ZadanieKlasy1;

public class FabrykaPojazdow {

    private String kolorPojazdu = "zielony";

    public String getKolorPojazdu(){
        return kolorPojazdu;
    }

    public void setKolorPojazdu(String kolorPojazdu){
        this.kolorPojazdu = kolorPojazdu;
    }

    public String dajKolorPojazdu(){
        if(this.kolorPojazdu.equals("niebieski")){
            return null; // skończ metodę i nic nie rób dalej
        }
        return this.kolorPojazdu;
    }

}
