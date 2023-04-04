package animal;

import color.Color;

public abstract class Animal {
    private int leg;
    private String name;
    private Color color;

    public Animal(int leg , String name , Color color) {
        this.leg = leg;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public int getLeg() {
        return leg;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "leg=" + leg +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    public abstract void makeSound();
}
