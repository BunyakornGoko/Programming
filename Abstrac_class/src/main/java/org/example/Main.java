package org.example;
import animal.*;
public class Main {
    public static void main(String[] args) {
        Elephant Goko = new Elephant("Goko",1500);
        Elephant Jaja = new Elephant("Jaja",2000);
        Goko.pup();
        Goko.roar();
        Jaja.pup();
        Jaja.roar();
    }
}