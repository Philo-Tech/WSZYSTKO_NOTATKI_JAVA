package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KOLEKCJE;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    List<String> lista = new ArrayList<>();

    String s1 = "Tomek";
    String s2 = "Tomek2";
    String s3 = "Tomek3";

    lista.add(s3);
    lista.add(s1);
    lista.add(s2);
    lista.add(s3);
    lista.addAll(Arrays.asList(s3,s1,s2,s3));

    System.out.println(lista);
        System.out.println(lista.size());
    lista.remove(1);
        System.out.println(lista.contains("Tomek"));

        System.out.println(lista);
        System.out.println(lista.size());
        //lista.clear();
        System.out.println(lista + " " + lista.size());
        System.out.println(lista.contains("Tomek"));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(1,2,3,5,4,7,5,6,5,4,3,7,0));
        System.out.println(hashSet);

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(3," Trzy");
        hashMap.put(4," cztery");
        hashMap.put(2," dwa");
        hashMap.put(1," jeden");

        System.out.println(hashMap);

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3," Trzy");
        linkedHashMap.put(4," cztery");
        linkedHashMap.put(2," dwa");
        linkedHashMap.put(1," jeden");
        System.out.println(linkedHashMap);

        Collections.sort(lista);
        System.out.println(lista);

        for(String user : lista){
            System.out.println(user);
        }

        Set<Integer> lotto = new TreeSet<>();

        Random random = new Random();
        while (lotto.size() <6){
            lotto.add(random.nextInt(49 ) + 1);// wg dokumentacji Random losuje do "bound -1". Nasz +1 przesuwa zakres na 0-49
        }
        System.out.println("Wylosowano: " + lotto);




































}}
