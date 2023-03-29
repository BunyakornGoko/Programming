package org.example;

import movement.*;
import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animals movement");
        AnimalsMovement animalsMovement = new AnimalsMovement();
        animalsMovement.go(new LandAnimal());
        animalsMovement.go(new Pig());
        animalsMovement.go(new Horse());

        System.out.println("---------------------");
        System.out.println("Wildcard");
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Animal());
        animalList.add(new Animal());

        List<LandAnimal> landanimalslist = new ArrayList<LandAnimal>();
        landanimalslist.add(new LandAnimal());
        landanimalslist.add(new LandAnimal());

        List<WaterAnimal> waterAnimalsList = new ArrayList<WaterAnimal>();
        waterAnimalsList.add(new WaterAnimal());

        AnimalShowCaseUpperbound animalShowcase = new AnimalShowCaseUpperbound();
        animalShowcase.show(landanimalslist);
        System.out.println("-----------------------");
        System.out.println("AnimalsShowcaseLowerbound");

        List<Horse> hourselist = new ArrayList<Horse>();
        hourselist.add(new Horse());

        List<Pig> piglist = new ArrayList<Pig>();
        piglist.add(new Pig());

        AnimalShowCaseLowerbound animalShowCase = new AnimalShowCaseLowerbound();
        animalShowCase.show(animalList);
        animalShowCase.show(landanimalslist);

    }
}