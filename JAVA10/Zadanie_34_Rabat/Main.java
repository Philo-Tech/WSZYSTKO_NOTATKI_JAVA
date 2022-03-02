package com.company.JAVA10.Zadanie_34_Rabat;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();

        articles.add(new Article("Shower Gel", 23.50f, 0.90f));
        articles.add(new Article("Soup", 2.50f, 0.80f));
        articles.add(new Article("Domestos", 20.50f, 0.60f));

        for (Article article : articles) {
            for (int i = 0; i < article.getDiscounts().length; i++) {
                float priceWithMargin = article.getPrice() * (1 + article.getMargin());
                float discountValue = priceWithMargin * article.getDiscounts()[i];
                float finalPrice = priceWithMargin - discountValue;
                article.setPrice(finalPrice);
                System.out.println(article);
            }
        }
    }
}
