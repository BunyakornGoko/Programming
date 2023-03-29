package org.example;
import people.Person;
import people.Students;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Bunyakorn",19,"11111111111111");
        Students std1 = new Students("Siri",29,"123475809684",984327);
        p1.Saymyname();
        std1.Saymyname();
    }
}