package org.example;
import datatype.Cats;
import datatype.Dogs;
import datatype.generic;
public class Main {
    public static void main(String[] args) {
        generic<String> Int1 = new generic<>("50");
        Int1.print();
        Int1.getType();
        System.out.println("---------------------------------------------------");
        Cats c1 = new Cats("Fongbeer",19,152,40);
        System.out.println(c1.toString());
        c1.setName("Fongnom");
        System.out.println(c1.toString());
        c1.walk();
        System.out.println("-----------------------------------------------------");

        Dogs d1 = new Dogs("Jum",5,30,7);
        System.out.println(d1.toString());
        d1.walk();
    }
}