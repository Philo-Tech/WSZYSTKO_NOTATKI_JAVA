package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.GENERYKI.Zad1;



public class EntryData<X> {
    private X data;

    public EntryData(X data){
        this.data = data;
    }

    public X getEntryData(){
        return data;
    }
}
