package org.example;
import person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Goko",15);
        Person b = new Person("Blue",16);
        Person c = new Person("Tonnam",19);
        Person d = new Person("P",30);
        Person e = new Person("Oak",46);

        List<Person> personList = Arrays.asList(a,b,c,d,e);

        //Use Lambda
        personList.stream()
                .map(person -> person.getAge())
                .forEach(System.out::println);
        System.out.println("---------------------");

        //Use Method Reference
        personList.stream()
                .map(Person::getAge)
                .forEach(System.out::println);

        //Use Lambda
        List<String> names = Arrays.asList("Bunyakorn","Kittapat","Perawait");
        names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println("---------------------");

        //Use Method Reference
        List<Person> newPersonList = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        //จะปริ้นชื่อเดิมซ้ำออกมา 5 ครั้ง
        personList.forEach(a::printMyName);

        System.out.println(newPersonList);
    }
}