package movement;

import animals.LandAnimal;

public class AnimalsMovement {
    public <T extends LandAnimal> void go(T animal){
        animal.move();
    }
}
