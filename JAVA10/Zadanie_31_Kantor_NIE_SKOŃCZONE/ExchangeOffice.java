package com.company.JAVA10.Zadanie_31_Kantor_NIE_SKOŃCZONE;

import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

    private Map<Currency, Double> availableFounds;

    public ExchangeOffice(double startFounds) {
        this.availableFounds = availableFounds = new HashMap<>();

        for (Currency currency : Currency.values()) {
            availableFounds.put(currency, startFounds);
        }
    }

    public void showFunds() {
        System.out.println("Current founds: ");

        for (Map.Entry<Currency, Double> entry : availableFounds.entrySet()) {
            Currency key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(value + " " + key.getName());
        }
    }

    public void exchange(double amount, Currency from, Currency to) {
        double available = availableFounds.get(to);
        double needed = amount * 0.8 * CurrencyConverter.convert(from, to);

        if (available >= needed) {
            // todo wypłać i zminiejsz obecne środki
            availableFounds.put(from, availableFounds.get(from) + amount);
            availableFounds.put(to, availableFounds.get(to) - needed);
        } else {
            System.out.println("Cannot exchange" + amount + "" +from.getName()
                    + "to" + needed + " " + " " + to.getName() + "insuffiecient found" );
        }
    }

}
