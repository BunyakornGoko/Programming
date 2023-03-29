package people;

public class Students extends Person implements crying {
    public Students(String name, int age) {
        super(name, age);
    }
    public void crying(){
        System.out.println("TTTTTTTTT");
    }
}
