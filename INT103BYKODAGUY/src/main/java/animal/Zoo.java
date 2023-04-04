package animal;

import java.util.Arrays;

public class Zoo {
    private Object[] animals;
    private int count;

    public Zoo(Object[] animals) {
        this.animals = animals;
        count = animals.length;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", count=" + count +
                '}';
    }
}
