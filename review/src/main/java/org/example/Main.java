package org.example;
import person.*;
public class Main {
    public static void main(String[] args) {
        TestPerson();
    }
    public static void TestPerson(){
        Person p1 = new Person("Bunyakorn","Pornsombatpaibool",2003,19);
        Person p2 = new Person("Bothboth","Momo",2003,19);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}