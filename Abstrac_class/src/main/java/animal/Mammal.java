package animal;

public abstract class Mammal implements Pupable , Roarable {
    private String name;
    private int weight;

    public Mammal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public abstract void pup();

    @Override
    public abstract void roar();

}
