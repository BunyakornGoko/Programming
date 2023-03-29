package org.example;

import people.Students;

public class Main {
    public static void main(String[] args) {
        Students p1 = new Students("Goko",19);
        System.out.println(p1.toString());
        p1.crying();
    }
}