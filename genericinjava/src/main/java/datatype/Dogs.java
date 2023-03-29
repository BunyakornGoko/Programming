package datatype;

public class Dogs extends Animals{
    public Dogs(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    public void walk(){
        System.out.println("Walk Fast");
    }
}
