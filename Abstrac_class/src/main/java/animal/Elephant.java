package animal;

public class Elephant extends Mammal {
    private final int NOF_LEG = 4;

    public Elephant(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void pup() {
        System.out.println("Elephant goes EEHHHEH");
    }
    public void roar(){
        System.out.println("Elephant goes ROARRRRR");
    }
}
