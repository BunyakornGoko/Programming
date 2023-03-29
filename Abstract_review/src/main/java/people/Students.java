package people;

public class Students extends Person implements funny , sosad {
    public Students(String name, int age, int height) {
        super(name, age, height);
    }
    public String funny(){
        return "Hahahaha";
    }

    @Override
    public void sosad() {
        System.out.println("Hm~~~~");
    }
}
