package datatype;

public class Cats extends Animals{
    public Cats(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    public void walk(){
        System.out.println("Walk Fast");
    }
}
