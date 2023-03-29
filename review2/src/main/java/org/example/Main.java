package org.example;
import students.*;
public class Main {
    public static void main(String[] args) {
        swapbottle();
        ChangeDatatype();
        UseIfElse();
    }
    public static void swapbottle(){
        int a = 10;
        int b = 5;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static  void ChangeDatatype(){
        int x = 32000;
        short y = (short) x;
        System.out.println(y);

        int z = 30;
        double d1 = z;
        System.out.println("Change to : " + d1);
    }
    public static void UseIfElse(){
        String grade;
        int point = 75;

        if(point >=80){
            grade = "A";
        } else if (point >=75) {
            grade = "B+";
        } else if (point >= 70) {
            grade = "B";
        } else if (point >= 65) {
            grade = "C+";
        }else if (point >= 60){
            grade = "C";
        } else if (point >= 55) {
            grade = "D+";
        } else if (point >= 50) {
            grade = "D";
        }else {
            grade = "F";
        }
        switch (grade){
            case "A" -> System.out.println("You got the A grade" + "\nYou have point : " + point);
            case "B+" -> System.out.println("You got the B+ grade" + "\nYou have point : " + point);
            case "B" -> System.out.println("You got the B grade" +"\nYou have point : " + point);
            case "C+" -> System.out.println("You got the C+ grade" +"\nYou have point : " + point);
            case "C" -> System.out.println("You got the C grade" +"\nYou have point : " + point);
            case "D+" -> System.out.println("You got the D+ grade" +"\nYou have point : " + point);
            case "D" -> System.out.println("You got the D grade" +"\nYou have point : " + point);
        }
    }
}