package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.STRUMIENIE_LAMBDY.zad3x;

import java.util.Objects;

public class Person {

    String surName;

    public Person(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName);
    }
}
