package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.PROJEKT_GRNDMOTHER;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ProductList {
    // pod skalowalność. rozwój

    private File productListFile;
    private List<Product> productList;

    public ProductList(String pathToFile) throws IOException {
        productListFile = new File(pathToFile);    //na podstawie ścieżki, inicjalizuję pole
        productList = new ArrayList<>();   // ArrayList, ponieważ listę tworzę tylko raz i często będę się odwoływał, ale nie będę usuwał
        // nie używam Set-a, ponieważ wiem, że mogą wystąpić powtórzenia
        // skoro będę przechowywał Produkty w liście i wiem, że używam Kolekcji, to wracam do Klasy Produkt i implementuje metody: equals() oraz hashCode(),
        // żeby zoptymalizowaćdziłąnie Kolekcji

        startParsing();

        // metodę uruchamiam z poziomu konstruktora, ponieważ chcę, żeby moja Klasa  była przeznaczona do użytku i już po uruchomieniu Konstruktora, nie trzeba było uruchamiać żadnej innej metody, żeby ona działała.
        // Bo jeżeli, ktoś zapomni urcuhomoć metody "parseProductListFromString", z zewnątrz, to nasza Klasa będzie całkowicie niefunkcjonalna, ponieważ wszystko będzie "nulle-em"
        // Konstruktor czyni Klasę w pełni funkcjonalną, dlatego muszę, tę metodę, uruchomoć z poziomu Konstruktora
        // i przekazując, jako argument, nasz plik
        // Ta metoda rzuca wyjątkiem IOException, więc jestem zmuszony, żeby na tym etapie jej jeszcze nie obsługiwać tego błędu, więc przekazuję ten wyjątek dalej. Przekaże go w miejsce, gdzie będę tworzył ProductList-ę,
        // czyli Konstruktor będzie oznaczony jako rzucający wyjątek, ale tutaj nie otaczamy "try...catch"

    }

    private void startParsing() throws IOException, IllegalStateException {
        String content = Utils.readFileContent(productListFile);
        if (checkFileContent(content)){
            parseProductListFromString(content);
        } else {
            throw new IllegalStateException("Incorrect contant of file");
        }
    }

    // sprawdza czy zawartość pliku jest prawidłowa
    private boolean checkFileContent(String content){
        return Pattern.matches("."/*"([a-zA-ZśćżźęłąóŹ]+:[0-9]+:([0-9]+.?[0-9]*)+//+)+""([A-Za-złąćźżąęóĄŻŹĘÓ]+:[0-9]+:([0-9]+(\\.[0-9]+)?)/)*([A-Za-złąćźżąęóĄŻŹĘÓ]+:[0-9]+:([0-9]+(\\.[0-9]+)?))+"*/, content);
    }

    // metoda odczytania produktów z pliku oraz zamiana tych informacji na "productList"

    private void parseProductListFromString(String productsString) { // metodę uruchamiam z poziomu konstruktora

        // poszczególne Stringi rozdzielone są "sleszem", więc tworzę tablicę Stringów i "splituję" po sleszu
        String[] products = productsString.split("/");

        for (String product : products) {
            String[] oneProduct = product.split(":"); // splitowanie po ":"
            productList.add(new Product(oneProduct[0], Integer.parseInt(oneProduct[1]), Double.parseDouble(oneProduct[2]))); // mając listę poszczególnych Produktów, tworzę nowy Produkt dodając go od razu do listy od razu z nawą argumetów Konstruktora Product

        }

    }

    // metoda do szukania prouktu ktory wystepuje naczesciej. Nie przyjmuje niczego jako argument, ponieważ wszystkie potrzebne dane już mamy

    public Product getMaxProduct() {
        Product productMaxCount = productList.get(0);

        for (Product product : productList) {
            if (productMaxCount.getCount() < product.getCount()) { // jeżeli produktu maksymalnego jest mniej niż produktu aktualnie jest,
                productMaxCount = product;                     // to znaleźliśmy nowy maksymalny Produkt
            }
        }
        return productMaxCount;
    }

    // produkt o największej cenie
    public Product getMAxPriceProduct() {

        Product productMaxPrice = productList.get(0);

        for (Product product : productList) {
            if (productMaxPrice.getPrice() < product.getPrice()) { // jeżeli produkt jest tańszy
                productMaxPrice = product;                     // to znaleźliśmy nowy najdroższy Produkt
            }
        }
        return productMaxPrice;
    }

    // najwyższa kwota jaką zapłacimy
    public double getTotalPrice() {
        double price = 0;
        for (Product product : productList) {
            price += product.getPrice() * product.getCount();
        }
        return price;
    }

    // czy w lisćie występują podwojenia

    public boolean hasListDoubleProduct() {
        for (Product product : productList) {
            for (Product product1 : productList) {
                if (product.getName().equals(product.getName())) {
                    return true;

                }
            }

        }
        return false;
    }
}
