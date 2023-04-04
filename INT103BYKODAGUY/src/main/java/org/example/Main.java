package org.example;
import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Zoo;
import color.Color;

public class Main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Main().new Printer();
        printer.print();
        printer.print("World");

        Animal dog1 = new Dog("Goko",Color.RED);
        dog1.makeSound();
        Animal dog2 = new Dog("JJ",Color.BLUE);
        Animal cat1 = new Cat("Both",Color.GREEN);
        Animal cat2 = new Cat("PP",Color.BLUE);
        Zoo zoo = new Zoo(new Object[] {dog1,dog2,cat1,cat2});
        System.out.println(zoo);


        testEnum();
    }
    class Printer{
        public void print(){
            System.out.println("Hello");
        }
        public void print(String str){
            System.out.println("Hello" +" "+ str);
        }

        public void print(int number){
            System.out.println("Hello" +" "+ number);
        }
    }
    static void testEnum(){
        Color red = Color.RED;
        System.out.println(red);
        System.out.println(red.getColorName());
        Animal frame = new Dog("Frame",Color.BLUE);
        System.out.println(frame.toString());

    }
}
