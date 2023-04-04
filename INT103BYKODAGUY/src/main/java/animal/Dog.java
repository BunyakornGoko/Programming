package animal;

import color.Color;

public class Dog extends Animal{
    public Dog(String name , Color color) {
        super(4, name , color);
    }

    @Override
    public void makeSound() {
        System.out.println("Hong Hong");
    }
}
