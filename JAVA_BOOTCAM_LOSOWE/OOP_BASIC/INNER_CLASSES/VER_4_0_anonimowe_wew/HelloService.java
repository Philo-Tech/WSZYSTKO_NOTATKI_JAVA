package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.INNER_CLASSES.VER_4_0_anonimowe_wew;

// interfejs funkcyjny, bo posiada tylko jedną metodę
// jak byśmy dodali drugą metodę, to pokaże błąd w adnotacji
// można go gdzieś wykorzystać jako Lambdę
@FunctionalInterface
public interface HelloService {
    void sayHello();
}
