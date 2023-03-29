package org.example;
import people.*;
public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Fongbeer",19,150);
        System.out.println("My name is " + s1.getName());
        System.out.println(s1.getName() + " " + "has a " + s1.funny() + " " + "voice");
        System.out.println(s1.toString());

        Santa s2 = new Santa("Tonnam",20,180,50);
        System.out.println("Santa has a " + s2.funny() + " "+"voice");
        s1.sosad();
        s2.sosad();
        System.out.println("------------");
        Mygeneric<String> type = new Mygeneric("Goko");
        System.out.println(type.getT());
    }
}