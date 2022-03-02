package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MEM;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mem mem = new Mem("jakis mem","1",true,"onet.pl");
        Mem mem1 = new Mem("jakis mem","0",false,"onet.pl");
        Mem mem2 = new Mem("jakis mem","11",true,"onet.pl");
        Mem mem3 = new Mem("jakis mem","0",false,"onet.pl");
        Mem mem4 = new Mem("jakis mem","111",true,"onet.pl");

        List<Mem> list = new ArrayList<>();
        list.add(mem);
        list.add(mem1);
        list.add(mem1);
        list.add(mem2);
        list.add(mem3);
        list.add(mem4);

        System.out.println(MemsDataBase.returnFavoriteList(list));
    }
}
