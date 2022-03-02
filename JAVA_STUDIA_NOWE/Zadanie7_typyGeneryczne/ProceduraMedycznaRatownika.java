package com.company.JAVA_STUDIA_NOWE.Zadanie7_typyGeneryczne;

public class ProceduraMedycznaRatownika {

    private RatownikMedyczny wykonawca; // jaki lekarz jest wykonawcą tej procedury medycznej
    private Pacjent pacjent;
    private String opisProcedury;

    public ProceduraMedycznaRatownika(RatownikMedyczny wykonawca, Pacjent pacjent, String opisProcedury){
        this.wykonawca = wykonawca;
        this.pacjent=pacjent;
        this.opisProcedury=opisProcedury;
    }

    public RatownikMedyczny getWykonawca(){
        return this.wykonawca;
    }
    public Pacjent getPacjent(){
        return this.pacjent;
    }
    public String getOpisProcedury(){
        return opisProcedury;
    }
}
