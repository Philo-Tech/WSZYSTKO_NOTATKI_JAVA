package com.company.JAVA10.Zadanie_31_Kantor_NIE_SKOŃCZONE;

public enum Currency {

    USD("USD"),  // "id" ze strony, z której pobieramy, musi zgadzać się z wartością (czyli to co w nawiasie)
    PLN("PLN"),
    EUR("EUR"),
    RUB("RUB"),
    GBP("GBP");

    private String name;  // nazwa waluty

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
