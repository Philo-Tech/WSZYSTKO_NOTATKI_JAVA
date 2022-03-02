package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class ProceduraMedycznaLekarza {

    private Lekarz wykonawca; // jaki lekarz jest wykonawcą tej procedury medycznej
    private Pacjent pacjent;
    private String opisProcedury;

    public ProceduraMedycznaLekarza(Lekarz wykonawca, Pacjent pacjent, String opisProcedury){
        this.wykonawca = wykonawca;
        this.pacjent=pacjent;
        this.opisProcedury=opisProcedury;
    }

    public Lekarz getWykonawca(){
        return this.wykonawca;
    }
    public Pacjent getPacjent(){
        return this.pacjent;
    }
    public String getOpisProcedury(){
        return opisProcedury;
    }


}
