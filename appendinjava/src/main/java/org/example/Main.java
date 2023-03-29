package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        sb();
    }
    public static void sb(){
        System.out.println("StringBuilder!");
        StringBuilder sb1 = new StringBuilder("Bunyakorn");
        sb1.append(" Pornsombatpaibool");
        System.out.println(sb1.toString());
    }
}