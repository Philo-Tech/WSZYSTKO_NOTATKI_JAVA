package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class ProceduraMedycznaGeneryczna<T, K> {

    private T wykonawca; // jaki lekarz jest wykonawcą tej procedury medycznej
    private K odbiorca; // jakis pacjent, na którym wykonywana jest procedura, ale można podstawić co innego
    private String opisProcedury;

    public ProceduraMedycznaGeneryczna(T wykonawca, K odbiorca, String opisProcedury){
        this.wykonawca = wykonawca;
        this.odbiorca=odbiorca;
        this.opisProcedury=opisProcedury;
    }

    public T getWykonawca(){
        return this.wykonawca;
    }
    public K getOdbiorca(){
        return this.odbiorca;
    }
    public String getOpisProcedury(){
        return opisProcedury;
    }

}
