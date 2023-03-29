package org.example;
import java.util.Random;
import java.util.random.*;
public class Main {
    public static void main(String[] args) {
        WhileLoopandForloop();
    }
    public static void  WhileLoopandForloop(){
        int bottle1 = 1000 , bottle2 = 0;
        while (bottle1 > 0){
            int transplant = getRandomNumber(bottle1);
            bottle1 -= transplant;
            bottle2 += transplant;
            System.out.println("Transplant : " + transplant);
        }
        System.out.println("Bottle1 : " + bottle1);
        System.out.println("Bottle2 : " + bottle2);
        System.out.println("------------------------");

        int round = 10 , transplant = bottle2 / round;
        for(int i = 1;i <=round;i++){
            bottle2 -= transplant;
            bottle1 += transplant;
        }
        System.out.println("Tranplanted :" + transplant);
        System.out.println("Bottle1 : " + bottle1);
        System.out.println("Bottle2 : " + bottle2);
    }
    public static int getRandomNumber(int n){
        Random rand = new Random();
        return rand.nextInt(n+1) + 1;
    }
}