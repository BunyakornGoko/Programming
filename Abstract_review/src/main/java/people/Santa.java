package people;

public class Santa extends Person implements funny , sosad{
    private int weight;

    public Santa(String name, int age, int height, int weight) {
        super(name, age, height);
        this.weight = weight;
    }

    @Override
    public String funny() {
        return "HoHoHoHoHo";
    }

    @Override
    public void sosad() {
        System.out.println("Hmmmmmmmmmm");
    }
}
