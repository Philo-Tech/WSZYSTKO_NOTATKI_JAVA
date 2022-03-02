package com.company.JAVA10.Zadanie_29_Enum;

public enum Color {

    /** to Klasa parzechowująca zbior stałych o ograniczonej liczbie
     *  Enum służy do definiowania zbiorów o określonej liczbielementów
     * */

    // stałe - zbiór elementó tworzące opcje wyboru

    BLACK("12bdf"),
    WHITE("34AASM"),
    PURPLE("67YYHK");

    String colorCode; // ta zmienna nosi wartość, zależnie od wybranej stałej

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
