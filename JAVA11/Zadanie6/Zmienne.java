package com.company.Zadanie6;

public class Zmienne {

    // public - jest widoczne w całym projekcie (pakiety, foldery, klasy, podklasy)
    // private - jest widoczna: klasa(TYLKO!).  Nigdzie więcej.
    // protected - widoczność: klasa, podklasa, pakiet (czyli folder). Nie jest widoczna publicznie
    // default - brak modyfikatora,  widoczność: klasa, pakiet.  Nie jest widoczna w podklasie(!)

    public String publicznaZmienna;
    protected String zmiennaProtected;
    String zmiennaBezModyfikatora;
    private String zmiennaPrywatna;

    public static final String ZMIENNA_FINALNA = "TajnySzyfrDoBazyDanych";

    // getter  --> żeby prywatna zmienna byłą dostępna gdzie indziej
    public String getZmiennaPrywatna(String zmiennaPrywatna){
        //return this.zmiennaPrywatna;
        return ustawSztucznieZmienną();
    }

    // setter   --> ustawienie zmiennej prywatnej
    public void setZmiennaPrywatna(String zmiennaPrywatna){
       this.zmiennaPrywatna = zmiennaPrywatna;

    }

    // metod prywatnych używamy, gdy chcemy ustawić jakieś dane klasy i nie chemy, aby ta metoda była modyfikowana
    private String ustawSztucznieZmienną(){
        return "jakiś napis";
    }

    // nie da się zmienic danej wchodzącej do metody. Możemy zmienić drugą zmienną
    private String metodaIzmiennejfinalnej(final String name, String secondName){
        secondName = "nowe nazwisko";
        return name;
    }

}
