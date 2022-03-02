package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.MEM;

import java.util.ArrayList;
import java.util.List;

public class MemsDataBase {

    private Mem mem;
    private List<Mem> mensFavoritList;
    private List<Mem> memsList;

    public MemsDataBase(){}

    public MemsDataBase(Mem mem, List<Mem> mensFavoritList) {
        this.mem = mem;
        this.memsList = new ArrayList<>();
        this.mensFavoritList= mensFavoritList;
    }

    public static List<Mem> addMem(Mem mem){
        List<Mem> list = new ArrayList<>();
        list.add(mem);
        return list;
    }
    public static List<Mem> returnFavoriteList(List<Mem> mems){
        List<Mem> favorite = new ArrayList<>();
        for (Mem mem : mems) {
            if (mem.isFavorite())
                favorite.add(mem);
        }
        return favorite;
        }


}
