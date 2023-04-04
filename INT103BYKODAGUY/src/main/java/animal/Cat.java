package animal;

import color.Color;

public class Cat extends Animal{
    public Cat(String name , Color color) {
        super(4,name,color);

    }
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
