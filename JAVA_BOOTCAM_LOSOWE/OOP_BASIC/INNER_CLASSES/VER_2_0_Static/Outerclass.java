package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_2_0_Static;

public class Outerclass {

    private int idOuter;
    public String nameOuter;

                public static class InnerStaticClass{
                    private  int idInner;
                    public String nameInner;

                    Outerclass outerclass = new Outerclass(); // Obiekt klasy zewnetrznej utworzony w klasie zewnetrznej
                    // to nic nie da- i tak nie zobacze pól klasy zewnetrznej

                }

    public InnerStaticClass getInnerStaticClass (){
         InnerStaticClass innerStaticClass = new InnerStaticClass();
         innerStaticClass.nameInner = "imie wewnetrzne"; // w klasie zewnetrznej widze wszystkie pola klasy wewnetrznej

        return new InnerStaticClass();
    }

}
