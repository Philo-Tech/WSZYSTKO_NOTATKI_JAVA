package com.company.JAVA10.Zadanie_31_Kantor_NIE_SKOŃCZONE;

public class Main {
    public static void main(String[] args) {

        // CurrencyConverter.convert(Currency.PLN, Currency.USD);

        ExchangeOffice office = new ExchangeOffice(1000);

        office.showFunds();
    }
}
