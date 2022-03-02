package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_1_0_Standard;

public class OuterClass {// jedna powinna być private

    public class InnerClass{
        public class SubInnerClass{}
    }

    public InnerClass getInnerClass(){
        return new InnerClass(); // zwróci obiekt klasy wewnętrznej
    }
}
